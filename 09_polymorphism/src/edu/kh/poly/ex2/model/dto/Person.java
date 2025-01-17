package edu.kh.poly.ex2.model.dto;

public class Person extends Animal {

	//the type Person must implement the inherited abstract method Animal.move()
	// Animal의 추상메서드를 오버라이딩 하지 않으면 오류 발생 -> 강제화
	
	private String name;
	
	public Person() {}
	
	
	public Person(String type, String eatType, String name) {
		super(type, eatType);
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public void eat() {
		System.out.println("숟가락, 젓가락 등 도구 이용하여 먹는다");
		
	}

	@Override
	public void breath() {
		System.out.println("코와 입으로 숨을 쉰다.");
		
	}

	@Override
	public void move() {
		System.out.println("이족보행");
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Person : " +  super.toString() + " / " + name;
	}
	
	
	
	
	
}
