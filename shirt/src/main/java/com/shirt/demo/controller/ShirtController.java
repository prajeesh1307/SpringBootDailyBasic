package com.shirt.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shirt.demo.model.Shirt;
import com.shirt.demo.service.ShirtService;

@RestController
@RequestMapping("/api/Shirt")
public class ShirtController {
	@Autowired
	private ShirtService service;
	@GetMapping
	public List<Shirt> cotton(){
		return service.getshirt();
	}
	@GetMapping("/{id}")
	public Optional<Shirt> readbyId(@PathVariable int id){
		return service.getShirtbyId(id);
	}
	@PostMapping
	public Shirt create(@RequestBody Shirt s) {
		return service.addShirt(s);
	}
	@PutMapping("/{id}")
	public Shirt update(@PathVariable int id,@RequestBody Shirt s) {
		return service.editShirt(id, s);
	}
	@DeleteMapping("/{id}")
	public String delete(@PathVariable int id) {
		return service.deleteShirt(id);
	}

}
