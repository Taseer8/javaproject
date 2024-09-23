package com.xworkz.shop.tester;

import com.xworkz.shop.things.Mouse;

public class MouseTester {
	public static void main(String[] args) {
		Mouse mouse = new Mouse();
		mouse.getBrand("lenova");
		mouse.getGame(true);
		mouse.getModel(123445l);
		mouse.getType('W');
		
		System.out.println(mouse.setBrand());
		System.out.println(mouse.setGame());
		System.out.println(mouse.setType());
		System.out.println(mouse.setModel());
	}

}
