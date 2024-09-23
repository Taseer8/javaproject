package com.xworkz.assocations.things;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Project {
	
	private String projectName;
	private Developer developer;
	private Tester tester;

}
