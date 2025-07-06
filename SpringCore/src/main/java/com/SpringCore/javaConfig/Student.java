package com.SpringCore.javaConfig;


public class Student {
	
	private Samosa samosa;
	
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public void Study() {
	this.samosa.display();	
	System.out.println("Student is Studying");

}
}
