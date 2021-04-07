package com.itacademy.CrudPictures.service;

import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itacademy.CrudPictures.domain.Picture;
import com.itacademy.CrudPictures.persistence.PicturesRepository;

@Service
public class PicturesService {

	@Autowired
	PicturesRepository pictureRepository;

	@Autowired
	ShopServices shopServices;

	public Picture add(@Valid Picture picture, int id) {
		
		System.out.println(picture.getClass());
		System.out.println(shopServices.getById(id).getClass());
		picture.setShopDTO(shopServices.getById(id));
		pictureRepository.save(picture);
		return picture;
	}

	public Set<Picture> getAll(int id) {
		return shopServices.getById(id).getPictures();
	}

}
