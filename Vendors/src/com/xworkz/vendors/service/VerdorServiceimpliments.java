package com.xworkz.vendors.service;

import java.util.List;

import com.xworkz.vendors.dto.VendorDto;

public interface VerdorServiceimpliments {
	
	 String save(VendorDto vendordto);
	 List<VendorDto> getAll();
	 String updateById(int vendorId ,VendorDto dto);
	 String removeById(int vendorId, VendorDto vendordto);
	
	

}
