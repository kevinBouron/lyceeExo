package com.fr.adaming.lycee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.fr.adaming.lycee.dao.IEleveDao;
import com.fr.adaming.lycee.entities.Eleve;

@Service
public class EleveService implements IService<Eleve>{

	
	@Autowired
	private IEleveDao eleveDao;
	@Override
	public Eleve findOneById(Long id) {
		// TODO Auto-generated method stub
		return eleveDao.getOne(id);
	}

	@Override
	public Eleve save(Eleve p) {
		// TODO Auto-generated method stub
		return eleveDao.save(p);
	}

	@Override
	public void delete(Eleve p) {
		// TODO Auto-generated method stub
		eleveDao.delete(p);
	}

	@Override
	public List<Eleve> getAll() {
		// TODO Auto-generated method stub
		return eleveDao.findAll();
	}

}
