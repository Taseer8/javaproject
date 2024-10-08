package com.xwork.clone.things;

public class Bgmi {
	
	public int playerId;
	public String PlayerName;
	
	public Bgmi Clone() {
		System.out.println("clone");
		return (Bgmi) new Bgmi();
	}

	@Override
	public String toString() {
		return "Bgmi [playerId=" + playerId + ", PlayerName=" + PlayerName + "]";
	}
	

}
