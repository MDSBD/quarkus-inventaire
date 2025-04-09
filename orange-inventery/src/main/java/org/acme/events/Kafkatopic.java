package org.acme.events;

import org.acme.dto.PrdDto;
import org.eclipse.microprofile.reactive.messaging.Incoming;

public class Kafkatopic {

	
	@Incoming("my-topic-consumer")
	public void lire(PrdDto info)
	{
		System.out.println("recu ..."+info);
	}
}
