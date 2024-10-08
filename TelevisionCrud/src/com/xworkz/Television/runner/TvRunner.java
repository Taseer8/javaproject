package com.xworkz.Television.runner;

import com.xworkz.Television.Dto.TvDto;
import com.xworkz.Television.constants.TvEnum;
import com.xworkz.Television.repo.TvRepo;
import com.xworkz.Television.services.TvService;

public class TvRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TvDto tv1 = new TvDto("one",10000,480.00,true, TvEnum.SMALL);
		TvDto tv2 = new TvDto("onep",4000,280,true, TvEnum.MEDIUM);
		
		TvService service = new TvRepo();
		boolean ser =  service.validate(tv2)  ;
	
		System.out.println(ser);
//		boolean ser = service.save(tv2);
		
//		System.out.println(ser);
	}

}
