package com.xworkz.resume.things;


public class TaseerResume  implements Resume  {

	@Override
	public void addResumeDetails() {
		System.out.println("Resume  Details" );
	}

	@Override
	public void addPersonalDetails() {
		System.out.println("personal impormation");
		System.out.println("my slef:"+Resume.name);
		System.out.println("my email:"+Resume.email);
	}

	@Override
	public void hobbies() {
	System.out.println("hobbies are : Playing cricket, volly ball, batmanten, carrom, reading holibooks ");
	}

	@Override
	public void addEducationDetails() {
		System.out.println("Education details");
		System.out.println("SSlC");
		System.out.println("PUC");
		System.out.println("B.Tech");
		
	}

	@Override
	public void addTechnicalSkills() {
		System.out.println("my technical skils");
		System.out.println("Fornt End Technology are: HTML, CSS, JS, ");
		System.out.println("JAVA :ENCAPLATION, INHERITANCE(SINGLE, MULTI,  HYRIRCHICAL),POLIMORPHISUM(COMPILE TIME , RUN TIME) ");
		
	}
	@Override
	public void addProjectDetails() {
		System.out.println("my final project is SocialMedia Webapplication using React");
		System.out.println("i have 6 months of exprince as a intern and i was doing a project on react and the topic is Resturnat table booking ");		
	}

}
