package edu.kh.oop.practice.model.service;

import edu.kh.opp.practice.model.vo.Book;

public class BookService {

	
	public void practice() {
		
		// 1) 기본생성자를 이용하여 첫 번째 Book 객체 생성
		Book book1 = new Book();  // Book() -> 기본생성자
		
		
		// 2) 매개변수 생성자를 이용해서 두 번째 객체 생성
		Book book2 = new Book("자바의정석",30000, 0.2, "남궁성"); 
		
		// 3) 객체가 가진 필드 값을 toString()을 이용하여 출력
		
		
		System.out.println(book1.toString());
		System.out.println(book2.toString());		
		
		// 4) 첫 번째 객체가 가진 값을 setter을 이용하여 수정
		book1.setTitle("c언어");
		book1.setPrice(30000);
		book1.setAuthor("홍길동");
		book1.setDiscountRate(0.1d);
		
		//5) 수정된 객체의 필드 값을 toString() 메서드 이용하여 출력
		
		System.out.println("===================================");
		System.out.println("수정된 결과 확인");
		System.out.println(book1.toString());		
		System.out.println("==================================");
		
		
		// 6) 각 객체의 할인율을 적용한 책 가격을 계산하여 출력
		// 할인된 가격 = 가격 - (가격 * 할인율) 

		System.out.println("도서명 = " + book1.getTitle() );
		System.out.printf("할인된 가격 = %.0f 원\n", (book1.getPrice()) - (book1.getPrice()) * book1.getDiscountRate());
		
		System.out.println("도서명 = " + book2.getTitle()  );
		System.out.printf("할인된 가격 = %.0f 원\n", (book2.getPrice()) - (book2.getPrice()) * book2.getDiscountRate());
		
		
	};
}
