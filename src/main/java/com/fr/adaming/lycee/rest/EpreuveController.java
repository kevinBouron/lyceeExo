package com.fr.adaming.lycee.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fr.adaming.lycee.entities.Epreuve;
import com.fr.adaming.lycee.service.IService;
@RestController
public class EpreuveController {
	@Autowired
	private IService<Epreuve> EpreuveServ;

	@GetMapping("/Epreuve/get/{id}")
	public Epreuve findOneById(@PathVariable Long id) {
		return EpreuveServ.findOneById(id);
	}

	@PostMapping("/Epreuve/save")
	public Epreuve save(@RequestBody Epreuve p) {
		return EpreuveServ.save(p);
	}

	@DeleteMapping("/Epreuve/delete")
	public void delete(@RequestBody Epreuve p) {
		EpreuveServ.delete(p);
	}

	@GetMapping("/Epreuve/getall")
	public List<Epreuve> getAll() {
		return EpreuveServ.getAll();
	}
}
