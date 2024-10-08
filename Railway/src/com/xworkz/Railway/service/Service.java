package com.xworkz.Railway.service;

import com.xworkz.Railway.dto.StationDto;
import com.xworkz.Railway.repo.StationRepo;

public class Service {

	StationRepo repo=new StationRepo();

	public boolean vaildate(StationDto station) {
		if(station!=null) {
			if(station.getStantionName()!=null && station.getStantionName().length()>3) {
			}else {
				System.out.println("enter the proper name");
				return false;
			}
			if(station.getTrailNo()!=0 && station.getTrailNo()>=5) {

			}
			else {
				System.out.println("enter the proper train number");
				return false;
			}
			if(station.getPlateformNO()!=0 && station.getPlateformNO()>=1) {
			}else {
				System.out.println("enter the proper plateformNo");
				return false;
			}
			if(station.getPersondto().getName()!=null && station.getPersondto().getName().length()>=3 ){
			}else {
				System.out.println("enter the proper personName");
				return false;
			}
			if(station.getPersondto().getAge()!=0 && station.getPersondto().getAge() >= 5 ){
			}else {
				System.out.println("enter the proper age");
				return false;
			}
			if(station.getPersondto().getMobileNo()!=0 && station.getPersondto().getMobileNo()>=10){
			}else {
				System.err.println("enter the proper mobile number");
				return false;
			}
			if(station.getPersondto().getAadharNO()!=0 && station.getPersondto().getAadharNO()>=14 ){
			}else {
				System.out.println("enter the proper aadhar number");
				return false;
			}
			if(station.getPersondto().getTicketPrice()>150 && station.getPersondto().getTicketPrice()<5000 ){
			}else {
				System.out.println("enter the proper ticket price");
				return false;
			}
			if(station.getDestiPlace()!=null && station.getDestiPlace().length()>3) {
			}else {
				System.out.println("enter the proper destiplace");
				return false;
			}
			if(station.getPinCode()!=0 && station.getPinCode()>=6) {
			}else {
				System.out.println("enter the proper pincode");
				return false;
			}

			System.out.println("validated");
			boolean save = repo.save(station);
			return save;
		}
		return false;
	}
	public void getRead() {
		repo.read();
	}
	
	public void getFind(StationDto find) {
		if(find.getPersondto().getTicketPrice()==499) {
			System.out.println("this is showing from find based on price" );
		}
		
			
		
	}
}
