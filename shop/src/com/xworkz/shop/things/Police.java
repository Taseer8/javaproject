package com.xworkz.shop.things;

public class Police extends Object{
	public String typeOfPolice;
	public double salary;
	public String belongs;
	public String name;
	public int age;
	
	
	
	public Police(String typeOfPolice, double salary, String belongs, String name, int age) {
		this.typeOfPolice = typeOfPolice ;
		this.salary = salary;
		this.belongs = belongs;
		this.name = name;
		this.age = age;
		
	}
      @Override
	public String toString() {
		return "typeofPolice:"+this.typeOfPolice+","+ "salary"+this.salary +","+"belongs"+this.belongs+","+"name"+this.name+","+"age"+this.age;
	}

}
