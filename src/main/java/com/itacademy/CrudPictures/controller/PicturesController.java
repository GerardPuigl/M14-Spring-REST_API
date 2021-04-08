package com.itacademy.CrudPictures.controller;

import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.itacademy.CrudPictures.domain.Picture;
import com.itacademy.CrudPictures.service.PicturesService;

@RestController
@RequestMapping("/shops/{ID}")
public class PicturesController {
	/*
	 * Controller CRUD pictures
	 */
	@Autowired
	PicturesService pictureService;
	
	//create new pictures
	@PostMapping("/pictures")
	@ResponseStatus(HttpStatus.CREATED)  // 201
	public Picture addPicture(@Valid @RequestBody Picture picture, @PathVariable("ID") int id) {
			return pictureService.add(picture,id);
	}
	
	//get a pictures List
	@GetMapping("/pictures")
	public Set<Picture> getAllPictures(@PathVariable("ID") int id){
		return pictureService.getAll(id);
	}
	
	//delete ALL pictures from a one Shop
	@DeleteMapping("/pictures")
	@ResponseStatus(HttpStatus.ACCEPTED)  // 202
	public String deleteAll(@PathVariable("ID") int id) {
		pictureService.deleteAll(id);		
		return "Tots els quadres han estat eliminats";
		}
	
}
