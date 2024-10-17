package com.xworkz.vendors.repo;

import java.util.LinkedList;
import java.util.List;

import com.xworkz.vendors.dto.VendorDto;


public class VendorRepo  implements VendorRepoImpliments{
	
	LinkedList<VendorDto> link = new LinkedList<VendorDto>();
	@Override
	public boolean save(VendorDto vendorDto) {
		System.out.println("save method started in repo");
		return link.add(vendorDto);
			
	}
	@Override
	public List<VendorDto> getAll() {
		return link;
	}
	@Override
	public boolean updateById(int vendorId, VendorDto vendordto) {
		System.out.println("update method");
		if(!link.isEmpty()) {
			for(int i = 0 ; i < link.size(); i++) {
				if(link.get(i).getVendorId()==vendorId) {
					link.set(i, vendordto);
				}
			}
			return true;
		}
		else {
			System.out.println("enter the proper id");
		}
		
			
		return false;
	} 
	public boolean removeById(int vendorId, VendorDto vendordto) {
		System.out.println("update method");
		if(!link.isEmpty()) {
			for(int i = 0 ; i < link.size(); i++) {
				if(link.get(i).getVendorId()==vendorId) {
					link.remove();
				}
			}
			return true;
		}	
		return false;
	} 
	
	

	

}
