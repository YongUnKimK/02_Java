package edu.kh.op.practice;
import java.util.Scanner;
public class OperatorPractice3 {
	
	
	public void practice4() {
		
		Scanner sc4 = new Scanner(System.in);
		
		System.out.print("가격을 입력하세요 : ");
		float price = sc4.nextFloat();
		System.out.print("멤버십을 보유하고 계십니까? ( 있으면 true, 없으면 false");
		String member = sc4.next() ;
		
		
		float lastprice = member == "true" ? 0.9f : 0.95f;
		float discount = price * lastprice;
		System.out.printf("할인을 포함한 최종가격 :  %.1f" , discount);
		
	}
	public void practice5() {
		
		Scanner sc5 = new Scanner(System,in);
		
//		
//		문제2)
//	ATM에서 사용자가 원하는 금액을 입력하면, 5만원, 1만원, 5천원, 1천원 단위로 최소 개수의 지폐로 돈을 인출하라
//	ex) 사용자가 123000원을 입력하면, 5만원 지폐 2장, 1만원 지폐 2장, 5천원 지폐 0장, 1천원 지폐 3장이 필요함
//
//	메서드 : public void practice2() {}
//
//	[실행화면]
//	출금할 금액 입력 : 123000
//	50000원: 2
//	10000원: 2
//	5000원: 0
//	1000원: 3
//
//
//	출금할 금액 입력 : 253000
//	50000원: 5
//	10000원: 0
//	5000원: 0
//	1000원: 3
//		
//	}
	public void practice6() {}
}
