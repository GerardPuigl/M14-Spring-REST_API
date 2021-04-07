package com.itacademy.CrudPictures.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itacademy.CrudPictures.domain.Shop;
import com.itacademy.CrudPictures.persistence.ShopsRepository;

@Service
public class ShopServices {

	@Autowired
	ShopsRepository shopReposity;

	public void add(@Valid Shop shop) {
		shopReposity.save(shop);		
	}

	
}
