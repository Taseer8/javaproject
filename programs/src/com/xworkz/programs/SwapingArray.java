package com.xworkz.programs;

import java.util.Arrays;

public class SwapingArray {

	public static void main(String[] args) {
//		System.out.println(swap(5));
		
//		int [] arr = {2,3,4,5,6};
//		
//		System.out.println(Arrays.toString(swap(arr)));
//		reveseTheNo();
		rev(00011);
		
	}
	public static int[] swap(int [] n) {
	
//		int fact=1;	
//		for(int i =1;  i <= n; i++ ) {
//			 fact*=i;//5,	
//		}
//		return fact;
//	}


		int [] newArray = new int[n.length];
		
		
		int count=0;
		
		for(int i=n.length-1;i>=0;i--) {
			
			newArray[count]=n[i];
			count++;
			
		}
		
	return newArray;
	}
	public static void reveseTheNo() {
		// reversing the number with out using built in methods
		int n=12345;
		while(n > 0) {
			int a = n % 10;
			System.out.print(a);
			n= n/10;
		}
	}
	public static void rev(int num) {
		if(num <10) {
			System.out.println(num);
			return;
		}
		else {
			System.out.print(num%10);
			rev(num / 10);
		}
	}
	}
