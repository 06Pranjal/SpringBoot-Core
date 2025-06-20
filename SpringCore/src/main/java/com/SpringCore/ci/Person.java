package com.SpringCore.ci;

public class Person {
	private String name;
	private int personid;
	
	public Person(String name,int personId) {
		this.name=name;
		this.personid=personId;
	}

	@Override
	public String toString() {
		
		return this.name+" : "+this.personid;
	}
	
	

}
