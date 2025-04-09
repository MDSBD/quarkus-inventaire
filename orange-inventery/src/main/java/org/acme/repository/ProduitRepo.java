package org.acme.repository;

import org.acme.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public interface ProduitRepo extends JpaRepository<Produit, Long>{

	 
}
