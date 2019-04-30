package com.fr.adaming.lycee.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class laboratoire implements Serializable {

	@Id @GeneratedValue
	private Long id;
	private String nom;
	private int nbre_ordi;
	
	@OneToMany(mappedBy="laboratoire")
	private List<Epreuve> epreuves;

	public laboratoire(String nom, int nbre_ordi) {
		super();
		this.nom = nom;
		this.nbre_ordi = nbre_ordi;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbre_ordi() {
		return nbre_ordi;
	}

	public void setNbre_ordi(int nbre_ordi) {
		this.nbre_ordi = nbre_ordi;
	}

	public List<Epreuve> getEpreuves() {
		return epreuves;
	}

	public void setEpreuves(List<Epreuve> epreuves) {
		this.epreuves = epreuves;
	}
	
}
