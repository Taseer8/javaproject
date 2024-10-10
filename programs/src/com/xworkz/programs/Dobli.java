package com.xworkz.programs;

public class Dobli {

	public static void main(String[] args) {
		String name = "mohammed taseer";
		char ch[] = name.toCharArray();
		int count =0;
		for(int i = 0; i<ch.length; i++) {
			for(int j = i+1; j<ch.length; j++) {
				if(ch[i]== ch[j]) {
					System.out.println("doublicate characters is :"+ch[j]);
					count++;
				}
			}
		}
		System.out.println("no of doublicate characters persent is :"+count);

	}

}
