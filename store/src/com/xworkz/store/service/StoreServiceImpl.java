package com.xworkz.store.service;

import java.util.Set;

import com.xworkz.store.dto.StoreDto;

public interface StoreServiceImpl {
	
	String validate(StoreDto dto);
	Set<StoreDto> getAll();
	

}
