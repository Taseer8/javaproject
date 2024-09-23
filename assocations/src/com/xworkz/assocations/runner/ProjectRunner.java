package com.xworkz.assocations.runner;

import com.xworkz.assocations.things.Developer;
import com.xworkz.assocations.things.Project;
import com.xworkz.assocations.things.Tester;

public class ProjectRunner {
	public static void main(String[] args) {
		Tester tester = new Tester("muqthar",3456,true);
		Developer developer = new Developer("Taseer", 810,true);
		Project project = new Project("health",developer,tester);
		System.out.println(project);
	}

}
