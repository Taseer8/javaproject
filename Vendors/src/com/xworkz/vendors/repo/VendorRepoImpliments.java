package com.xworkz.vendors.repo;

import java.util.List;

import com.xworkz.vendors.dto.VendorDto;

public interface VendorRepoImpliments  {
	
	boolean save(VendorDto vendorDto);

	List<VendorDto> getAll();
	boolean updateById(int vendorId, VendorDto vendordto);
	boolean removeById(int vendorId, VendorDto vendordto);
	
	

}
