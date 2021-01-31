package com.commande.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "COMMANDE")
public class Commande {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Date datecommande;
	private double total;
	
	@ManyToOne
	@JoinColumn(name = "idClient")
	private Client client;
	
	
	@ManyToMany
	@JoinTable(
			  name = "commande_produit", 
			  joinColumns = @JoinColumn(name = "idCommande"),
			  inverseJoinColumns = @JoinColumn(name = "idProduit"))
	private Set<Produit> produits;
	
}
