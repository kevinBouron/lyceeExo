package com.fr.adaming.lycee.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Epreuve implements Serializable  {

	@Id @GeneratedValue
	@Column(name="id_epr")
	private Long Id;
	private Date date;
	
	@OneToOne(mappedBy="epreuve")
	private Matiere matiere;
	
	@ManyToMany
	private List<Eleve> eleves;
	
	@ManyToOne
	private laboratoire laboratoire;



	public Epreuve(Date date, Matiere matiere, com.fr.adaming.lycee.entities.laboratoire laboratoire) {
		super();
		this.date = date;
		this.matiere = matiere;
		this.laboratoire = laboratoire;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Matiere getMatiere() {
		return matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}

	public List<Eleve> getEleves() {
		return eleves;
	}

	public void setEleves(List<Eleve> eleves) {
		this.eleves = eleves;
	}

	public laboratoire getLaboratoire() {
		return laboratoire;
	}

	public void setLaboratoire(laboratoire laboratoire) {
		this.laboratoire = laboratoire;
	}
	 
	
}
