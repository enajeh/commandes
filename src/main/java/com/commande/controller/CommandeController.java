package com.commande.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.commande.model.Commande;
import com.commande.services.CommandeService;

@RestController
@RequestMapping("/commandes")
public class CommandeController {
	@Autowired
	private CommandeService commandeService;
	
	
	@GetMapping
	public List<Commande> getAllCommandes() {
		return commandeService.findAll();
	}

	@PostMapping
	public Commande createCommande(@RequestBody Commande commande) {
			return commandeService.insert(commande);
	}
}
