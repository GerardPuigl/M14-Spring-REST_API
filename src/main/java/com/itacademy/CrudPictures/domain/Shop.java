package com.itacademy.CrudPictures.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.sun.istack.NotNull;

@Entity
@Table(name = "shops")
public class Shop {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="shop_id")
	@NotNull
	private int id;
	
	@NotBlank
	@Column(name="shop_name")
	private String name;
	
	@NotBlank
	@Column(name="shop_capacity")
	private int Capacity;
	
	@GeneratedValue
	@Column(name="shop_creationdate")
	private Date creationdate;

	public Shop() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return Capacity;
	}

	public void setCapacity(int capacity) {
		Capacity = capacity;
	}

	public int getId() {
		return id;
	}

	public Date getCreationdate() {
		return creationdate;
	}
}
