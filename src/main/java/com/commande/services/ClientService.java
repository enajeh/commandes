package com.commande.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commande.model.Client;
import com.commande.repository.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository clientRepository;
	
	
	public Client create (Client c) {
		return clientRepository.save(c);
	}
	
	public List<Client> getAll() {
		return clientRepository.findAll();
	}

}
