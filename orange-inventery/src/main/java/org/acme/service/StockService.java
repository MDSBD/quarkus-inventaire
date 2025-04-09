package org.acme.service;

import java.util.List;
import java.util.Optional;

import org.acme.model.Produit;
import org.acme.repository.ProduitRepo;
import org.springframework.beans.factory.annotation.Autowired;

import jakarta.enterprise.context.ApplicationScoped;
import net.bytebuddy.asm.Advice.Return;

@ApplicationScoped
public class StockService {

	@Autowired
	ProduitRepo pRepo;
	
	public Produit addprd(Produit p)
	{
		return pRepo.save(p);
	}
	
	public Optional<Produit> findPrdbyId(long id)
	{
		return pRepo.findById(id);
	}
	
	
	public List<Produit> allprd()
	{
		return pRepo.findAll();
	}
}
