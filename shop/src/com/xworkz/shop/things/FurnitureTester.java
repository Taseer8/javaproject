package com.xworkz.shop.things;

import com.xworkz.shop.tester.Furniture;
import com.xworkz.shop.tester.Sofas;
import com.xworkz.shop.tester.Wardrobes;

public class FurnitureTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Furniture furniture = new Furniture("door", "Wood" , "brown" , 45.56, 40000.00, " 5ft*3ft");
		furniture.setType("door");
		furniture.setMaterial("wood");
		furniture.setColor("brown");
		furniture.setWeight(55.64);
		furniture.setPrice(55000.00);
		furniture.setDimensions("6ft*3ft");
		
		furniture.getFurnitureDetails();
		String arg = furniture.getmaterialDeatils();
		System.out.println(arg);
		furniture.getcolordeatils("black");
		double rug = furniture.getPriceDeatils(3000.00, null);
		System.out.println(rug);
		System.out.println("==========");
		
		System.out.println(furniture.getType());
		System.out.println(furniture.getMaterial());
		System.out.println(furniture.getColor());
		System.out.println(furniture.getWeight());
		System.out.println(furniture.getPrice());
		System.out.println(furniture.getDimensions());
		System.out.println("+++++++++++");
		
		
		Sofas sofa = new Sofas("door", "Wood" , "brown" , 45.56, 40000.00, " 5ft*3ft");
		sofa.setNumberOfSeats(4);
		sofa.setTypeMaterial("Leather");
		sofa.setStyle("classic");
		sofa.setPrice(45000.00);
		
		sofa.getFurnitureDetails();
		String argsofa = sofa.getmaterialDeatils();
		System.out.println(argsofa);
		sofa.getcolordeatils("blue");
		double rugsofa = sofa.getPriceDeatils(5000.00, null);
		System.out.println(rugsofa);
		System.out.println("==========");
		
		System.out.println(sofa.getNumberOfSeats());
		System.out.println(sofa.getTypeMaterial());
		System.out.println(sofa.getStyle());
		System.out.println(sofa.getPrice());
		System.out.println("---------");
		
		
		Wardrobes ward = new Wardrobes((short)3, 5, true);
		ward.setNumberOfDoors((short)4);
		ward.setNumberOfDrawers(4);
		ward.setHasMirror(true);
		ward.setPrice(20000.00);
		
		ward.getFurnitureDetails();
		 String argward = ward.getmaterialDeatils();
		 System.out.println(argward);
		ward.getcolordeatils("black");
		double rugward = ward.getPriceDeatils(3000.00, null);
		System.out.println(rugward);
		System.out.println("==========");
		
		System.out.println(ward.getNumberOfDrawers());
		System.out.println(ward.getNumberOfDoors());
		System.out.println(ward.getIsHasMirror());
		
		 
	}
	

}
