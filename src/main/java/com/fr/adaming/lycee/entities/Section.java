package com.fr.adaming.lycee.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Section implements Serializable {
	
	@Id @GeneratedValue
	private Long Id;
	private String libelle;
	
	@OneToMany(mappedBy="section")
	List<Eleve> eleves;
	@OneToMany(mappedBy="section")
	List<Matiere> matieres;

	public Section(String libelle) {
		super();
	
		this.libelle = libelle;

	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public List<Eleve> getEleves() {
		return eleves;
	}

	public void setEleves(List<Eleve> eleves) {
		this.eleves = eleves;
	}

	public List<Matiere> getMatieres() {
		return matieres;
	}

	public void setMatieres(List<Matiere> matieres) {
		this.matieres = matieres;
	}





}
