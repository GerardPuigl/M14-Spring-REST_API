package com.itacademy.CrudPictures.controller;




import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	 * View side programmed with thymeleaf and html
	 * 
	 */
	
	@RequestMapping("/")
    public String getShopList(Model model) {
		RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Shop[]> shops = restTemplate.getForEntity("http://localhost:8080/shops", Shop[].class);
        model.addAttribute("shops", shops.getBody());
        model.addAttribute("Shop",new Shop());
        return "index";
	}
	
	@GetMapping("/shopView")
	public String openShop(@RequestParam int id, Model model) {
		RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Picture[]> pictures = restTemplate.getForEntity("http://localhost:8080/shops/" + id + "/pictures", Picture[].class);
        model.addAttribute("pictures", pictures.getBody());
        ResponseEntity<Shop> shop = restTemplate.getForEntity("http://localhost:8080/shops/" + id, Shop.class);
        model.addAttribute("shop",shop.getBody());
		return "shopView";
	}
		
	//create new shop
	@PostMapping("/shopView")
	public String addShop(Model model,Shop shop) {
		RestTemplate restTemplate = new RestTemplate();
        restTemplate.postForEntity("http://localhost:8080/shops", shop, Shop.class);		
       
        return "redirect:/";
	}
		
	//delete all pictures from shop
	@GetMapping("/shopView/delete/{id}")
	public String deletePictures(@PathVariable("id") int id, Model model) {
		RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete("http://localhost:8080/shops/" + id + "/pictures");		
        return "redirect:/shopView?id=" + id;
	}
	
	
}
