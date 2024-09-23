package com.xworkz.absractproject.service;

import com.xworkz.absractproject.dto.PersonalDto;

public class ZuberInformation  extends PersonalDetails{

	@Override
	public boolean ValidatePersonalDetails(PersonalDto personaldto) {
		System.out.println("running the zuber information method ");
		if(personaldto != null) {
			if(personaldto.getName().length()<3) {
				System.out.println("enter the proper name");
			}
			else {
				System.out.println("correct name");
			}
			
		}
		if(personaldto != null) {
			if(personaldto.getAddres().length()<5) {
				System.out.println("enter the proper address");
			}
			else {
				System.out.println("correct address");
			}
		}
		
		return false;
	}
	

}
