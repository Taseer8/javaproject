package com.xworkz.Railway.Runner;

import com.xworkz.Railway.constant.Location;
import com.xworkz.Railway.dto.PersonDto;
import com.xworkz.Railway.dto.StationDto;
import com.xworkz.Railway.service.Service;

public class RailwayRunner {
	public static void main(String[] args) {
		PersonDto person1 = new PersonDto("SmdTaseer",24,8050319217l,669973326699l, 449);
		PersonDto person2 = new PersonDto("smd faiz",20,7022618056l,556677889910l,499);
		PersonDto person3 = new PersonDto("ganesh",21,7879879871l,776655443322l,450);
		PersonDto person4 = new PersonDto("rajesh",23, 99988776633l,9988803322l,499);
		PersonDto person5 = new PersonDto("ramesh",45,898904567l,789798763l,560);
		
		StationDto data1 = new StationDto("SWRB junction",5673,4,520006, "Ballari",Location.BANGALORE,person1);
		StationDto data2 = new StationDto("Bly junction",56723,2,583101,"Bangalore",Location.BALLARI,person5);
		StationDto data3 = new StationDto("rcr junction",70032,3,52004,"Anathapoor",Location.BANGALORE,person3);
		StationDto data4 = new StationDto("gub junction",58722,3,520006,"Ballari",Location.BANGALORE,person2);
		StationDto data5 = new StationDto("dly junction",56742,3,520006,"Ballari",Location.BANGALORE,person4);
		
		Service name = new Service();
		name.vaildate(data1);
		
		name.vaildate(data2);

		name.vaildate(data3);
		name.vaildate(data4);
		name.vaildate(data5);
		name.getRead();
		
	
//		name.getRead();
//		System.out.println(data1.toString());
	

	

		
		
	}

}
