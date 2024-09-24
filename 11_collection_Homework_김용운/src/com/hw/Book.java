package com.hw;

import java.util.Objects;

public class Book implements Comparable<Book>{
	private int number; // 도서번호
	private String name; // 도서제목
	private String author;; //저자
	private int price; //도서가격
	private String company; // 출판사
	
	public Book() {};
	

	public Book(int number, String name, String author, int price, String company) {
		super();
		this.number = number;
		this.name = name;
		this.author = author;
		this.price = price;
		this.company = company;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(author, company, name, number, price);
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
		return Objects.equals(author, other.author) && Objects.equals(company, other.company)
				&& Objects.equals(name, other.name) && number == other.number && price == other.price;
	}


	@Override
	public String toString() {
		return number + "번 도서 : [도서제목 : " + name + " / 도서저자 : " + author + "/ 도서가격 : " + price + "/ 출판사 : " + company + "]" ;
	}


	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return this.number - o.number	;
	}
	
	
	
	
}
