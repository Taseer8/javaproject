package com.xworkz.programmings.things;

import java.util.Arrays;

public class SplitArray {

	public static void main(String[] args) {
		int array1[]= {1,2,3,4,5,6,7};
		//Splitting the 2 arrays
		int pos = 4;
		int arrLenght = array1.length;

		int array2[] = new int[pos];
		int array3[]= new int[arrLenght-pos];

		for(int i =0; i<pos ; i++)
			array2[i]= array1[i];

		for(int i =0; i<arrLenght-pos ; i++)
			array3[i]= array1[i+pos];
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(array3));


		// Merging the 2 different arrays
		int a1 = array2.length;
		int a2 = array3.length;
		int a3 = a2 + a1;
		int c1[] = new int [a3] ;
		System.arraycopy(array3, 0, c1, 0, a2);
		System.arraycopy(array2, 0, c1, a2, a1);
		System.out.println(Arrays.toString(c1));

	}

	

}
