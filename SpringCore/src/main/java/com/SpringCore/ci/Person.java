package com.SpringCore.ci;

public class Person {
	private String name;
	private int personid;
	private Certi certi;
	
	public Person(String name,int personId,Certi certi) {
		this.name=name;
		this.personid=personId;
		this.certi=certi;
	}

	@Override
	public String toString() {
		
		return this.name+" : "+this.personid+"{ "+this.certi.name+" }";
	}
	
	

}
