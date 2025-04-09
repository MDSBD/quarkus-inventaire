package org.acme.events;

import java.util.Optional;

import org.acme.dto.PrdDto;
import org.acme.dto.PrdDtoResponse;
import org.acme.model.Produit;
import org.acme.service.StockService;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.eclipse.microprofile.reactive.messaging.Outgoing;

import jakarta.inject.Inject;

public class Kafkatopic {

	@Inject
	StockService service;
	
	
	 @Inject
	   @Channel("inventaire-topic")  
	   Emitter<PrdDtoResponse> messageEmitter;
	
	@Incoming("order-topic-consumer")
	@Outgoing("inventaire-topic")
	public void lire(PrdDto info)
	{
		System.out.println("recu ..."+info.getIdp()+" : "+ info.getQte());
		
		Optional<Produit> p = service.findPrdbyId(info.getIdp());
		if(p.isPresent())
		{
			int qte=p.get().getQte();
			if(qte>info.getQte())
			{
				//dispo
				PrdDtoResponse pd=new PrdDtoResponse(info.getIdp(), true);
				messageEmitter.send(pd);
			}else {
				{
					PrdDtoResponse pd=new PrdDtoResponse(info.getIdp(), false);
							messageEmitter.send(pd);
				}
			}
		}
	}
}
