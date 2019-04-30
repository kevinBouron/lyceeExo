package com.fr.adaming.lycee.service;

import java.util.List;


public interface IService<T> {
	T findOneById(Long id);
	T save(T p);
	void delete(T p);
	List<T> getAll();
}
