package com.fr.adaming.lycee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.fr.adaming.lycee.dao.IMatiereDao;
import com.fr.adaming.lycee.entities.Matiere;

@Service
public class matiereService implements IService<Matiere> {
	@Autowired
	private IMatiereDao matiereDao;

	@Override
	public Matiere findOneById(Long id) {
		// TODO Auto-generated method stub
		return matiereDao.getOne(id);
	}

	@Override
	public Matiere save(Matiere p) {
		// TODO Auto-generated method stub
		return matiereDao.save(p);
	}

	@Override
	public void delete(Matiere p) {
		// TODO Auto-generated method stub
		matiereDao.delete(p);
	}

	@Override
	public List<Matiere> getAll() {
		// TODO Auto-generated method stub
		return matiereDao.findAll();
	}
}
