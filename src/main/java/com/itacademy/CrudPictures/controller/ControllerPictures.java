package com.itacademy.CrudPictures.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itacademy.CrudPictures.domain.Shop;

@RestController
public class ControllerPictures {
	
	@PostMapping("/shops")
	public Shop shopCreation() {
		return null;
	}

}
