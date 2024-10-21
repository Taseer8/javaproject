package com.xworkz.store.repo;


import java.util.HashSet;
import java.util.Set;

import com.xworkz.store.dto.StoreDto;

public class StoreRepo implements StoreRepoImpli {
	Set<StoreDto> set = new HashSet<StoreDto>();
	@Override
	public boolean save(StoreDto dto) {
		System.out.println("repo ");
		return set.add(dto);
	}
	@Override
	public Set<StoreDto> getAll() {
		return set;
	}
}
