package com.xworkz.programmings.things;

import java.util.Arrays;

public class FindTheMaxMin {
	public static void main(String[] args) {
		FindTheMaxMin name = new FindTheMaxMin();
		name.find();
		name.margeTwoArray();
	}
	
	public  void find() {
		int arry[] ={4,5,7,8,9};
		int min=arry[0], max=arry[0] ,i=0, j = i+1;
		for(i=0; i<arry.length; i++) {
			for(j=i+1; j<=arry.length-1; j++) {
				if(arry[i]>arry[j]) {
					min=arry[j];
				}
					else if(arry[i]<arry[j]) {
						max=arry[j];
					}
					else {
				}
			}
		}
		System.out.println("the minimum value is :"+min);
		System.out.println("the maximum value is :"+max);
	}
	public void margeTwoArray() {
		int array1[] = {4,5,6,7};
		int array2[] =  {8,9,10,11};
		int array3[] = new int [array1.length + array2.length];
		
		System.arraycopy(array1, 0, array3, 0, array2.length); 
		System.arraycopy(array2, 0, array3, array1.length, array2.length);
		
		 System.out.println("marged array"+Arrays.toString(array3));
		
	}

}
