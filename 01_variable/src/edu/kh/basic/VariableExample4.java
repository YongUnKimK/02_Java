package edu.kh.basic;

public class VariableExample4 {
	public static void main(String[] args) {
		/* 강제 형변환
		 * -기존 자료형을 원하는 자료형으로 강제로 변환 시키는 것
		 * 
		 * 1) 값의 범위가 큰 자료형을 작은 자료형으로 변환할 떄
		 * 2) 출력되는 데이터의 표기법을 변환시키고 싶을 때
		 * 
		 * 강제 형변환 방법
		 * -자료형을 변환시키고 싶은 값 또는 변수 앞에 (자료형) 을 작성
		 * 
		 * */
		
		double temp = 3.14;
		int num = (int)temp;

		
		System.out.println("temp : " + temp);
		System.out.println("num : " + num);
		// 실수 -> 정수형 변환 시 소수점 버림 처리 [데이터 손실]
		
		// int -> byte 강제 형변환
		
		int iNum = 290;
		byte bNum = (byte)iNum;
		
		System.out.println(iNum);
		System.out.println(bNum);
	
		// 같은 정수형 끼리의 형변환 시에도 값의 범위 차이 떄문에 데이터 손실이 발생할 수 있다.	
	
		// char -> int 강제 형변환
		char ch = 'A'; // 65번쓰
		
		//강제형변환
		System.out.println((int)ch);
	
		// int -> char 강제 형변환
		// 44085
		int iNum3 = 44085;
		System.out.println((char)iNum3);
		
		// 오버플로우 현상은 콤퓨타가 미리 예측할 수 없다!
		// -> 개발자가 미리 예측해야함.
		int i6 = 2147483647;
		int result6 = i6 + 1;
		System.out.println( i6+1 );
		System.out.println( result6 );
		
		
	
	
	
	
	
	
	
	
	
	
	}
	
	
}
