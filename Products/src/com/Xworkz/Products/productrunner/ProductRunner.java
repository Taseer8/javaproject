package com.Xworkz.Products.productrunner;

import java.util.Scanner;

import com.Xworkz.Products.productService.ProductSericeImpliments;
import com.Xworkz.Products.productService.ProductService;
import com.Xworkz.Products.productdto.ProductDto;
import com.Xworkz.Products.productrepo.ProductRepo;

public class ProductRunner {

	public static void main(String[] args) {
		System.out.println("main method");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1 to save operation");
		System.out.println("enter 2 to read operation");
		System.out.println("enter 3 to update operation");
		System.out.println("enter 4 to delete operation");
		int select =0;
		select = sc.nextInt();

		ProductDto pDto = new ProductDto();
		pDto.setProductId(33);
		pDto.setProductName("bottel");
		pDto.setProductCatgory("statenanry");
		pDto.setPrice(100);
		ProductSericeImpliments data = new ProductService(new ProductRepo());
		ProductDto pDto1 = new ProductDto();
		pDto1.setProductId(35);
		pDto1.setProductName("Lunch box");
		pDto1.setProductCatgory("statenanry");
		pDto1.setPrice(300);

		while (select <5) {
			switch (select) {
			case 1:
				System.out.println("save operation");
				String result1 = data.validate(pDto);
				System.out.println(result1);
				break;
			case 2:
				System.out.println(data.getAll());
				break;
			case 3:
				System.out.println("update method");
				String updatedResult = data.updateById(33,pDto1);
				System.out.println(updatedResult);

				break;
			case 4:
				System.out.println("delete method");
				String delete = data.deleteById(33,pDto);
				System.out.println(delete);

				break;

			default:
				System.out.println("nothing");
				break;
			}
			System.out.println("enter your choice in between 1 to 4");
			select = sc.nextInt();



		}

	}

}
