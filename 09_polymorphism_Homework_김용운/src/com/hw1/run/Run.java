package com.hw1.run;

import com.hw1.model.dto.Book;
import com.hw1.model.dto.Novel;
import com.hw1.model.dto.Poetry;
import com.hw1.model.dto.Textbook;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Book[] arr = new Book[3];
		
		arr[0] = new Novel("해리 포터", "J.K. 톨킨", "판타지");
		arr[1] = new Textbook("자바 프로그래밍", " James Gosling", "컴퓨터 과학");
		arr[2] = new Poetry("우리들의 사랑시", "김소월", 30);
		
		for (int i = 0; i< arr.length; i++) {
			
			switch(i ) {
			case 0 : System.out.print("[소설] "); break;
			case 1 : System.out.print("[전문서적] "); break;
			case 2 : System.out.print("[시집] "); break;
			}
			arr[i].displayInfo();
			
		}
		// for ( Book book : arr ) {
		//	 book.displayInfo();
		//	System.out.println();}
		//
		//
		//
	}

}
