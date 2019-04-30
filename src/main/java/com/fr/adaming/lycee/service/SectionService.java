package com.fr.adaming.lycee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fr.adaming.lycee.dao.IMatiereDao;
import com.fr.adaming.lycee.dao.ISectionDao;
import com.fr.adaming.lycee.entities.Section;

@Service
public class SectionService implements IService<Section>{

	@Autowired
	private ISectionDao sectionDao;

	@Override
	public Section findOneById(Long id) {
		// TODO Auto-generated method stub
		return sectionDao.getOne(id);
	}

	@Override
	public Section save(Section p) {
		// TODO Auto-generated method stub
		return sectionDao.save(p);
	}

	@Override
	public void delete(Section p) {
		// TODO Auto-generated method stub
		sectionDao.delete(p);
	}

	@Override
	public List<Section> getAll() {
		// TODO Auto-generated method stub
		return sectionDao.findAll();
	}
}
