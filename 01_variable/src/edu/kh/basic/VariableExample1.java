package edu.kh.basic;

public class VariableExample1 {
	public static void main(String[] args) {
		
		/* 변수 (Variable)
		 * -메모리 (ram)에 값을 기록하는 공간
		 * -> 공간에 기록되는 값(Data)이 변할 수 있어서 변수라고 한다.
		 * 
		 * -변수는 여러 종류 존재 ( 저장되는 값의 형태, 크기가 다름)
		 * 변수 사용의 장점
		 * 1. 가독성 증가
		 * 2. 재사용성 증가 ( 한번 만든 변수를 계속 사용)
		 * 3. 코드 길이 감소
		 */
		//변수 사용
		double pi = 3.1415926235 ; // 원주율
		int r = 5; 
		int h = 20;
		
		System.out.println(2 * pi * r);
		System.out.println(pi * r * r);
		System.out.println(pi * r * r * h); // 원기둥의 부피
		System.out.println(4 * pi * r * r); // 구의 겉넓이
		
		/* 논리형 변수 선언 : boolean isTrue;
		 * 문자형 변수 선언 : char ch; [홑따옴표써야함]
		 * 문자열 변수 선언 : String str; [참조형 변수라서 성질이 조금 다름]
		 * 정수형 변수 선언 : byte bNum; , short sNum; , int iNum; , long lNum;
		 * 실수형 변수 선언 : float fNum; , double dNum; 
		 * */
		
	}
}
