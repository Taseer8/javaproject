package com.xworkz.shop.things;

public class Shop {
	
	public String shopName;
	public String shopGstNumber;
	
	public Shop() {
		System.out.println("this is no-argument constructor");
	}
	
	public Shop(String shopName, String shopGstNumber) {
		System.out.println("this is all-argument constructor");
		this.shopName = shopName;
		this.shopGstNumber = shopGstNumber;
	}
	
	//instance methods
	public String getShopName() {
		//method chaining
		this.getShopDetails();
		return shopName;
	}
	
	public void getShopDetails() {
		System.out.println("getShopDetails is started");
		System.out.println("shopname:"+this.shopName);
		System.out.println("gst number:"+this.shopGstNumber);
		System.out.println("getShopDetails is ended");

	}
	

}
