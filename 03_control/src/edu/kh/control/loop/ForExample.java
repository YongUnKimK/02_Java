package edu.kh.control.loop;
import java.util.Scanner;
public class ForExample { // 기능제공용클래스
	
	public void ex1() {
		// 1부터 시작해서 10까지 출력
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.println(i);
		}
	}
	public void ex2() {
		//영어 알파벳 A부터 Z 까지 한줄로 출력
		for (int i = 'A'; i < 'Z'; i++) {
			System.out.print((char)i);
		}
	
		System.out.println("=================================");
		
		for(char i = 'A'; i <= 'Z';i++) {
			System.out.print(i);
		}
		
	}
	
	public void ex3() {
		
		// 1부터 입력받은 수까지 1씩 증가하며 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 번호 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input ; i++) {
			System.out.println(i);
		}
	}
	public void ex4() {
		// 정수 5개를 입력받아서 합계 구하기
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		for(int i = 1 ; i <=5 ; i++ ) {
			System.out.print( " 입력 " + i + " : ");
			int input = sc.nextInt();
			
			// sum에 입력받은 input 값 누적
			sum += input;
		}
		System.out.println("합계 : " + sum);
			
		
	}	
	public void ex5() {
		// 1부터 20까지 1씩 증가하면서 출력
		// 단, 입력받은 수의 배수는 양쪽에 () 표시
		
		//ex ) 괄호를 표시할 배수 : 3 
		// 1 2 (3) 4 5 ..... (18) 19 20 
		Scanner sc = new Scanner(System.in);
		
		System.out.print( " 괄호를 표시할 배수 : " );
		int num = sc.nextInt();
		
		
		for (int i =1; i <= 20; i++) {
			if ( i % num == 0) {
				
				System.out.println("(" + i + ") "   ) ;
			} else { System.out.println(i); }
			
		}
		
			
		
		
	}

		
	public void ex6() {
		// [ 구구단 출력 ]
		// 2~9 사이 수를 하나 입력받아
		// 해당 단을 출력
		// 입력받은 수가 2~9 사이 숫자가 아니라면 
		// " 잘못 입력하셨습니다 " 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		if (num >= 2 && num <= 9 ) {
		for ( int i = 1; i <=9 ; i++ ) {
			int sum = num * i;
			System.out.printf("%d X %d = %d\n", num, i, sum);
			}
		} 
		else {System.out.println("올바른 숫자를 입력해 주세요");}
		
	}
	
	public void ex7() {
		// 구구단 모두 출력하기
		
		// 구구단 모두 역순 출력하기
		
		for (int dan = 2 ; dan <= 9 ; dan ++ ) { // 2 ~ 9 단까지 차례대로 증가
			
			for (int num =1 ; num <= 9 ; num ++) {
				System.out.printf("%d X %d = %2d  ", dan, num, dan * num );
				
			}
			System.out.println(); // 줄바꿈
			
			
		}
		System.out.println("==============================================");	
		// 구구단 모두 역순 출력하기
		// 9단 -> 2단까지 역방향
		// 곱해지는 수는 1 - > 9까지 정방향
		
		for (int dan = 9 ; dan >= 2 ; dan--) {
			
			for (int num =1 ; num <= 9 ; num ++) { // 각 단에 곱해질 수 1~9까지 증가
				System.out.printf("%d X %d = %2d  ", dan, num, dan * num );
				
			}
			System.out.println(); // 줄바꿈
			
			
			
		}
		
		
		
		
		
	}

	public void ex8() {
		// 숫자 세기 count
		
		// 1부터 20까지 1씩 증가하면서 
		// 입력받은 수의 배수의 총 개수 출력
		// 입력받은 수의 배수의 합계 출력
		
		// 배수 입력 : 3 
		// 3 6 9 12 15 18 : 6개
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int count = 0; // n의 배수를 세기위한 변수
		String result = "";
		
		System.out.print(" 배수 입력 : ");
		int input = sc.nextInt();
		for ( int i = 1 ; i <= 20 ; i ++) {
			if( i % input == 0) { // 배수 일 떄
				result += i + " " ;
				count++;
				sum += i;
			} 			
		} 
		System.out.printf("%s : %d개\n", result, count);
		System.out.printf("%d의 배수 합계 : %d", input, sum);
		
		
		
	}
	
	
 }
