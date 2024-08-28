package edu.kh.basic;

// 한 줄 주석 : 컴파일러가 해석하지 않는 부분
/* 범 위 주 석
 웹개발시 패키지명의 명명규칙
	-소문자
	-도메인 이름 역순
	-최소3레벨
	
	클래스 파일 명명규칙
	 - 대문자시작
	 - 단어구분시 각 단어의 첫글자 대문자 표기
	 - 특수문자 금지
 * */

// class : 자바 코드가 작성되는 영역

public class JavaBasic {

	// main 쓰고 ctrl + space -> 맨 위에 main method 자동완성 enter

	public static void main(String[] args) {
		// main method(메서드) : 자바 애플리케이션(프로그램)을 실행하기 위해
		// 반드시 필요한 메서드

		// 콘솔창에 출력할때 쓰는 메서드
		System.out.println("hi world!!!!!");
		System.out.println("오늘점심머먹지 ㅋ");

		System.out.println("---------------------------------");

		// 숫자 연산
		System.out.println(" 1 + 2 ");
		System.out.println(1 + 2);

		// ""안에 작성된 코드는 단순 문자열로 인식
		// ""안에 작성되지 않은 코드는 숫자, 변수로 인식
		// syso + ctrl + space => System.out.printLn 자동완성
		// 실행 : ctrl + F11

		System.out.println(50 - 23);
		System.out.println(60 * 2);
		System.out.println(60 / 2);
		System.out.println(3 % 2);

		// "" ( 문자열 ) + 숫자 함께 작성
		System.out.println("14 * 19 = " + 266);
		System.out.println("14 * 19 = " + 14 * 19);

		System.out.println("90 + 70 + 65 = " + (90 + 70 + 65));
		// 자바는 사칙연산의 우선 순위를 그대로 따른다
		// -> 우선 계산을 원하면 () 사용하면 된당

		// +기호의 역할
		// -> 숫자 + 숫자 = 덧셈 연산 결과
		// -> 문자열 + 숫자 or 문자열 + 문자열 = 이어쓰기
		//
		
		// 다음장 //
		
		
		

	}
}

// 생성된.java 파일과 class 오른쪽에 작성된 이름은 같아야 한다!!
