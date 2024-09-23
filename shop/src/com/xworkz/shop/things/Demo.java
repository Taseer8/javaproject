package com.xworkz.shop.things;
import java.util.Arrays;
import java.util.Scanner;

public class Demo {
	
	public Demo() {
		this.palimdrom();
	//System.out.println(getPol("momo"));
	}
	public void palimdrom() {
		Scanner sc = new Scanner(System.in); 
		String sh = sc.next();
		String rev="";
		char[] ch = sh.toCharArray();
		for(int j=0; j<ch.length; j++) {
			for(int i=ch.length-1; i>=0; i--) {
				rev = rev+ch[i];
				
			System.out.print(rev);
			
			
				
		}
			return;
			}
//		if(sh==sr) {
//			System.out.println("it is a palimdrom");
//			
//		}
//		else {
//			System.out.println("its not a palimdrom");
//			
//			}
		}
	
//	public String getPol(String userValue) {
//		// o_String and r_String 
//		String rev="";
//		char ch[]=userValue.toCharArray();
//		for(int i=ch.length-1;i>=0;i--) {
//			rev=rev+ch[i];
//		}
//		if(rev.equals(userValue)) {
//			return "is palindrom";
//		}
//		return "not";
//	}
	
	
	}