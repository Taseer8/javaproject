package com.xworkz.programmings.things;

public class RemoveDublicts {

	public static void main(String[] args) {
	 RemoveDublicts na = new RemoveDublicts();
	 na.getdublicate();
	 na.splitString();
	}
	
	public  void  getdublicate() {
		String name=" Taseers";
		char[] ch = name.toCharArray();
		int i , j;
		int count =0;
		for(i=0; i<=ch.length-1; i++) {
			for( j=i+1; j<=ch.length-1; j++) {
				if(ch[i]==ch[j]) {
					System.out.println(ch[i]);
					count++;
					 break;
					}
				}
			}		
		System.out.println(count);
		}
	public void splitString() {
		String naa = "the amazing ";
		String[] re   = naa.split(" ");
		String longestWord ="";
		int max=0;
		 
		  for(String r:re) {
			  if(r.length()>max) {
				  longestWord= r;
				  max=r.length(); 
			  }
		  }
		  System.out.println("the longest word is:"+longestWord);
	}		
}