package com.fr.adaming.lycee.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fr.adaming.lycee.entities.Matiere;
import com.fr.adaming.lycee.service.IService;
@RestController
public class MatiereController {
	@Autowired
	private IService<Matiere> MatiereServ;

	@GetMapping("/Matiere/get/{id}")
	public Matiere findOneById(@PathVariable Long id) {
		return MatiereServ.findOneById(id);
	}

	@PostMapping("/Matiere/save")
	public Matiere save(@RequestBody Matiere p) {
		return MatiereServ.save(p);
	}

	@DeleteMapping("/Matiere/delete")
	public void delete(@RequestBody Matiere p) {
		MatiereServ.delete(p);
	}

	@GetMapping("/Matiere/getall")
	public List<Matiere> getAll() {
		return MatiereServ.getAll();
	}
}
