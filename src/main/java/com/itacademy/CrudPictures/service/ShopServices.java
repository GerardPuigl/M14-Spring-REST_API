package com.itacademy.CrudPictures.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itacademy.CrudPictures.domain.Shop;
import com.itacademy.CrudPictures.persistence.ShopsRepository;

@Service
public class ShopServices {

	@Autowired
	ShopsRepository shopReposity;

	//add new shop to repository
	public void add(@Valid Shop shop) {
		shopReposity.save(shop);		
	}

	//return a Shop List from repository
	public List<Shop> getAll() {
		return shopReposity.findAll();
	}
	
	//find and return one Shop by Id
	public Shop getById(int id) {
		return shopReposity.findById(id).get();
	}

	
}
