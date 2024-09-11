package edu.kh.poly.ex2.model.dto;

public class Fish extends Animal {
	
	
	
	public Fish() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Fish(String type, String eatType) {
		super(type, eatType);
	}


	@Override
	public void eat() {
		System.out.println("입을 뻐끔거리며 먹는다");
		
	}

	@Override
	public void breath() {
		System.out.println("아가미로 호흡을 한다");
		
	}

	@Override
	public void move() {
		System.out.println("꼬리로 헤엄을 친다");
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "fish : " + super.toString();
	}
	
	// alt + shift + s -> Override / implements method... -> ok
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
