package com.xworkz.shop.tester;

import com.xworkz.shop.things.Bike;

public class BikeTeater {
		public static void main(String[] args) {
			Bike bike = new Bike();
			bike.getBrand("hero");
			bike.getColor('r');
			bike.getGear(5);
			bike.getfuel(34.5f);
			bike.getDistance(10000l);
			bike.getModel((short)2020);
			bike.getElectric(false);
			bike.getWheel((byte)2);
			bike.getPrice(90000.00);
			System.out.println("BrandName:"+bike.setBrand());
			System.out.println("color:"+bike.setColor());
			System.out.println("bike Total distance Travelled:"+bike.setDistance());
			System.out.println("Is it Electric bike:"+bike.setElectric());
			System.out.println("Fuel efficience:"+bike.setfuel());
			System.out.println("No of gears :"+bike.setGear());
			System.out.println("Price of the bike "+bike.setPrice());
			System.out.println("Bike model:"+bike.setModel());
			System.out.println("no of Wheels:"+bike.setWheel());
		}
}
