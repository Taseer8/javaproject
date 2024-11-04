package com.xworkz.programmings.things;

public class BinearySearch {


	public int bineary(int arr[] , int x) {
		int low = 0; int high = arr.length-1;
		while(low <= high ) {
			int mid = low + (high- low)/2;
			if(arr[mid] == x ) {
				return mid;
			}
			if(arr[mid]< x) {
				low =	mid + 1 ;
			}
			else {
				high = mid - 1;

			}

		}
		return 0;
	}
	public static void main(String[] args) {
		BinearySearch bs = new BinearySearch();
		int arr[] = { 2, 3, 4, 10, 40 ,5 ,15};
		int x = 10;
		int n = arr.length;
		int result = bs.bineary(arr, x) ; 
		for(int i = 0; i < n; i++) {
		}
		if (result == -1)
			System.out.println("Element is not present in array");
		else
			System.out.println("Element is present at "+ "index " + result);
	}
}
