package com.itacademy.CrudPictures.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.itacademy.CrudPictures.domain.Shop;
import com.itacademy.CrudPictures.service.ShopServices;

@RestController
public class ShopsController {
	
	@Autowired
	ShopServices shopServices;

	@PostMapping("/shops")
	@ResponseStatus(HttpStatus.CREATED)  // 201
	public Shop addShop(@Valid @RequestBody Shop shop) {
		shopServices.add(shop);
		return shop;
	}
	
	@GetMapping("/shops")
	public List<Shop> allShops(){
		return shopServices.getAll();
	}
}
