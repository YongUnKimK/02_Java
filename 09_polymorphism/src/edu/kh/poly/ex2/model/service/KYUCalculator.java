package edu.kh.poly.ex2.model.service;

public class KYUCalculator implements Calculator {

	// extends : 확장하다, implements : 구현하다
	// (부)클래스 - (자)클래스 : extends 사용(추상클래스포함)
	// (부)인터페이스 - (자)인터페이스 : extends 사용
	// (부)인터페이스 - (자)클래스 : implements 사용
	// (부)클래스 - (자) 인터페이스 : 상속불가
	
	// 추상클래스 : 공통적인 동작과 상태(일반메서드, 일반필드)를 공유하면서
	// 				일부동작만 다르게 구현하고자 할 때 사용
	
	
	// 인터페이스 : 같은 메서드를 강제구현하면서 다른동작만을 구현하고자 할 때 사용
	
	
	//	상속
	//	(자식클래스의) 공통된 부분을 추출하여 부모클래스를 만드는 것
	//	→ 공통된 필드, 메서드를 가진 클래스를 만들고, 작성된 코드를 자식들이 물려받아 사용.
	//	→ 코드길이 감소, 코드 중복 제거, 재사용성 증가, 자식에 대한 일관된 규칙 제공
	//
	//	[일반 클래스] 상속
	//	부모 클래스도 객체로 만들수 있어야 하는 경우
	//
	//	[추상 클래스] 상속
	//	연관된 클래스의 공통점을 묶되, 부모클래스는 객체로 만들 수 없는 경우
	//	+ 일부 미완성 클래스(abstract 메소드 0개 이상 포함)
	//	EX) Animal 클래스 → 동물 객체는 어떤 동물인가? eat(), breath() 는 어떻게 수행되는가? → 알 수 없음
	//	하지만, 동물의 공통된 기능명은 알고 있음.
	//
	//	[인터페이스] 상속 : 접점
	//	연관성이 낮거나 없는 클래스에게 공통된 기능을 제공할 때 사용.
	//	ex) 키보드, 마우스, 스캐너, 카메라, 기울기 센서 (공통점 : 입력장치)
	//	우연히도 입력이라는 기능을 가지고 있음! → 각각의 용도는 다르지만 입력이라는 공통된 기능명이 있음.
	//	입력이라는 접점!
	//
	//	+ 모든 필드가 묵시적(암묵적) public static final → ex) public static final double PI = 3.141592;
	//	(public static final) double PI = 3.141592; (묵시적)
	//	+ 모든 메서드가 묵시적으로 public abstract(추상메서드) ⇒ 같은 이름을 제공할 뿐이지, 상세한 기능 제공은 하지 않는다.
	//	ex) (public abstract) void input() 
	//  input이라는 이름을 자식에게 제공할 뿐, 상세한 기능은 자식이 알아서 오버라이딩 해라! 그런데 추상메서드니까 오버라이딩 강제화
	
			

	

	@Override
	public int plus(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

	@Override
	public int minus(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}

	@Override
	public int multiple(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 / num2;
	}

}
