package com.xworkz.demo.runner;

public class Demo {
	
	public int getdemo() {
		int age = 18;
		if(age<18) {
			
			System.out.println("u are not elgable to vote");
			return age;
		}
		else {
			System.out.println("ur elgabile to vote");
		}
		return age;
	}
	public int getDome1(int day) {
		if(day == 1) {
			System.out.println("it a monday");
			
		}else if (day == 2 ) {
			System.out.println("its tuesday");
			
		}
		else if (day == 3) {
			System.out.println("its wednesday");
			
		}
		else if (day == 4) {
			System.out.println("its thursday");
			
		}
		else if (day == 5) {
			System.out.println(" its friday");
		}
		else {
			System.out.println("in valid day");
		}
		return day;
	}
	// switch case 
	public int demo2(int day) {
		switch (day) {
		case 1:
			System.out.println("its monday");
			
			break;
		case 2:
			System.out.println("its tuesday");
			break;
			
		default:
			System.out.println("its invalid day");
			break;
		}
		return day;
	}
	public void demo3(String[] names ) {
		for(int i = 0 ; i<names.length; i++ ) {
			System.out.println("names"+names[i]);
		}
	}
	public void demo4(String[] names) {
		int i =0;
		while (i<3) {
			System.out.println("names"+names[i]);
			i++;
		}
	}
	public void demo5(String[] names) {
		int i = 0 ;
		do {
			System.out.println("names:"+names[i]);
			i++;
		}
		while(i<4);
	}
	

}
