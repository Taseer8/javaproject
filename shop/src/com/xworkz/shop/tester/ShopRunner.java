package com.xworkz.shop.tester;
import com.xworkz.shop.things.*;
public class ShopRunner {

	public static void main(String[] args) {
		System.out.println("main method is started");
		Shop clothShop = new Shop("Ajio","AJIO9898");
		String shopName = clothShop.getShopName();
		System.out.println(shopName);
		
	}
}
