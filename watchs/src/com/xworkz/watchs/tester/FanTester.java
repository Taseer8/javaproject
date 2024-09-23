package com.xworkz.watchs.tester;

import com.xworkz.watchs.things.Fan;
import com.xworkz.watchs.things.Usha;

public class FanTester {
	public static void main(String[] args) {
		Fan fan = new Fan("brand", 45, true);
		fan.setBrand("hevlls");
		fan.setOscillating(true);
		fan.setSpeedLevels(5);
		fan.setOscillating(true);
		System.out.println(fan.getBrand());
		System.out.println(fan.getisOcallitation());
		System.out.println(fan.getSpeedLevels());
		fan.getFanDetails();
		fan.getBrandname();
		boolean bn =fan.getisOcallitation();
		System.out.println(bn);
		fan.getSpeed();
		System.out.println("parent class ends here");
		
		Usha usha = new Usha(3, 5,true);
		usha.setBladeSize(3);
		usha.setRemoteControlled(true);
		usha.setSpeedLevels(5);
		
		System.out.println(usha.getBladeSize());
		System.out.println(usha.getisOcallitation());
		System.out.println(usha.getSpeedLevels());
		usha.getBrandname();
		 boolean hy = usha.getisOcallitation();
		 System.out.println(hy);
		usha.getSpeed();
		usha.getdetails();
		
	}

}
