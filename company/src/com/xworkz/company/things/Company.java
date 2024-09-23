package com.xworkz.company.things;

public class Company {
	
	public String companyName[] = new String[3];
	public int index=0;
	
	public int getlength() {
		return this.companyName.length;
	}
	
	public String[] readOpearation() {
		return companyName;
	}
	
	public void  save(String companyList) {
		if(  index< this.getlength() ) {
			this.companyName[index]=companyList;
			index+=1;
		}
		
	}
	
	public void searchByName(String searchCompany) {
		for(String tr: this.companyName) {
			if(tr.equalsIgnoreCase(searchCompany)) {
				System.out.println("matched:"+searchCompany);
				break;
			}
			else {
				System.out.println("does't matched");		
			}
		}
	}
//	public String updateName(String companyOldName, String companyNewName) {
//		for(int i = 0; i<this.getlength(); i++) {
//			if(this.companyName[i].equalsIgnoreCase(companyOldName)) {
//				this.companyName[i]=companyNewName;
//				return"updated name is :"+companyNewName;
//			}
//		}
//		return"not updated";
//	}
	
	public String deleteName(String deleteName) {
		String deletes ="";
		for(int i =0; i<this.getlength(); i++) {
			if(this.companyName[i].equalsIgnoreCase(deleteName)) {
				 this.companyName[i] = deletes ;
				return"the deleted value is :"+deleteName;
			}
		}
		return"";
	}
	
	public static void main(String[] args) {
		Company cam = new Company();
		cam.save("2001");
		cam.save("mysore");
		cam.save("bangalore");
		String[] sr = cam.readOpearation();
		for(String re:sr) {
		System.out.println(re);
		}
		cam.deleteName("mysore");
		System.out.println("after deleting ");
		String[] srr = cam.readOpearation();
		for(String ree:srr) {
		System.out.println(ree);
		}

		
		
	}
}