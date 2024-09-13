package com.xworkz.resume.terster;

import com.xworkz.resume.things.Resume;
import com.xworkz.resume.things.TaseerResume;

public class ResumeTester {

	public static void main(String[] args) {
		Resume resume = new TaseerResume();
		resume.addResumeDetails();
		resume.addPersonalDetails();
		resume.addEducationDetails();
		resume.addTechnicalSkills();
		resume.hobbies();
		resume.addProjectDetails();
		
	}

}
