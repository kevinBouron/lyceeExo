package com.fr.adaming.lycee.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fr.adaming.lycee.entities.laboratoire;
import com.fr.adaming.lycee.service.IService;
@RestController
public class LaboController {

	@Autowired
	private IService<laboratoire> LaboServ;

	@GetMapping("/Labo/get/{id}")
	public laboratoire findOneById(@PathVariable Long id) {
		return LaboServ.findOneById(id);
	}

	@PostMapping("/Labo/save")
	public laboratoire save(@RequestBody laboratoire p) {
		return LaboServ.save(p);
	}

	@DeleteMapping("/Labo/delete")
	public void delete(@RequestBody laboratoire p) {
		LaboServ.delete(p);
	}

	@GetMapping("/Labo/getall")
	public List<laboratoire> getAll() {
		return LaboServ.getAll();
	}
}
