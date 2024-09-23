package com.xwork.crud.things;

public class CompanyList {

	String[] companyNameList = new String[4];
	int index = 0;

	public void onSave(String companyName) {
		if (companyName != null) {
			if (index < companyNameList.length) {
				companyNameList[index] = companyName;
				index += 1;
			}
		}
	}

	public String searchByName(String companyName) {
		for (String cn : this.companyNameList) {
			System.out.println(cn);
			if (!cn.equals(companyName)) {
				return "not";
			}
		}
		return "matched";
	}

	public static void main(String[] args) {
		CompanyList crud = new CompanyList();
		crud.onSave("test");
		crud.onSave("test1");
		crud.onSave("test2");
		System.out.println(crud.searchByName("test1"));

	}
}
