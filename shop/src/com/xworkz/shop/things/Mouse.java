package com.xworkz.shop.things;

public class Mouse extends Object{
	private String brand;
	private char type;
	private boolean gaming;
	private long modelNo;
	public Mouse() {
		System.out.println("no argumnet constractor");
	}
	public Mouse(String brand, char type, boolean gaming, long modelNo ) {
		this.brand = brand;
		this.type = type;
		this.gaming = gaming;
		this.modelNo = modelNo;
	}
	public void getBrand(String brand) {
		this.brand = brand;
	}
	public String setBrand() {
		return this.brand;
	}
	public void getType(char type) {
		this.type = type;
	}
	public char setType() {
		return this.type;
	}
	public void getGame(boolean gaming) {
		this.gaming= gaming;
	}
	public boolean setGame() {
		return this.gaming;
	}
	public void getModel(long modelNo) {
		this.modelNo = modelNo;
	}
	public long setModel() {
		return this.modelNo;
	}
	

}
