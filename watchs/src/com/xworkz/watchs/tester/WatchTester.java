package com.xworkz.watchs.tester;

import com.xworkz.watchs.things.FireBoltt;
import com.xworkz.watchs.things.Watch;

public class WatchTester {
	
	
	public static void main(String[] args) {
		Watch watch = new Watch("smartWatch", "nsjkfn", 1200.00);
		watch.setBrand("Watch");
		watch.setModel("tre4");
		watch.setPrice(1299.00);
		System.out.println(watch.getBrand());
		System.out.println(watch.getModel());
		System.out.println(watch.getPrice());
		watch.getWatchDetails();
		
		watch.getbrandName();
		watch.getmodelNumber();
		watch.getPrices();
		System.out.println(" here parents class ends");
		
		FireBoltt fire = new FireBoltt(4,true, 3.4);
		fire.setBatteryLife(4);
		fire.setWaterResistant(true);
		fire.setScreenSize(3.3);
		System.out.println(fire.getBatteryLife());
		System.out.println(fire.isWaterResistant());
		System.out.println(fire.getScreenSize());
		
		fire.getFiredBolt(5);
		fire.getbrandName();
		fire.getmodelNumber();
		fire.getPrices();
	}

}
