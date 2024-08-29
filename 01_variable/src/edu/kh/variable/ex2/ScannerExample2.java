package edu.kh.variable.ex2;

import java.util.Scanner;
// ctrl + shift + o : 파일에서 import 되지 않은 클래스 모두 import 하는 단축키
	// 정수 : SC.nextInt();
	// 실수 : sc.nextDouble();

public class ScannerExample2 {
	public static void main(String[] args) {
		
		// 사칙연산 계산기
		// -> 두 실수를 입력받아 사칙연산 결과를 모두 출력
		// -> 단, 출력된 결과값은 소수점 이하 2쨰 자리까지만 표현

		// 입력받아 : Scanner 필요함둥		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("실수 1 입력 : ");
		double input1 = sc.nextDouble();
		
		
		System.out.print("실수 2 입력 : ");
		double input2 = sc.nextDouble();
			
		System.out.printf(" %d + %d = %d", input1, input2, (input1 + input2));
		System.out.printf(" %d - %d = %d", input1, input2, (input1 - input2));
		System.out.printf(" %d * %d = %d", input1, input2, (input1 * input2));
		System.out.printf(" %d / %d = %d", input1, input2, (input1 / input2));
}
}