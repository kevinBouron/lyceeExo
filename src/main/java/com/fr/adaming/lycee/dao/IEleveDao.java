package com.fr.adaming.lycee.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.fr.adaming.lycee.entities.Eleve;

@Repository
public interface IEleveDao extends JpaRepository<Eleve, Long>{


}
