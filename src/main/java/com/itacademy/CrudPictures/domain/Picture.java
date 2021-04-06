package com.itacademy.CrudPictures.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="pictures")
public class Picture {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="picutre_id")
	@NotNull
	private int id;
	
	@NotBlank
	@Column(name="picture_author")
	private String author;
	
	@NotBlank
	@Column(name="picture_name")
	private String name;
	
	@NotBlank
	@Column(name="picture_price")
	private double price ;
	
	@GeneratedValue
	@Column(name="picture_registrationdate")
	private double registrationDate ;
}
