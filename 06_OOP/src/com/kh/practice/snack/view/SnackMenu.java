package com.kh.practice.snack.view;

// view : 사용자에게 보여줄 응답화면 관련된 코드가 모인 패키지

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;
import com.kh.practice.snack.model.vo.Snack;

public class SnackMenu {

	private Snack saveData = null;	
	// 필드 
	private Scanner sc = new Scanner(System.in);
	
	private SnackController scr = new SnackController();
	
	
	// 메서드 
	public void menu() {
		
		System.out.println("스낵류를 입력해주세요.");
		
		System.out.print("종류 : ");
		String kind = sc.next();
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("맛 : ");
		String flavor = sc.next();
		
		System.out.print("개수 : ");
		int numOf = sc.nextInt();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		scr.saveData(kind, name, flavor, numOf, price);
		
		System.out.println(	scr.saveData(kind, name, flavor, numOf, price));
		
		String result = sc.next(); // y or n ;
			
		
		if (result.equals("y")) {
			// 저장된 데이터를 출력!
			
			System.out.println(scr.confirmDate());
			
		} else {}
		
		
		
		
		
		
		
	

	
	}
}
