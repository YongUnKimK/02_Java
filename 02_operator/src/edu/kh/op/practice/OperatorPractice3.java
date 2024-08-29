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
		
		Scanner sc5 = new Scanner(System.in);
		
		System.out.println("출금할 금액 입력");
		int amount = sc5.nextInt();
		
		int fifty = amount / 50000;
		amount %= 50000;		
		
		int tent = amount / 10000;
		amount %= 10000;
		
		int five = amount / 5000;
		amount %= 5000;
		
		int one = amount / 1000;
		amount %= 1000;
		
		System.out.println("50000원 : " + fifty);
		System.out.println("10000원 : " + tent);
		System.out.println("5000원 : " + five);
		System.out.println("10000원 : " + one);
		
		
		
	}		
	public void practice6() {
		
		Scanner sc6 = new Scanner(System.in);
		
		System.out.println("첫 번째 수 : ");
		int first = sc6.nextInt();
		System.out.println("두 번째 수 : ");
		int second = sc6.nextInt();
		
		String result = second % first == 0 ? "배수입니다." : "배수가 아닙니다";
		
		System.out.println(result);
		
	}
}
