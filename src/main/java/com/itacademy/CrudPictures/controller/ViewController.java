package com.itacademy.CrudPictures.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.itacademy.CrudPictures.domain.Picture;
import com.itacademy.CrudPictures.domain.Shop;

@Controller
public class ViewController {
	
	/*
	 * Controller View
	 * 
	 * Done with RestTemplate to simulate and independent APP that request info to the Rest API
	 * View programmed with thymeleaf and html
	 * 
	 */
	
	@RequestMapping("/")
    public String getAllClothesList(Model model) {
		RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Shop[]> shops = restTemplate.getForEntity("http://localhost:8080/shops", Shop[].class);
        model.addAttribute("shops", shops.getBody());
        return "index";
	}
	
	@RequestMapping("/shopView")
	public String openShop(@RequestParam int id, Model model) {
		RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Picture[]> pictures = restTemplate.getForEntity("http://localhost:8080/shops/" + id + "/pictures", Picture[].class);
        model.addAttribute("pictures", pictures.getBody());	
		return "shopView";
	}

}
