package com.xworkz.vendors.runner;

import java.util.Scanner;

import com.xworkz.vendors.dto.VendorDto;
import com.xworkz.vendors.repo.VendorRepo;
import com.xworkz.vendors.service.VendorService;
import com.xworkz.vendors.service.VerdorServiceimpliments;



public class VendorRunner {

	public static void main(String[] args) {
		System.out.println("main method");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1 to save operation");
		System.out.println("enter 2 to read operation");
		System.out.println("enter 3 to update operation");
		System.out.println("enter 4 to delete operation");
		int select = 0;
		select = sc.nextInt();
		VendorDto dto = new VendorDto();
		dto.setVendorId(2);
		dto.setVendorName("taseer");
		dto.setVendorEmail("taseer@gmail.com");
		dto.setVendorType("electronics");
		dto.setVendorContactNumber(7022618056l);
		VerdorServiceimpliments service = new VendorService(new VendorRepo());
		VendorDto dto1 = new VendorDto();
		dto1.setVendorId(2);
		dto1.setVendorName("smd taseer");
		dto1.setVendorEmail("smdtaseer@gmail.com");
		dto1.setVendorType("nothing");
		dto1.setVendorContactNumber(7022618056l);
		while(select < 5) {
			switch (select ) {
			case 1:
				System.out.println("save operation");
				String result1 = service.save(dto);
				System.out.println(result1);
				break;
			case 2:
				System.out.println(service.getAll());
				break;
			case 3:
				System.out.println("update method");
				String updatedResult = service.updateById(2,dto1 );
				System.out.println(updatedResult);
				break;
			case 4:
				System.out.println("delete method");
				String delete = service.removeById(2, dto1);
				System.out.println(delete);
				break;
			default:
				System.out.println("nothing");
			}
			System.out.println("enter the 1 2 3 are 4");
			select = sc.nextInt();
		
		}
		
		
	}
}
