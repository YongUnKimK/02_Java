package edu.kh.oop.practice.model.service;

import edu.kh.opp.practice.model.vo.Book;

public class BookService {

	
	public void practice() {
		
		Book book = new Book();
		Book book2 = new Book();
		
		System.out.println(book.toString());
				
		book.setTitle("자바의 정석");
		book.setPrice(30000);
		book.setAuthor("남궁성");
		book.setDiscountRate(0.2d);
		
		
		
		book2.setTitle("c언어");
		book2.setPrice(30000);
		book2.setAuthor("홍길동");
		book2.setDiscountRate(0.1d);

		
		
		
		
		System.out.println("===================================");
		System.out.println("수정된 결과 확인");

		System.out.println(book.toString());
		
		System.out.println("==================================");
		
		System.out.println("도서명 = " + book2.getTitle()  );
		System.out.printf("할인된 가격 = %.0f 원\n", (book2.getPrice()) - (book2.getPrice()) * book2.getDiscountRate());
		
		System.out.println("도서명 = " + book.getTitle() );
		System.out.printf("할인된 가격 = %.0f 원", (book.getPrice()) - (book.getPrice()) * book.getDiscountRate());
		
		
	};
}
