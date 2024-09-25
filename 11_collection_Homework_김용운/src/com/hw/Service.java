package com.hw;

import java.util.*;

public class Service {
	//필드
	private Scanner sc = new Scanner(System.in);
	private List<Book> library = new ArrayList<Book>(); 
	// 부모타입 참조변수 = 자식객체의 주소 (다형성 중 업캐스팅)
	
	// 즐겨찾기 도서를 저장할 목록 List
	private List<Book> favList = new ArrayList<Book>();
	
	public Service() {
		library.add(new Book(1111, "세이노의 가르침", "세이노", 6480, "데이원"));
		library.add(new Book(2222, "문과남자의 과학공부", "유시민", 15750, "돌베개"));
		library.add(new Book(3333, "역행자", "자청", 17550, "웅진지식하우스"));
		library.add(new Book(4444, "꿀벌의 예언", "베르나르 베르베르", 15120, "열린책들"));
		library.add(new Book(5555, "도둑맞은 집중력", "요한 하리", 16920, "어크로스"));
	}
	public void displayMenu() {
		
		try {
			int menuNum = 0;
			do {System.out.println("=== 도서 목록 프로그램");
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
			menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1 : System.out.println(addBook()); ; break;
			case 2 : showBookList(library) ; break;
			case 3 : System.out.println(editBook()); ; break;
			case 4 : System.out.println(deleteBook()); ; break;
//			case 5 : addFavorit() ; break;
//			case 6 : deleteFavorite() ; break;
			case 7 : showBookList(favList) ; break;
			case 8 : randomBook() ; break;
			case 0 : System.out.println("종료되었습니다."); ; break;
			default : System.out.println("잘못된 값을 입력하셨습니다");
				
				}
			} while( menuNum !=0) ;
			
		}
			
		catch(Exception e ) {
			// Exception : 예외 클래스의 최상위 클래스
			System.out.println("오류 발생");
			e.printStackTrace(); // 예외추적
		}
		
	}
	
	
	/* 도서 등록 메서드
	 * 
	 */
	public String addBook() throws Exception{
		System.out.println("===========도서 등록============");
		System.out.print("도서 번호 : ");
		int bookNum = sc.nextInt();
		sc.nextLine(); // 입력버퍼에 남은 개행문자 제거용
		
		System.out.print("도서 제목");
		String title = sc.nextLine();
		
		System.out.print("도서 저자");
		String writer = sc.nextLine();
		
		System.out.print("도서 가격");
		int price = sc.nextInt();
		sc.nextLine();
		
		System.out.print("도서 출판사");
		String publisher = sc.nextLine();
		
		Book newBook = new Book(bookNum, title, writer, price, publisher);
		library.add(newBook);
		
		if(library.add(new Book(bookNum, title, writer, price, publisher))) {
			// boolean java.util.List.add(Student)
			// (반환형)                             -> 제네릭 <Student>대문에 List 에 추가할 수
			//												있는 객체 타입이 Student 로 제한됨.
			
			return "등록 완료";
		} else {
			return "등록 실패";
		}
		
		
	}
	
	/* 도서 목록 조회용 메서드
	 * @param List<Book>
	 * 
	 */
	public void showBookList(List<Book> list) {
		
		
		if(list.isEmpty()) {
			System.out.println("등록된 도서가 없습니다. 도서를 등록해주세요!");
		} else {
			System.out.println(" ===== 도서 목록 조회 =====");
			// list를 순회하면서 각 Book 객체를 출력
			for (Book temp : list) {
				System.out.println(temp); // Book.toString() ;
			}
		}
	}
	
	/** 도서 수정용 메서드
	 *  @return
	 */
	public String editBook() throws Exception {
		
		showBookList(library); //등록된 도서를 출력하기
		System.out.println("====도서 수정=====");
		int editMenu = 0; // 수정 메뉴 선택용 변수
		

		System.out.print("수정할 도서 번호를 입력하세요 : ");
		int bookNum = sc.nextInt();
		
		boolean flag = true;
		
		for( Book temp : library) {
			if(temp.getBookNum() == bookNum) { // 입력한 도서번호와 도서목록의 번호가 일치할 때
				flag = false;
				System.out.println("1. 도서명");
				System.out.println("2. 도서 저자");
				System.out.println("3. 도서 가격");
				System.out.println("4. 도서 출판사");
				System.out.println("0. 수정 종료");
				
				System.out.print("어떤 정보를 수정하겠습니까?");
				editMenu = sc.nextInt();
				sc.nextLine(); //개행문자 제거
				
				switch(editMenu) {
				case 1 :				 
				 System.out.println("== 도서명 수정 ==");
				 System.out.print("수정할 도서명을 입력하세요 : ");
				 String title = sc.nextLine();
				 temp.setTitle(title); break;
				
				case 2 : 				
				 System.out.println("== 도서 저자 수정 ==");
				 System.out.print("수정할 저자명을 입력하세요 : ");
				 String writer = sc.nextLine();
				 temp.setWriter(writer); break;
				case 3 : 					
				 System.out.println("== 도서 가격 수정 ==");
				 System.out.print("수정할 도서 가격을 입력하세요 : ");
				 int price = sc.nextInt();
				temp.setPrice(price); break;
				case 4 : 				
				 System.out.println("== 도서 출판사 수정 ==");
				 System.out.print("수정할 출판사명을 입력하세요 : ");
				 String publisher = sc.nextLine();
				 temp.setPublisher(publisher); break;
				 
				case 0 : System.out.println("수정 종료합니다"); break; 
				default : System.out.println("메뉴에 있는 번호만 선택하세요"); break;
				}
			}
		}
		
		if ( flag ) {
			return " 일치하는 도서 번호가 존재하지 않습니다.";
		}
		return "수정 완료";
	}
	
	/**도서 삭제용 메서드
	 * @return
	 */
	public String deleteBook() {
		System.out.println("===== 도서 삭제 =====");
		
		showBookList(library);
		
		System.out.print("삭제할 도서의 번호를 입력하세요 : ");
		int deleteNum = sc.nextInt();
		
		for ( Book temp : library) {
			if (temp.getBookNum() != deleteNum) {
				return "일치하는 번호가 존재하지 않습니다";
			}
				
				
			if(temp.getBookNum() == deleteNum) {
				int index = library.indexOf(temp); 
				// int List.indexOf(Object) : List에 일치하는 객체가 있으면 그 객체가 있는 index번호 반환
				
				System.out.println("index 번호 : " + index);
				
				System.out.println("정말 삭제 하시겠습니까? (Y/N) : ");
				
				char answer = sc.next().toUpperCase().charAt(0); // "y" -> "Y" -> 'Y'
				if(answer == 'Y') {
					library.remove(index); break;
				} else {
					return "삭제를 진행하지 않습니다";
				}
			}
		}
		
		
		return "삭제 완료";
	}
	
	/** 추천 도서 뽑기
	 * 
	 */
	public void randomBook() {
		
		int max = library.size();
		
		int random = (int)(Math.random() * max); // 0 ~ 리스트의 마지막인덱스번호
		
		System.out.println(library.get(random).getTitle());
	}
}
