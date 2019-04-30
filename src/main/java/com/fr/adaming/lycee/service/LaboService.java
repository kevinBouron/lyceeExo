package com.fr.adaming.lycee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fr.adaming.lycee.dao.ILaboDao;
import com.fr.adaming.lycee.entities.laboratoire;
@Service
public class LaboService implements IService<laboratoire> {

	
	@Autowired
	private ILaboDao laboDao;
	@Override
	public laboratoire findOneById(Long id) {
		// TODO Auto-generated method stub
		return laboDao.getOne(id);
	}

	@Override
	public laboratoire save(laboratoire p) {
		// TODO Auto-generated method stub
		return laboDao.save(p);
	}

	@Override
	public void delete(laboratoire p) {
		// TODO Auto-generated method stub
		laboDao.delete(p);
	}

	@Override
	public List<laboratoire> getAll() {
		// TODO Auto-generated method stub
		return laboDao.findAll();
	}

}
