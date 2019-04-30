package com.fr.adaming.lycee.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fr.adaming.lycee.entities.Section;
import com.fr.adaming.lycee.service.IService;

@RestController
public class SectionController {

	@Autowired
	private IService<Section> SectionServ;

	@GetMapping("/Section/get/{id}")
	public Section findOneById(@PathVariable Long id) {
		return SectionServ.findOneById(id);
	}

	@PostMapping("/Section/save")
	public Section save(@RequestBody Section p) {
		return SectionServ.save(p);
	}

	@DeleteMapping("/Section/delete")
	public void delete(@RequestBody Section p) {
		SectionServ.delete(p);
	}

	@GetMapping("/Section/getall")
	public List<Section> getAll() {
		return SectionServ.getAll();
	}
}
