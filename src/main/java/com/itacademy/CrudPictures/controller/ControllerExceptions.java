package com.itacademy.CrudPictures.controller;

import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.itacademy.CrudPictures.exceptions.FullShopException;

@RestControllerAdvice
public class ControllerExceptions {

	//Exception if store capacity is exceeded	
	@ExceptionHandler(FullShopException.class)
	@ResponseStatus(HttpStatus.INSUFFICIENT_STORAGE)  // 507
	public String misMatchException(FullShopException e) {
		return e.getMessage();
	}

}
