package com.xworkz.text.things;

import java.util.Arrays;
import java.util.Scanner;

public class ChechArray {

	public String[] array1 = {"taseer", "ganesh", "rajesh"};
	public String[] array2 = {"taseer", "ganesh", "rajesh"};
	
	public void check2Array(){
		
		for(int i =0; i<this.array1.length ; i++) {
			for(int j=0; j<this.array2.length; j++) {
			if(this.array1[i].equalsIgnoreCase(this.array2[j])) {
				System.out.println("its equal");
			}
			else {
				System.out.println("its not equal");
			}
			}
		}
		
		String array3[] = new String [this.array1.length + this.array2.length];
		
		System.arraycopy(array1, 0, array3, 0, array2.length); 
		System.arraycopy(array2, 0, array3, array1.length, array2.length);
		
		 System.out.println("marged array"+Arrays.toString(array3));
	}
	
	public void checkChar() {
		System.out.println("checking the repeating character in a string ");
		String name = "AbhishAke";
		char[] ch = name.toCharArray();
		int count=0;
		for(int i=0; i<ch.length; i++) {
			for(int j=i+1; j<ch.length; j++) {
				if(ch[i]==ch[j]) {
					System.out.println(ch[i]);
					count++;
					break;
				}
			}
			
		}
	
		System.out.println(""+count);
		
	}
	public void reverseSting() {
		System.out.println("reverse a string");
		String name="taseer";
		char ch[]= name.toCharArray();
		for(int i = ch.length-1; i>=0; i--) {
			System.out.println(ch[i]);
			
		}
	}
	public void checkPalindrome() {
		System.out.println("checking palindrome");
		Scanner pali = new Scanner(System.in);
		System.out.println("enter the element");
		String palim = pali.nextLine();
		String rev = "";
		char cra[] = palim.toCharArray();
		for(int i = cra.length-1; i>=0; i--) {
			rev=rev+cra[i];
		}
		System.out.println(rev);
		if(palim.equalsIgnoreCase(rev)) {
			System.out.println("it is a palindrome ");
		}
		else {
			System.out.println("it not a palindrome");
		}
	}

	
	
	public static void main(String[] args) {
		ChechArray array = new ChechArray();
		array.check2Array();
		array.checkChar();
		array.reverseSting();
		array.checkPalindrome();
		
		

	}

}
