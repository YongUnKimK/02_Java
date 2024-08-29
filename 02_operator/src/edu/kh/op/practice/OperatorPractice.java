package edu.kh.op.practice;
import java.util.Scanner;
public class OperatorPractice { //기능 제공 클래스
	public void practice1() {	
//		모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고
//		1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
		
		// 사탕 개수를 인원 수로 나누고 // 나머지를 출력함.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 입력: ");
		int inputpeople = sc.nextInt(); 
		System.out.print("사탕 개수 입력: ");				
		int inputcandy = sc.nextInt();	
				
		System.out.printf("1인당 사탕 개수 : %d", inputcandy / inputpeople);
		System.out.println();
		System.out.printf("남는 사탕 개수 : %d", inputcandy % inputpeople);
		
	}
	public void practice2() {	
//	ex.
//		이름 : 홍길동
//		학년(정수만) : 3
//		반(정수만) : 4
//		번호(정수만) : 15
//		성별(남학생/여학생) : 남학생
//		성적(소수점 아래 둘째 자리까지) : 85.75
//		3학년 4반 15번 홍길동 남학생의 성적은 85.75이다.;
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println();
		
		System.out.print("이름 : ");
		String name = sc1.next();
		
		System.out.print("학년(정수만) : " );
		int year = sc1.nextInt();
		
		System.out.print("반(정수만) : " );
		int group = sc1.nextInt();
		
		System.out.print("번호(정수만) :" );
		int number = sc1.nextInt();
		
		System.out.print("성별(남학생/여학생 :");
		String gender = sc1.next();
		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		System.out.println();
		float grade = sc1.nextFloat();
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %f이다. ", 
				year, group, number, name, gender, grade);
	
		
		
		
	}
	public void practice3() {	
//		메소드 명 : public void practice3(){}
//		국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
//		세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
//
//		[실행화면]
//		국어 : 60
//		영어 : 80
//		수학 : 40
//		합계 : 180
//		평균 : 60.0
		System.out.println();
		Scanner sc2 = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int lan = sc2.nextInt();
		
		
		System.out.print("영어 : ");
		int math = sc2.nextInt();
		
		
		System.out.print("수학 : ");
		int eng = sc2.nextInt();
		int sum = lan + math + eng ;
		float aver = (lan + math + eng) / 3;		
		
		
		System.out.println("합계 : " + (lan + math + eng));
		System.out.printf("평균 : "  + aver );
		
		
	}
	
}
