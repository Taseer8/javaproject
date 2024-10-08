package com.xworkz.excaptionProjects.Exception;

public class NullCheck extends Throwable {
	
	public NullCheck(String checkNull) {
		if(checkNull != null) {
			System.out.println("null check exception");
		}
		else {
			System.out.println("not  null check exception ");
		}
		
	}

}
