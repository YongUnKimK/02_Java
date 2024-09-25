package com.hw;

import java.util.Objects;

public class Book implements Comparable<Book>{
	private int bookNum; // 도서번호
	private String title; // 도서제목
	private String writer;; //저자
	private int price; //도서가격
	private String publisher; // 출판사
	
	public Book() {}

	public Book(int bookNum, String title, String writer, int price, String publisher) {
		super();
		this.bookNum = bookNum;
		this.title = title;
		this.writer = writer;
		this.price = price;
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return bookNum + "번 도서 : [도서제목 : " + title + " / 도서저자 : " + writer + "/ 도서가격 : " +price + " 원 / 출판사 : " + publisher + " ]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(bookNum, price, publisher, title, writer);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return bookNum == other.bookNum && price == other.price && Objects.equals(publisher, other.publisher)
				&& Objects.equals(title, other.title) && Objects.equals(writer, other.writer);
	}

	public int getBookNum() {
		return bookNum;
	}

	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return 0;
	};
	
	
	
	
	
	
}
