package com.itacademy.CrudPictures.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itacademy.CrudPictures.domain.Picture;


@RestController
@RequestMapping("/shop/{ID}")
public class PicturesController {
	
	@PostMapping("/pictures")
	public Picture addPicture(@Valid @RequestBody Picture employee, @PathVariable("id") int id) {
		return null;
	}
	
	@GetMapping("/pictures")
	public List<Picture> getAllPictures(@PathVariable("id") int id){
		return null;
	}
	
	@DeleteMapping("/pictures")
	public String deleteAll(@PathVariable("id") int id) {
		return "Tots els quadres han estat eliminats";
		}
	
}
