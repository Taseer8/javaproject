package com.xwork.crud.things;

public class CrudOnString {
	
	public String  companyName[] = new String[3];
	 public int index=0; 
			
	
	public int getLenght() {
		return this.companyName.length;
	}
	
	//read method
	public String[] getRead() {
		return this.companyName;
	}
	//save method 
	public void getSave(String company) {
		if(this.index<this.getLenght()) {
			this.companyName[this.index]=company;
			this.index+=1;
		}
	}
	
	
	//search method
	public String getSearch(String cName) {
		for(String c:this.companyName) {
				if(c!=null &&c.equalsIgnoreCase(cName)) {
					return "its matches:"+cName;
				}
				else {
					return "its doesn't matches:"+cName;
				}
				
			}
			return "";
	}
	
//	public String searchByName(String companyName) {
//		for(int i=0;i<this.companyName.length;i++) {
//			System.out.println("element:"+this.companyName[i]);
//			if(this.companyName[i]!=null && this.companyName[i].equals(companyName)) {
//                return " matched";				
//			}
//		}
//		return "not matched";
//	}
	
	public String getUpdate(String compOldName, String compNewName) {
		for(int i = 0; i<this.getLenght(); i++) {
			if(this.companyName[i].equals(compOldName)) {
				this.companyName[i].equals(compNewName);
				compOldName=compNewName;
				
				
				return "update a new name of the company is :"+compNewName;
			}
			else {
				return "not updated";
			}

		}
		return"";
		
	}
	
	
	
	public static void main(String[] args) {
		
		CrudOnString cre = new CrudOnString();
		String[] read = cre.getRead();
		for(String ne: read) {
		System.out.println(ne);
		}
		
		cre.getSave("constratics");
		cre.getSave("dell");
		cre.getSave("hp");
		String[] re = cre.getRead();
		for(String n: re) {
		System.out.println(n);
		}
		
		String se =cre.getSearch("dell");
		System.out.println(se);
		
		String up = cre.getUpdate("dell", "lenova");
		System.out.println(up);
		String[] e = cre.getRead();
		for(String n1: e) {
		System.out.println("after update the company name:"+n1);
		}
	}

}
