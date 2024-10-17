package com.xworkz.complente.complenterunner;

import java.util.Scanner;

import com.xworkz.complente.complenteDto.ComplenteDto;
import com.xworkz.complente.complenteRepo.CompRepo;
import com.xworkz.complente.complenteServive.CompServiceimpliments;
import com.xworkz.complente.complenteServive.CompleService;

public class ComplenteRunner {

	public static void main(String[] args) {
		System.out.println("main method");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1 to save operation");
		System.out.println("enter 2 to read operation");
		System.out.println("enter 3 to update operation");
		System.out.println("enter 4 to delete operation");
		
		int select = 0;
		select = sc.nextInt();

		ComplenteDto comp1 = new ComplenteDto();
		comp1.setComplente_id(34);
		comp1.setCompl_Type("garbage issue");
		comp1.setAdress("btm stage 1 near mico layout and near to temple");
		comp1.setNameOfPerson("taseer");
		CompServiceimpliments data = new CompleService(new CompRepo());
		ComplenteDto comp2 = new ComplenteDto();
		comp2.setComplente_id(34);
		comp2.setCompl_Type("garbage issue");
		comp2.setAdress("btm stage 1 near mico layout and near to temple");
		comp2.setNameOfPerson("smd");

		while(select < 5) {
			switch (select ) {
			case 1:
				System.out.println("save operation");
				String result1 = data.save(comp1);
				System.out.println(result1);
				break;
			case 2:
				System.out.println(data.getAll());
				break;
			case 3:
				System.out.println("update method");
				String updatedResult = data.updateById(34, comp2);
				System.out.println(updatedResult);
				break;
			case 4:
				System.out.println("delete method");
				String delete = data.deleteById(34, comp2);
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
