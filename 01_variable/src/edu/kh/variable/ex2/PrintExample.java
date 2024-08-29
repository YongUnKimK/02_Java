package edu.kh.variable.ex2;

public class PrintExample {
	public static void main(String[] args) {
		
		
		// System.out.print() : 단순 출력용 메서드(출력 후 줄바꿈 x)
		// System.out.println() : 한 줄 출력용 메서드 ( 출력 후 줄바꿈 쑤행)
		// 줄바꿈 여부 차이점은 있지만 괄호안의 내용이
		// 출력되지만 두 메서드 모두 그대로 출력!
		
		// System.out.println() : 자동완성 syso ctrl + space ;
		System.out.println("TEST1번");
		System.out.println("TEST2번");
		
		System.out.print("test3");
		System.out.print("test4");
		
		System.out.println(); // 내용없는 println() : 단순 줄바꿈
		
		System.out.println("응?");
		
		// System.out.printf() : 출력될 문자열 형식을 패턴으로 지정하는 출 력구문

		int iNum1 = 10;
		int iNum2 = 5;
		
		// 10 + 5 = 15
		System.out.println(iNum1 + "+" + iNum2 + "=" + 15 ); // 복잡하다잉
		
		// System.out.printf("패턴", 패턴에 들어갈 값
		
		// 10 + 5 = 15
		
		
		
//		%d : 정수형, %o : 8진수, %x : 16진수
//		%c : 문자, %s : 문자열
//		%f : 실수(소수점아래6자리), %e : 지수형태표현, %g : 대입값그대로
//		%A : 16진수실수
//		%b : 논리형

		// 줄바꿈 안해줌 
		System.out.printf("%d + %d = %d\n", iNum1, iNum2, iNum1+iNum2 );
		// \n : 줄바꿈	
		
		// 10 + 10 * 5 / 2 = 35
		
		System.out.printf("%d + %d * %d / 5 = %d\n", iNum1, iNum1, iNum2, iNum1+(iNum1*iNum2)/ 2 );
		
		//패턴 연습
		int iNum3 = 3;
		System.out.printf("%d\n",iNum3); //3
		System.out.printf("%5d\n", iNum3); // 5칸 공간 확보 후 오른쪽 정렬
		System.out.printf("%-5d\n", iNum3); // 5칸 공간 확보 후 오른쪽 정렬
		
		// 소수점 자리 제어 ( 반올림 처리)
		System.out.printf("%f\n", 10 / 4.0);
		
		// 소수점 둘째 자리까지
		System.out.printf("%.2f\n", 10 / 4.0 );
		System.out.printf("%.0f\n", 10 / 4.0 ); // 소수점 아래를 표현하지 않겠따
		
		// 문자, 문자열, boolean
		boolean isTrue = false;
		char ch = '가';
		String str = "안녕하세용~!"; // 참조형
				
		// flase / 가 / 안녕하세용~! 
				
		System.out.printf("%b / %c / %s\n", isTrue, ch, str );		
		
		// escape(탈출) 문자 : 일반 문자가 아닌 특수문자 표현
		
		//	 \
		System.out.println("\\");
		
		// \o/
		System.out.println("\\o/");
		
		// tab : 한공간씩 표현 x, 한번에 공간차지
		System.out.println("a \t b \t c \t d \t e");
		
		// 유니코드 이스케이프 [ 16진수임니다 ] 
		System.out.println("\u0041 "); //A
		// 65를 16진수로 표현 -> 65나누기 16하면 몫 4, 나머지 1
		
		
		
		
		
		
		
		
		
		
		
	}
}
