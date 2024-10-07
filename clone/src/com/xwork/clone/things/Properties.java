package com.xwork.clone.things;

public class Properties implements Cloneable  {
	
	public String Name;
	public int price;
	
	public Properties Clone() throws  CloneNotSupportedException  {
		System.out.println("invoking the properties from clone class");
		return (Properties) new Properties();
	}

	@Override
	public String toString() {
		return "Properties [Name=" + Name + ", price=" + price + "]";
	}
	

}
