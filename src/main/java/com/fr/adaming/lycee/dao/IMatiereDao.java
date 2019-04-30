package com.fr.adaming.lycee.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



import com.fr.adaming.lycee.entities.Matiere;

@Repository
public interface IMatiereDao extends JpaRepository<Matiere, Long>{
	List<Matiere> findBycode(Long code);
}
