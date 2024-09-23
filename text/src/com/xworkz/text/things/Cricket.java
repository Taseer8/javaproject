package com.xworkz.text.things;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Cricket {
	
	private int playerJerseyNo[] =  new  int[4];
	private double StrikeRate ;
	private String playerName;
	private int noOfMatches;
	private int score;
	
	
	
	public int getLength() {
		return this.playerJerseyNo.length;
	}
	
	
	
	public static void main(String[] args) {
		int arge[] = {18, 4 ,3, 7};
		Cricket cricket = new Cricket(arge , 84.00, "virat",300, 189 );
		System.out.println(cricket);
		System.out.println("jerseyno is :"+cricket.getPlayerJerseyNo());
		
	}





}
