package com.fr.adaming.lycee.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Matiere implements Serializable {

	@Id @GeneratedValue
	private Long code;
	private String libelle;
	private Float duree;
	private Float coeff;
	
	
	@OneToOne
	Epreuve epreuve;
	
	@ManyToOne
	Section section;

	
	
	public Matiere(String libelle, Float duree, Float coeff, Epreuve epreuve, Section section) {
		super();
		this.libelle = libelle;
		this.duree = duree;
		this.coeff = coeff;
		this.epreuve = epreuve;
		this.section = section;
	}

	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Float getDuree() {
		return duree;
	}

	public void setDuree(Float duree) {
		this.duree = duree;
	}

	public Float getCoeff() {
		return coeff;
	}

	public void setCoeff(Float coeff) {
		this.coeff = coeff;
	}

	public Epreuve getEpreuve() {
		return epreuve;
	}

	public void setEpreuve(Epreuve epreuve) {
		this.epreuve = epreuve;
	}

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	@Override
	public String toString() {
		return "Matiere [code=" + code + ", libelle=" + libelle + ", duree=" + duree + ", coeff=" + coeff + ", epreuve="
				+ epreuve + ", section=" + section + "]";
	}
	
	
	
}
