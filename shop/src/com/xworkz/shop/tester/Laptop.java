package com.xworkz.shop.tester;

public class Laptop {
	
	private String companyName;
	private String modelName;
	
	public Laptop(String company, String model) {
		this.companyName = company;
		this.modelName = model;
		
	}
	
	public void setCompany(String company) {
		this.companyName = company;
	}
	public String getCompany() {
		return this.companyName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getModelName() {
		return this.modelName;
	}
	
	
	
	public void CompanysName() {
		System.out.println("getting the company name");
	}
	public void modelNames() {
		System.out.println("getting the model name");
	}
	
	public String toString( ) {
		return companyName + modelName; 
	}
	
	

}
