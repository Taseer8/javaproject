package com.xworkz.store.service;

import java.util.Set;

import com.xworkz.store.dto.StoreDto;
import com.xworkz.store.repo.StoreRepoImpli;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class StoreService implements StoreServiceImpl {
	
	private StoreRepoImpli set;

	@Override
	public String validate(StoreDto dto) {
		if(dto!= null) {
			if(set.save(dto)) {
			}
			return "Saved";
		}
		return "not saved";
	}

	@Override
	public Set<StoreDto> getAll() {
		return set.getAll();
	}


}
