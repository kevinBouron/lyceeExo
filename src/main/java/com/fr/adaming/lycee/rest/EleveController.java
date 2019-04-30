package com.fr.adaming.lycee.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.fr.adaming.lycee.entities.Eleve;
import com.fr.adaming.lycee.service.IService;

@RestController
public class EleveController {

	@Autowired
	private IService<Eleve> eleveServ;

	@GetMapping("/eleve/get/{id}")
	public Eleve findOneById(@PathVariable Long id) {
		return eleveServ.findOneById(id);
	}

	@PostMapping("/eleve/save")
	public Eleve save(@RequestBody Eleve p) {
		return eleveServ.save(p);
	}

	@DeleteMapping("/eleve/delete")
	public void delete(@RequestBody Eleve p) {
		eleveServ.delete(p);
	}

	@GetMapping("/eleve/getall")
	public List<Eleve> getAll() {
		return eleveServ.getAll();
	}

}
