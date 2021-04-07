package com.itacademy.CrudPictures.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itacademy.CrudPictures.domain.Picture;
import com.itacademy.CrudPictures.service.PicturesService;


@RestController
@RequestMapping("/shops/{ID}")
public class PicturesController {
	
	@Autowired
	PicturesService pictureService;
	
	@PostMapping("/pictures")
	public Picture addPicture(@Valid @RequestBody Picture picture, @PathVariable("ID") int id) {
		return pictureService.add(picture,id);
	}
	
	@GetMapping("/pictures")
	public List<Picture> getAllPictures(@PathVariable("ID") int id){
		return null;
	}
	
	@DeleteMapping("/pictures")
	public String deleteAll(@PathVariable("ID") int id) {
		return "Tots els quadres han estat eliminats";
		}
	
}
