package com.itacademy.CrudPictures.view;

public class SplitException {


	public String[] Split(Exception ex) {
		String[] errorSplit = ex.getMessage().split(":");
		
		errorSplit[1] = errorSplit[1].replace("[", "");
		errorSplit[1] = errorSplit[1].replace("]", "");
		return errorSplit;
	}

	
}
