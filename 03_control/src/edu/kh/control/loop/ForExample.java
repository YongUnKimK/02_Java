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
	
	
 }
