package com.xworkz.excaptionProjects.Runner;

import com.xworkz.excaptionProjects.Exception.NullCheck;
import com.xworkz.excaptionProjects.Exception.RedBus;

public class RedBusRunner  {

	public static void main(String[] args) throws RedBus, NullCheck{
		System.out.println("main method");
		throw new RedBus("this is userlenght");
	}
}