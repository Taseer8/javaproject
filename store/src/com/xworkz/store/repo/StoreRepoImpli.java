package com.xworkz.store.repo;

import java.util.Set;

import com.xworkz.store.dto.StoreDto;

public interface StoreRepoImpli {
	
	boolean save(StoreDto dto);
	Set<StoreDto> getAll();


}
