package com.xworkz.Tv.tester;

import com.xworkz.Tv.things.OnePlus;
import com.xworkz.Tv.things.Samsung;
import com.xworkz.Tv.things.Tv;

public class TvTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv tv = new Tv("Tv",22.43,657);
		tv.setBrandName("tv");
		tv.setScreenSize(18.45);
		tv.setSeriesNo(565);
		 System.out.println(tv.getBrandName());
		 System.out.println(tv.getScreenSize());
		 System.out.println(tv.getSeriesNo());
		 tv.getDetail();
		 tv.getdetails();
		 tv.getSeries();
		 tv.getSize();
		 
		 OnePlus one = new OnePlus(32.34,13999.00,'O');
		 one.setScreenSizes(18.45);
		 one.setPrice(12449.32);
		 one.setLogoSimble('O');
		  System.out.println(one.getScreenSize());
		  System.out.println(one.getPrice());
		  System.out.println(one.getLogoSimble());
		  one.getDetail();
		  one.getdetails();
		  one.getSeries();
		  one.getSize();
		  
		  Samsung sung = new Samsung("1080p",true, 2);
		  sung.setResolution("1080p");
		  sung.setHdmiPorts(2);
		  sung.setSmartTv(true);
		  System.out.println(sung.getResolution());
		  System.out.println(sung.getHdmiPorts());
		  System.out.println(sung.isSmartTv());
		  sung.getDetail();
		  sung.getdetails();
		  sung.getSeries();
		  sung.getSize();
	}

}
