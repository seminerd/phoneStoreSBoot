package com.sapoyoungtalent.PhoneStoreSB.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PHONEDATA")
public class Phone {
	@Column(name = "brand")
	String brand;
	@Column(name = "name")
	String name;
	@Column(name = "storage")
	int storage;
	@Column(name = "location")
	String location;

	@Id
	@Column(name = "id")
	int id;

	public Phone() {

	}

	public Phone(String brand, String name, int storage) {
		this.brand = brand;
		this.name = name;
		this.storage = storage;
	}

	public String getBrand() {
		return brand;
	}

	public int getId() {
		return id;
	}

	public String getLocation() {
		return location;
	}

	public String getName() {
		return name;
	}

	public int getStorage() {
		return storage;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

}
