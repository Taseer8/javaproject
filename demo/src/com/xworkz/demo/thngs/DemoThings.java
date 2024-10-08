package com.xworkz.demo.thngs;

import com.xworkz.demo.runner.Demo;

public class DemoThings {

	public static void main(String[] args) {
		Demo  demo = new Demo ();
		int  re = demo.getDome1(5);
		System.out.println(re);
		int res = demo.demo2(0);
		System.out.println(res);
		String[]  name = {"Taseer", "Ganesh"," shashi"};
		String[] nam = {"Taseer", "Ganesh"," shashi", "mallikarjun"};
		demo.demo3(name);
		demo.demo4(name);
		demo.demo5(name);

	}

}
