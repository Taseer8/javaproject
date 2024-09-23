package com.xworkz.assocations.things;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Developer {
	
	private String developerName;
	private int developerId;
	private boolean workingonThisProject;
	
	

}
