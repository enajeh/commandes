package com.commande.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.commande.model.Commande;

@Repository
public interface CommandeRepository extends JpaRepository<Commande, Integer>{

}
