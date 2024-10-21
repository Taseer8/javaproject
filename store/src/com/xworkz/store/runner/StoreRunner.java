package com.xworkz.store.runner;

import com.xworkz.store.dto.StoreDto;
import com.xworkz.store.repo.StoreRepo;
import com.xworkz.store.service.StoreService;
import com.xworkz.store.service.StoreServiceImpl;

public class StoreRunner {

	public static void main(String[] args) {
		System.out.println("main method");
		StoreDto dto1 = new StoreDto();
		dto1.setStoreName("more");
		dto1.setAddress("btm");
		dto1.setContactNumber(345678901l);
		StoreServiceImpl store = new StoreService(new StoreRepo());
		String save = store.validate(dto1);
		System.out.println(save);
		System.out.println(store.getAll());

	}

}
