package com.hw;

import java.util.*;

public class Service {
	Scanner sc = new Scanner(System.in);
	Set<Book> book = new HashSet<Book>(); 
	List<Book> list = new ArrayList<Book>(book); // 도서목록 저장개체
	public void displayMenu() {
		
		
		
		//List<Book> preferList = new ArrayList<Book>(book); // 즐겨찾기 목록 저장개체
		
		
		Book b1 = new Book(1111, "세이노의 가르침", "세이노", 6480, "데이원");
		Book b2 = new Book(2222, "문과남자의 과학공부", "유시민", 15750, "돌베개");
		Book b3 = new Book(3333, "역행자", "자청", 17550, "웅진지식하우스");
		Book b4 = new Book(4444, "꿀벌의 예언", "베르나르 베르베르", 15120, "열린책들");
		Book b5 = new Book(5555, "도둑맞은 집중력", "요한 하리", 16920, "어크로스");		
		book.add(b1);
		book.add(b2);
		book.add(b3);
		book.add(b4);
		book.add(b5);
		boolean flag = true;
		while(flag == true ) {
		
		System.out.println("=== 도서 목록 프로그램");
		System.out.println("1. 도서 등록 \n");
		System.out.println("2. 도서 조회 \n");
		System.out.println("3. 도서 수정 \n");
		System.out.println("4. 도서 삭제 \n");
		System.out.println("5. 즐겨찾기 추가 \n");
		System.out.println("6. 즐겨찾기 삭제 \n");
		System.out.println("7. 즐겨찾기 조회 \n");
		System.out.println("8. 추천도서 뽑기 \n");
		System.out.println("0. 프로그램 종료 \n");
		System.out.print("메뉴를 입력하세요 : ");
		int input = sc.nextInt();
		
		switch(input) {
		case 1 : addBook() ; break;
		case 2 : bookSearch() ; break;
		case 3 : changeBook() ; break;
		case 4 : /* */ ; break;
		case 5 : /* */ ; break;
		case 6 : /* */ ; break;
		case 7 : /* */ ; break;
		case 8 : /* */ ; break;
		case 0 : flag = false ; break;
		default : System.out.println("잘못된 값을 입력하셨습니다");
		}
		}
	}
	
	public void addBook() {
		System.out.println("===========도서 등록============");
		System.out.print("도서 번호");
		int bookNum = sc.nextInt();
		sc.nextLine();
		
		System.out.print("도서 제목");
		String bookName = sc.nextLine();
		
		System.out.print("도서 저자");
		String author = sc.nextLine();
		
		System.out.print("도서 가격");
		int price = sc.nextInt();
		
		System.out.print("도서 출판사");
		String company = sc.nextLine();
		sc.nextLine();
		
		Book b1 = new Book(bookNum, bookName, author, price, company);
		book.add(b1);
		
		System.out.println("등록 완료");
	}
	
	public void bookSearch() {
		System.out.println(" ===== 도서 목록 조회 =====");
		Collections.sort(list);
		for (Book b: list) {
			System.out.println(b);
			System.out.println();
		}
	}
	
	public void changeBook() {
		
		System.out.println("====도서 수정=====");
		System.out.print("수정할 도서 번호를 입력하세요 : ");
		int inputNum = sc.nextInt();
		
		
		System.out.println("1. 도서명");
		System.out.println("2. 도서 저자");
		System.out.println("3. 도서 가격");
		System.out.println("4. 도서 출판사");
		System.out.println("0. 수정 종료");		
		
		System.out.println("어떤 정보를 수정하겠습니까?");
		int input = sc.nextInt();
		
		switch(input) {
		case 1 :
		 sc.nextLine();
		 System.out.println("== 도서명 수정 ==");
		 System.out.print("수정할 도서명을 입력하세요 : ");
		 String name = sc.nextLine();
		 System.out.println("수정 완료");  break; 
		case 2 : 
		 sc.nextLine();
		 System.out.println("== 도서 저자 수정 ==");
		 System.out.print("수정할 저자명을 입력하세요 : ");
		 String author = sc.nextLine();
		 System.out.println("수정 완료");  break; 
		case 3 : 
		 sc.nextLine();	
		 System.out.println("== 도서 가격 수정 ==");
		 System.out.print("수정할 도서 가격을 입력하세요 : ");
		 int price = sc.nextInt();
		 System.out.println("수정 완료");  break; 
		case 4 : 
		 sc.nextLine();
		 System.out.println("== 도서 출판사 수정 ==");
		 System.out.print("수정할 출판사명을 입력하세요 : ");
		 String company = sc.nextLine();
		 System.out.println("수정 완료");  break; 
		case 0 : System.out.println("수정 종료합니다"); break; 
		}

		
	}
	
}
