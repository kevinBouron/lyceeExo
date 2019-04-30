package com.fr.adaming.lycee.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;



@Entity

public class Eleve implements Serializable {

	@Id
	@GeneratedValue
	@Column(name="id_ele")
	private Long idEle;
	private String nom;
	private String prenom;
	private Date date_naissance;

	@ManyToOne
	Section section;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Convocation", 
	joinColumns = @JoinColumn(name = "id_ele", referencedColumnName = "id_ele"), 
	inverseJoinColumns = @JoinColumn(name = "id_epr", referencedColumnName = "id_epr")
	)
	List<Epreuve> epreuves;

	public Eleve(String nom, String prenom, Date date_naissance, Section section) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.date_naissance = date_naissance;
		this.section = section;
	
	}

	public Long getIdEle() {
		return idEle;
	}

	public void setIdEle(Long idEle) {
		this.idEle = idEle;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDate_naissance() {
		return date_naissance;
	}

	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	public List<Epreuve> getEpreuves() {
		return epreuves;
	}

	public void setEpreuves(List<Epreuve> epreuves) {
		this.epreuves = epreuves;
	}

	@Override
	public String toString() {
		return "Eleve [idEle=" + idEle + ", nom=" + nom + ", prenom=" + prenom + ", date_naissance=" + date_naissance
				+ ", section=" + section + ", epreuves=" + epreuves + "]";
	}

}
