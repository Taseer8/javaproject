package com.xworkz.Television.repo;

import com.xworkz.Television.Dto.TvDto;
import com.xworkz.Television.services.TvService;

import lombok.ToString;


public class TvRepo implements TvService {
	
	public TvDto[] list = new TvDto[5];

	@Override
	public boolean validate(TvDto dto) {
		if(dto!=null) {
			if( dto != null || dto.getBrandName().length() <= 3) {
				System.out.println("hi");
			
				if(dto.getPrice() <= 5000 || dto.getPrice() <= 25000) {
//					if(dto.getResulaution()<= 320.00 && dto.getResulaution() >= 8.000) {
//						System.out.println("enter proper resulaution");
						
//					}
					System.out.println("enter the proper amount range");
					
				}
				System.out.println("enter the properly brand name");
			}
//			System.out.println("all the values are prper");
			return true;
		}
		return false;
	}

	@Override
	public boolean save(TvDto dto) { 
		int count = 0;
		for(int i =0; i<this.list.length; i++) {
//			
			this.list[i] =  dto;
			count++;
			System.out.println("tv1"+dto);
			return true;
			
		}
		System.out.println("no of elements in array:"+count);
		return false;
	}
	

}
