package com.sapoyoungtalent.PhoneStoreSB.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
@PropertySource("application.properties")

public class Store {
	List<Phone> listProducts = new ArrayList<Phone>();
	@Value("${location}")
	String location;
	void addPhone(Phone phone) {
		listProducts.add(phone);
	}
	void removePhone(Phone phone) {
		listProducts.remove(phone);
	}

}
