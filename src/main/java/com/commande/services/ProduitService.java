package com.commande.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commande.repository.ProduitRepository;

@Service
public class ProduitService {
	
	@Autowired
	private ProduitRepository produitRepository;

}
