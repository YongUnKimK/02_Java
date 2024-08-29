package edu.kh.op.ex;
import java.util.Scanner;
public class OpExample { // 예제 코드 작성용 클래스

	// 이름이 ex1인 method
	// ex1() method : 객체 지향 프로그래밍에서 
	// OpExample 객체와 관련된 함수
	// -> OpExample이 가지고 있는 기능 중 
	// ex1() 이라는 기능
	public void ex1() {
		// 증감 연산자 : ++, --
		int iNum1 = 10;
		int iNum2 = 10;
		// ?
		iNum1++;
		iNum2--;
		System.out.println("inum1 : " + iNum1); //11
		System.out.println("inum1 : " + iNum2); //9
		
		//전위연산
		int temp1 = 5;
		
		System.out.println( ++temp1 + 5);
		//후위연산
		int temp2 = 3;
		System.out.println( temp2-- +2 );
		
		System.out.println(temp2);
		
		int a = 3;
		int b = 5;
		int c = a++ + --b;
		
		// 최정적으로 a,b,c는 각각 얼마?
		System.out.printf("%d / %d / %d\n", a, b, c);
	}
	
	public void ex2() {
		// 비교 연산자 : > , < , >=, <= , != , ==
		// - 비교연산자의 결과는 항상 논리값(true / false)
		
		int a = 10;
		int b = 20;
		System.out.println( (a==b)  == false);
		//					(false) == false ->true
		
		int c = 4;
		int d = 5;
		System.out.println((++c != d) == (--c != d) );
		// false
	}
	
	public void ex3() {
		
		//논리 연산자 &&(AND) , || (OR)
		
		// && : 둘다 true면 true, 아니면 false
		// 와, 그리고, ~면서, ~부터 ~ 까지, ~사이
		int a = 101;
		// a는 100 이상이면서 짝수인가?
		System.out.println( (a >= 100) && (a % 2 == 0 ));
		
		int b = 5;
		//b는 1부터 10까지 숫자 범위에 포함되어 있는가?
		System.out.println( (b >= 1 ) && ( b < 10 ) );
			
		// || : 둘 중 하나만 true면 true 둘 다 false인 경우에만 false
		// 또는, ~거나
		
		int c = 10;
		
		// c는 10을 초과하거나 짝수인가?
		System.out.println((c > 10 ) || (c % 2 == 0));
		
	}
	public void ex4() {
		
		// 삼항 연산자 : 조건식 ? true 수행값 : false 수행될 값
		
		// * 조건식 : 연산결과가 true / false 인 식
		
		int num = 30;
		
		// num 이 30보다 크면(초과) "num은 30보다 큰 수이다"
		// 아니면 "num은 30 이하의 수이다" 출력
		
//		String result = num > 30 ? "num은 30보다 큰 수이다" : "num은 30 이하의 수이다";
//		
//		System.out.println(result);
//		
//		System.out.println("-----------------------------------");
		
		// 입력 받은 정수가 음수인지 양수인지 구분
		// 단, 0은 양수로 처리
		
		//ex) 
		// 정수 입력 : 4
		// 양수 입니다. 출력
		
		// 정수 입력 : -5
		// 음수 입니다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력 : ");
		
		int input = sc.nextInt();
		
		String result = input >= 0 ? "양수 입니다" : "음수 입니다";
		System.out.println(result);	
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
