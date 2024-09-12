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
	public
	String getInfo() {
		// TODO Auto-generated method stub
		return String.format("Id :  %s, 이름 : %s, 직책 : %s", 
				id , name, position);
		// id와 name은 Person에서 Protected로 만들어졌기 때문에
		// 후손클래스에서 직접 접 근 가능
	}
	
	

	
}
