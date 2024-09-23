package com.Xworkz.Game.things;

import java.util.Arrays;

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
		System.out.println("dfghjkl;kjhgfdsfghjkl   ::  " + Arrays.toString(companyNameList));
		for (String cns : companyNameList) {
			if (cns != null && cns.equalsIgnoreCase(companyName)) {

				return "matched ";
			}
		}
		return "not matched";
	}

	public static void main(String[] args) {
		CompanyList crud = new CompanyList();
		crud.onSave("test");
		crud.onSave("test1");
		crud.onSave("test2");
		System.out.println(crud.searchByName("test1"));

	}
}
