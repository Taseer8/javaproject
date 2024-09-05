package com.xworkz.shop.things;

public class PgTester {
	public static void main(String[] args) {
		 Pg pg = new Pg();
		 pg.getPgName("sre");
		 pg.getLocation("BTM");
		 pg.getTotalRoom(30);
		 pg.getAvailable((byte)5);
		 pg.getHasWifi(true);
		 pg.getmonthlyRent(200000.00f);
		 pg.getSecurity(3000.00);
		 pg.getContact(789798471l);
		 pg.getGender('m');
		 System.out.println(pg.setContact());
		 System.out.println(pg.setGender());
		 System.out.println(pg.sethasWife());
		 System.out.println(pg.setLocation());
		 System.out.println(pg.setLocation());
		 System.out.println(pg.setMonthlyRent());
		 System.out.println(pg.setPgName());
		 System.out.println(pg.setSecurity());
		 System.out.println(pg.setTotalRoom());
		 System.out.println(pg.setAvailable());
	}

}
