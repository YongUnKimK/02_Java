package edu.kh.oop.practice.run;

import edu.kh.oop.practice.model.service.BookService;
import edu.kh.oop.practice.model.service.HeroService;

public class PracticeRun {
	public static void main(String[] args) {
		
		BookService book = new BookService();
		// 클래스 안에 생성자가 하나도 없다면
		// 컴파일러가 기본생성자는 자동으로 맹글어줌
		// -> 그래서 우리가 BookService() 이렇게 사용 가능하다!
		// -> 생성자가 하나라도 있으면 기본생성자 자동으로 생성 안해줌
		// -> 매개변수 생성자 만들었다면, 기본생성자 개발자가 만들어야함
//		book.practice();
		
		HeroService hero = new HeroService();
		
		hero.practice();
		
	}
}

//	현실 객체 : 인식 가능한 물체, 범위, 관념 등등을 총칭하는 것
//	객체 지향 언어 : object oriented language 객체를 목표로 하는 언어
//	자바 객체 : 클래스, 메서드 같이 기능이 있는것?
//	class : 필드, 생성자, 메서드로 이루어진 녀석
//	new 연산자 : 새로운 연산자를 만드는 생성자?
//	추상화 : 공통된 특징을 추출하고, 개인적인 특징은 제거하는것
//	캡슐화 : 정보의 직접적인 접근을 막아, 정보 보호를 하고, 데이터손실을 막는것 private 를 써서
//	캡슐화 원칙 : 데이터의 직접적인 접근을 막는것
//	메서드/기능의 '정의'란 : 메서드/기능이 이러이러한 동작을 할수있다고 설계해놓은 것
//	메서드의 '호출' 이란 : 메서드가 이런 기능을 가지고 있는데, 작동하도록 부르는것?
//	return : 함수종료, return 뒤에있는 값을 반환하는 것
//
//	public String ex1() {
//  return "Hi";
//}}
//
//위 메서드 상세히 해석 : Hi라는 문자열을 ex1으로 반환하는 기능을 가진 메서드
