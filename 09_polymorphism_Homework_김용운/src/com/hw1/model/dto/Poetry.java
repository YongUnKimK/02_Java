package com.hw1.model.dto;

public class Poetry extends Book{
	
	private int numberOfPoems; // 시 수
	
	public Poetry() {
		// TODO Auto-generated constructor stub
	}
	

	public int getNumberOfPoems() {
		return numberOfPoems;
	}


	public void setNumberOfPoems(int numberOfPoems) {
		this.numberOfPoems = numberOfPoems;
	}


	public Poetry(String title, String author, int numberOfPoems) {
		super(title, author);
		this.numberOfPoems = numberOfPoems;
	}


	@Override
	public void displayInfo() {
		System.out.println("제목 : " + super.getTitle() 
				+ " / " + "저자 : " + super.getAuthor() + "시 수 : " + numberOfPoems);
	}
	
}
