package edu.kh.inheritance.model.dto;
/*
 * Object
 *  ㄴ Person
 *      ㄴ Employee
 * final 클래스
 * 제공되는 클래스 그대로 사용해야 하는 경우
 * 
 * */

public /*final*/ class Employee extends Person {
	
	// 필드
	private String company;

	
	
	// 생성자
	public Employee() {}
	
	
	// 메서드
	// 자동완성 alt + shift + s -> o
	// Select super constructor to invoke 에서
	// 매개변수 있는 부모 생성자 선택
	public Employee(String name, int age, String nationality, String company) {
		super(name, age, nationality);
		this.company = company;
	}


	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	
	// Person으로부터 상속받은 메서드 중
	// mover() 메서드를 Employee에 맞게 재정의( == 오버라이딩)
	
	// @Override 어노테이션 : 해당 메소드가 오버라이딩 되었음을
	// 					컴파일러에게 알려주는 역할 -> 컴파일러에게 문법체크 등 하도록 알린다
	
	// 어노테이션(Annotation) : 컴파일러 인식용 주석
	
	@Override
	public void move() {
		System.out.println("오버라이딩된 move()");
		System.out.println("효율적으로 빨리 일하고 퇴근한다");
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+ " / " + company;
	}
	
	public final void onlyEmployee() {
		
/* final 메서드 -> 오버라이딩 불가
 * 
 * 메서드의 기능이 변하면 안되는 이유
 * */
		System.out.println("final 매서드입니다?");
		
	}
}