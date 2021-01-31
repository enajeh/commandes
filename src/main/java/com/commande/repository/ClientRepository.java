package com.commande.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.commande.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer>{

}
