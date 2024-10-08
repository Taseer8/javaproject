package com.xworkz.Railway.repo;

import com.xworkz.Railway.dto.PersonDto;

//import java.util.Iterator;

import com.xworkz.Railway.dto.StationDto;

public class StationRepo {

	public StationDto station[] = new StationDto[5];
	public int index =0;

	public boolean save(StationDto stationsave) {
		if(this.index<=station.length) {
			this.station[index] =  stationsave;
			index++;
			System.out.println("data Saved sucessful");
			return true;
		}
		System.out.println("data not saved");
		return false;
	}
	public void read() {
		for(int i =0; i<station.length; i++ ) {
			System.out.println(station[i].toString());

		}
		
	}

	public void find(double person ) {
		
	}

}
