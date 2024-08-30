package edu.kh.control.practice;
import java.util.Scanner;
public class ConditionPractice {
//기능 작성 클래스
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
//		키보드로입력받은정수가양수이면서
//		짝수일때만“짝수입니다.”를출력하고
//		짝수가아니면“홀수입니다.“를출력하세요.
//		양수가아니면“양수만입력해주세요.”를출력하세요.
		
		System.out.print(" 숫자를 한 개 입력하세요 :");
		int num = sc.nextInt();
		if (num <= 0) 
		{System.out.println("양수만 입력해 주십시오");}		
		else if(num % 2 == 0) {
			System.out.println("짝수입니다");
		} else {System.out.println("홀수입니다.");}
		
	}
	public void practice2() {
//		국어, 영어, 수학세과목의점수를키보드로입력받고합계와평균을계산하고
//		합계와평균을이용하여합격/ 불합격처리하는기능을구현하세요.
//		 (합격조건: 세과목의점수가각각40점이상이면서평균이60점이상일경우)
//		합격했을경우과목별점수와합계, 평균, “축하합니다, 합격입니다!”를출력하고
//		불합격인경우에는“불합격입니다.”를출력하세요.
		System.out.print("국어 점수 :");
		int lan = sc.nextInt();
		System.out.print("수학 점수 :");
		int math = sc.nextInt();
		System.out.print("영어 점수 :");
		int eng = sc.nextInt();
		int sum = lan + math + eng;
		double avg = sum / 3.0;
		
		if(lan >= 40 & math >= 40 && eng >= 40 && avg >= 60 ) {
			System.out.println("국어 :" + lan );
			System.out.println("수학 :" + math );
			System.out.println("영어 :" + eng );
			System.out.println("합계 :" + sum );
			System.out.println("평균 :" + avg );
			System.out.println("축하합니다, 합격입니다!");			
		} else {System.out.println("불합격입니다.");}
		
		
		
		
		
		
	}
	public void practice3() {
//		1~12 사이의수를입력받아해당달의일수를출력하세요.
//		(2월윤달은생각하지않습니다.)
//		잘못입력한경우“OO월은잘못입력된달입니다.”를출력하세요. 
		System.out.print("1~12 사이의정수입력 : ");
		int month = sc.nextInt();		
		switch (month) {
		case 1,3,5,7,8,10,12 : System.out.printf("%d 월은 31일까지 있습니다",month);; break;
		case 4,6,9,11 : System.out.printf("%d 월은 30일까지 있습니다",month); break;
		case 2 : System.out.printf("%d 월은 28일까지 있습니다",month);break;
		default : System.out.printf("%d 월은 잘못입력된 달입니다", month );
		
		}
//		System.out.print("1~12 사이의정수입력 : ");
//		int month = sc.nextInt();		
//		switch (month) {
//		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
//		System.out.printf("%d 월은 31일까지 있습니다",month);; break;
//		case 2: System.out.printf("%d 월은 28일까지 있습니다",month); break;
//		case 4: case 6: case 9: case 11:
//		System.out.printf("%d 월은 30일까지 있습니다",month); break;
//		default : System.out.printf("%d 월은 잘못입력된 달입니다", month );
//		}
		
		
	}
	public void practice4() {
		
//		키, 몸무게를double로입력받고BMI지수를계산하여계산결과에따라
//		저체중/정상체중/과체중/비만을출력하세요.
//		 BMI = 몸무게/ (키(m) * 키(m))
//		 BMI가18.5미만일경우저체중/  18.5이상23미만일경우정상체중
//		BMI가23이상25미만일경우과체중/  25이상30미만일경우비만
//		BMI가30이상일경우고도비만
		
		System.out.print("키(m)를 입력해주세요");
		Double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해주세요");
		Double weight = sc.nextDouble();
		Double calc = weight / (height * height );
		
		System.out.println("BMI지수 :" + calc);
		if (calc < 18.5) {
			System.out.println("저체중");
		} else if (calc >= 18.5 && calc <= 23) {
			System.out.println("정상체중");
		} else if (calc >= 23 && calc <25) {
			System.out.println("과체중");
		} else if (calc >= 25 && calc < 30 ) {
			System.out.println("비만");
		} else {System.out.println("고도비만");}
		
		
		
	}
	public void practice5() {
//		
//		중간고사, 기말고사, 과제점수, 출석횟수를입력하고Pass 또는Fail을출력하세요.
//		평가비율은중간고사20%, 기말고사30%, 과제30%, 출석20%로이루어져있고
//		이때, 출석횟수는총강의횟수20회중에서출석한날만따진값으로계산하세요.
//		 70점이상일경우Pass,70점미만이거나전체강의에30% 이상결석시Fail을출력하세요
//		
		System.out.print("중간 고사 점수");
		float middle = sc.nextFloat();
		
		System.out.print("기말 고사 점수");
		float end = sc.nextFloat();
		
		System.out.print("과제 점수");
		float as = sc.nextFloat();
		
		System.out.print("출석 횟수");
		float attend = sc.nextFloat();
		
		double midscore = middle * 0.2;
		double endscore = end * 0.3;
		double asscore = as * 0.3;
		float attends = attend;
		float last = (float)(midscore + endscore + asscore + attends);
		
		System.out.println("결과 ===============================================");	
		
		
		if (attend * 5 <= 30 ) { System.out.printf("Fail [출석횟수부족( %.0f / 20)]",attend);} 
		else if (last >= 70 ) { 
			System.out.printf("중간고사점수(20) : %.1f\n", midscore);
			System.out.printf("기말고사점수(30) : %.1f\n", endscore);
			System.out.printf("과제점수(30) : %.1f\n", asscore);
			System.out.printf("출석점수(20) : %.1f\n", attends);
			System.out.printf("총점 : %.1f\n", last);	
			System.out.println(" Pass"); }
		else {
			System.out.printf("중간고사점수(20) : %.1f\n", midscore);
			System.out.printf("기말고사점수(30) : %.1f\n", endscore);
			System.out.printf("과제점수(30) : %.1f\n", asscore);
			System.out.printf("출석점수(20) : %.1f\n", attends);
			System.out.printf("총점 : %.1f\n", last);	
			System.out.println("Fail [점수미달]");}
				
				
				
		
		
		
	}
	
}
