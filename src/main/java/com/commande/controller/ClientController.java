package com.commande.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.commande.model.Client;
import com.commande.services.ClientService;

@RestController
@RequestMapping("/clients")
public class ClientController {
	
	@Autowired
	private ClientService clientService;
	
	@PostMapping
	public Client insertClient (@RequestBody Client client) {
		return clientService.create( client );
	}
	
	@GetMapping
	public List<Client> getAll () {
		return clientService.getAll();
	}

}
