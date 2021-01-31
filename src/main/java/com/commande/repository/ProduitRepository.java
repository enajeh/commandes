package com.commande.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.commande.model.Produit;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Integer>{

}
