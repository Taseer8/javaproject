package com.xworkz.Exception.runner;



import com.xworkz.Exception.excception.ExceptionTwo;

public class ExceptionTwoRunner {

	public static void main(String[] args) throws ExceptionTwo {
		// TODO Auto-generated method stub
	       
			try {
				String message = "Xworkz";
			       String name = "xworkz";
				
				if(message.equalsIgnoreCase(name)) {
					throw new ExceptionTwo("mached");
			}
				else {
					throw new ExceptionTwo("doesnt matched");
				}
			}
	       catch(ExceptionTwo e){
				System.out.println(" ActivationException caught:"+e.getMessage());
			}
			System.out.println("Throw class Running");
			throw new  ExceptionTwo("hi");
		}

	}


