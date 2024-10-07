package com.xwork.clone.tester;

import com.xwork.clone.things.Properties;

public class PropertiesTester {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Properties properties = new Properties();
		properties.Name = "Book";
		properties.price = 45;
		System.out.println("properties:"+properties);
		try {
			Properties properties1 =  properties.Clone();
			properties1.Name = "laptop";
			properties1.price = 540000;
			
			System.out.println("properties1:"+properties1);
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
			
		}

	}

}
