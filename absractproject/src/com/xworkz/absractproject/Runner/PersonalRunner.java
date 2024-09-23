package com.xworkz.absractproject.Runner;

import com.xworkz.absractproject.dto.PersonalDto;
import com.xworkz.absractproject.service.PersonalDetails;
import com.xworkz.absractproject.service.TaseerInformation;
import com.xworkz.absractproject.service.ZuberInformation;

class PersonalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonalDto personal = new PersonalDto();
		personal.setName("smd");
		personal.setAge(24);
		personal.setNumber(497876578l);
		personal.setAddres("bangalore");
		
		PersonalDetails details = new TaseerInformation();
		details.ValidatePersonalDetails(personal);
		details = new ZuberInformation();
		details.ValidatePersonalDetails(personal);
	}

}
