package com.itacademy.CrudPictures.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="pictures")
public class Picture {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="picture_id")
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
	private Date registrationDate ;
	
	@ManyToOne
	@JoinColumn(name = "shop_id")
	private Shop shopDTO; 

		public Picture() {
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}
}
