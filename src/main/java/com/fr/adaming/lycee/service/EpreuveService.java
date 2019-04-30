package com.fr.adaming.lycee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fr.adaming.lycee.dao.IEpreuveDao;
import com.fr.adaming.lycee.entities.Epreuve;

@Service
public class EpreuveService implements IService<Epreuve> {

	
	@Autowired
	private IEpreuveDao epreuveDao;
	
	@Override
	public Epreuve findOneById(Long id) {
		// TODO Auto-generated method stub
		return epreuveDao.getOne(id);
	}

	@Override
	public Epreuve save(Epreuve p) {
		// TODO Auto-generated method stub
		return epreuveDao.save(p);
	}

	@Override
	public void delete(Epreuve p) {
		// TODO Auto-generated method stub
		epreuveDao.delete(p);
	}

	@Override
	public List<Epreuve> getAll() {
		// TODO Auto-generated method stub
		return epreuveDao.findAll();
	}

}
