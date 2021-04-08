package com.itacademy.CrudPictures.service;

import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itacademy.CrudPictures.domain.Picture;
import com.itacademy.CrudPictures.exceptions.FullShopException;
import com.itacademy.CrudPictures.persistence.PicturesRepository;

@Service
public class PicturesService {

	@Autowired
	PicturesRepository pictureRepository;

	@Autowired
	ShopServices shopServices;
	
	//add picture to repository
	public Picture add(@Valid Picture picture, int id){
		
		//check shop capacity
		if(shopServices.getById(id).getCapacity() <= getAll(id).size()) {
			throw new FullShopException("Error: Botiga plena, no es pot afegir més quadres.");			
		}
		picture.setShopDTO(shopServices.getById(id));
		pictureRepository.save(picture);
		return picture;
	}

	//get a Set of pictures from a shop
	public Set<Picture> getAll(int id) {
		return shopServices.getById(id).getPictures();
	}

	//delete ALL pictures from a shop
	public void deleteAll(int id) {
		pictureRepository.deleteAll(getAll(id));;
	}

}
