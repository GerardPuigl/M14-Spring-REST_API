package com.itacademy.CrudPictures.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itacademy.CrudPictures.domain.Shop;

@RestController
public class ShopsController {

	@PostMapping("/shops")
	public Shop shopCreation() {
		return null;
	}
	
	@GetMapping("/shops")
	public List<Shop> allShops(){
		return null;
	}
}
