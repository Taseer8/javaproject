package com.xworkz.Television.constants;

import lombok.Getter;

@Getter

public enum TvEnum {
	

	SMALL(32), MEDIUM(42), LARGE(64);
	
	private double screenSize;

	TvEnum(double screenSize) {
		this.screenSize = screenSize;
	}

	

}
