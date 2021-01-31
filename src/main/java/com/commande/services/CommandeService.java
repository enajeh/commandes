package com.commande.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commande.model.Commande;
import com.commande.repository.CommandeRepository;

@Service
public class CommandeService {
	
	@Autowired
	private CommandeRepository commandeRepository;
	
	
	public List<Commande> findAll() {
		return commandeRepository.findAll();
	}

	public Commande insert( Commande c) {
		return commandeRepository.save(c);
	}

}
