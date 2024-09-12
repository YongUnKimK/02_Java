package com.hw2.model.dto;

public class Prisoner extends Person {

	
	
	private String crime;
	
	public Prisoner() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Prisoner(String id, String name, String crime) {
		super(id, name);
		this.crime = crime;
	}



	public String getCrime() {
		return crime;
	}



	public void setCrime(String crime) {
		this.crime = crime;
	}



	@Override
	public
	String getInfo() {
		// TODO Auto-generated method stub
		 return String.format("Id :  %s, 이름 : %s, 죄목 : %s", 
				id , name, crime);
	}
	
	
}
