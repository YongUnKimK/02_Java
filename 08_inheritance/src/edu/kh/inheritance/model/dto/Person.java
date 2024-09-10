package edu.kh.inheritance.model.dto;


// DTO ( Data Transfer Object) : 비즈니스 계층과 데이터 교환을 위해 사용하는 객체

//부모로부터 자식이 물려받음 -> 상속
//
//자바에서는 부모객체, 자식객체로 생각하기
//부모객체가 가지고 있는 속성과 기능을 자식객체한테 물려주는 것
//
//자식은 본인이 원래 가지고있던 속성/기능 + 부모의 속성/기능
//
//상속의 장점 ? 
//1. 보다 적은 양의 코드로 새로운 클래스 작성 가능
//2. 코드를 공통적으로 관리하기 때문에 코드의 추가 및 변경 용이
//3. 코드의 중복을 제거하여 프로그램의 생산성과 유지보수에 크게 기여
//
//import 와의 차이점
//import 는 외부 설계도를 수입하는것
//
//클래스 간의 상속 시에는 extends 키워드 사용
//
//표현식 -> [접근제한자] class 클래스명 extends 클래스명 {} ( 뒤가 부모, 앞이 자식)
//
//단일 상속 / 다중 상속 [다중상속은 자바에서미지원, c++에서 가능한 기능]

public class Person /*extends Object*/ {
	
	// Object 클래스
	// - 모든 클래스의 최상위 부모
	// - class 선언부에 상속 구문이 하나도 작성되어있지 않다면
	// 컴파일러가 extends Object 구문을 추가해준다.
	// 속성 (필드)
	private String name;
	private int age;
	private String nationality;
	
	// 생성자
	public Person() {};
	
	//{
		// 초기화블록
		// : 객체가 생성될 떄 변수들을 초기화하기 위해서 사용
		// 요즘엔잘안쓴대요
		
	//}
	
	public Person(String name, int age, String nationality) {
		super(); // 부모의 생성자(Object 클래스의 기본생성자)
		this.name = name;
		this.age = age;
		this.nationality = nationality;
	}
	
	
	
	
	// 기능 ( 메서드 )
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public void breath() {
		System.out.println("사람은 코나 입으로 숨을 쉰다");
	}
	
	public void move() {
		System.out.println("사람은 움직일 수 있다");
	}

	@Override
	public String toString() {
		// Object의 toString() 재정의
		return name + " / " + age + " / " + nationality;
	}
	
}
