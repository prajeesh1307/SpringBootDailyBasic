package com.shirt.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shirt.demo.model.Shirt;
import com.shirt.demo.repository.ShirtRepository;

@Service
public class ShirtService {
	@Autowired
	private ShirtRepository repo;
	
	public List<Shirt> getshirt(){
		return repo.findAll();
	}
	public Optional <Shirt> getShirtbyId(int id){
		return repo.findById(id);
	}
	public Shirt addShirt(Shirt s) {
		return repo.save(s);
	}
	public Shirt editShirt(int id,Shirt s) {
		Shirt cloth = repo.findById(id).orElse(null);
		if(cloth != null) {
			cloth.setClothtype(cloth.getClothtype());
			cloth.setBrand(cloth.getBrand());
			cloth.setColor(cloth.getColor());
			cloth.setSize(cloth.getSize());
			cloth.setPattern(cloth.getPattern());
			cloth.setMaterialtype(cloth.getMaterialtype());
			cloth.setFit(cloth.getFit());
			cloth.setPrice(cloth.getPrice());
			return repo.saveAndFlush(cloth);
			
		}
		else {
			return null;
		}
 	}
	//public String deleteSh(int id) {
	//	repo.deleteById(id);
	//	return id+" deleted ";
	//}
	public String deleteShirt(int id) {
		return null;
	}

}
