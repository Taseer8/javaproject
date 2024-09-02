package cam.xworkz.project1.things;

import java.time.LocalDate;
import java.time.LocalTime;

public class Think {
	
	public String typeThinking; 
	
	public Think() {
		this("nothing");
		// TODO Auto-generated constructor stub
		System.out.println("no arggument ");
	}
	public Think(String typeThinking ) {
		
	
		System.out.println("one agrument ");
		
	}
	public void getThinkDetails() {
		System.out.println("this is no argumenth and no return type instance mathod");
	}
	public void getThinkType(String thinktype) {
		
		System.out.println("this with one argument and no return type");
	//	this.typeThinking = thinktype;
		System.out.println(thinktype);
		
	}
	public LocalDate getDate(LocalDate date) {
		
		return date;
		
	}
	
	public LocalTime getTime() {
		return LocalTime.now();
		
	}

}
