package com.itacademy.CrudPictures.view;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.HttpServerErrorException;

@ControllerAdvice
public class WebExepctions {
	
	@ExceptionHandler(HttpServerErrorException.class)
	public String fullShopApiError(@RequestBody HttpServerErrorException ex, Model model) {

		String[] errorSplit = extracted(ex);
		
		model.addAttribute("errorCode",errorSplit[0]);	
		model.addAttribute("errorMessage",errorSplit[1]);
		
		return "shopError";
	}

	private String[] extracted(HttpServerErrorException ex) {
		String[] errorSplit = ex.getMessage().split(":");
		
		errorSplit[1] = errorSplit[1].replace("[", "");
		errorSplit[1] = errorSplit[1].replace("]", "");
		return errorSplit;
	}

}