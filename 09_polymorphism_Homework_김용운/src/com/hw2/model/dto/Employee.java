package com.hw2.model.dto;

public class Employee extends Person {

	
	
	private String position;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String id, String name, String position) {
		super(id, name);
		this.position = position;
	}




	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	String getInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	
}
