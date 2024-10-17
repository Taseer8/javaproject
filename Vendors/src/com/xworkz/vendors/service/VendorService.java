package com.xworkz.vendors.service;

import java.util.List;

import com.xworkz.vendors.dto.VendorDto;
import com.xworkz.vendors.repo.VendorRepoImpliments;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class VendorService implements VerdorServiceimpliments {
	
	private VendorRepoImpliments repo;

	@Override
	public String save(VendorDto vendorDto) {
		System.out.println("save method in service");
		if(vendorDto!= null) {
			if(repo.save(vendorDto)) {
				
			}
			return "saved sucessfully";
		}
		
		return "not saved sucessfully";
	}

	@Override
	public List<VendorDto> getAll() {
		return repo.getAll();
	}

	@Override
	public String updateById(int vendorId, VendorDto dto) {
		if(vendorId > 0) {
			if(repo.updateById(vendorId, dto)) {
				return "update sucessfully";
			}
			
		}
		
		return "not updated";
	}

	@Override
	public String removeById(int vendorId, VendorDto vendordto) {
		if(vendorId > 0) {
		if(repo.removeById(vendorId, vendordto)) {
			return "delete sucessfully";
		}
		
	}
		return "not deleted";

	
	
	}
}