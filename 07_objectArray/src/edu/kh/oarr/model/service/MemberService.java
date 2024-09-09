package edu.kh.oarr.model.service;

import java.util.Scanner;

import edu.kh.oarr.model.vo.Member;

public class MemberService {
	
	// 속성
	private Scanner sc = new Scanner(System.in);
	
	// Member 5칸짜리 객체배열 선언 및 할당
	private Member[] memberArr = new Member[5];
	
	// 현재 로그인한 회원의 정보를 저장할 변수 선언
	private Member loginMember = null;
	
	public MemberService() { // 기본생성자
		
		// memberArr 배열 0, 1, 2 인덱스 초기화
		memberArr[0] = new Member("user01", "pass01", "홍길동", "서울", 30);
		memberArr[1] = new Member("user02", "pass02", "계보린", "경기", 25);
		memberArr[2] = new Member("user03", "pass03", "고길동", "강원", 45);
		
		
		
		
		
		
		
		
	}
	
	//기능
	
	// 메뉴 출력용 메서드
	public void displayMenu() {
		
		int menuNum = 0 ; //메뉴 선택용 변수
		
		// 무조건 한 번은 수행 (do~while)
		do {
			System.out.println("============회원정보 관리 프로그램ver.2");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 정보 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("5. 회원 정보 검색(지역)");
			System.out.println("0. 프로그램 종료");
			
			System.out.println("메뉴 입력 : ");
			menuNum = sc.nextInt();
			// 입력버퍼에 남은 개행문자 제거			
			sc.nextLine();
			
			switch (menuNum) {
			case 1 : System.out.println(signUp()); break;
			case 2 : System.out.println(login()); break;
			case 3 : System.out.println(selectMember()); break;
			case 4 : 
				if ((updateMember() == -1)) { System.out.println("로그인을 먼저 진행해 주세요"); }
				else if ((updateMember() == 1)) { System.out.println("정보 수정 완료");}
				else if ((updateMember() == 0)) { System.out.println("비밀번호 틀림");
				}break;
			case 5 : searchRegion(); break;
			case 0 : System.out.println("프로그램을 종료합니다"); break;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력하세요");
			}
		} while(menuNum != 0); } // munuNum이 0이되면 반복 종료
		
		// memberArr의 비어있는 인덱스 번호를 반환하는 메서드 
		// 단, 비어있는 인덱스가 없다면 -1 반환
		public int emptyIndex() {
			// memberArr 배열을 0 인덱스부터 끝까지 접근해서
			// 참조하는 값이 null 인경우 인덱스를 반환
			for(int i = 0; i < memberArr.length; i++) {
				
				if(memberArr[i] == null) {
					return i;
					// 현재 메서드를 종료하고 호출한곳으로 i 값을 가지고 돌아감
				}
			}
		// for 문을 수행했지만 return 이 되지 않은 경우 해당위치 코드 수행된다!
		// -> for 문에서 return 되지 않았다 == 배열에 빈칸이 없다
			return -1;
			
		}
		
		// 회원가입 메써뜨
		
		public String signUp() {

			System.out.println("\n ==============회원 가입================");
			
			// 객체배열 memberArr에 새로 가입할 회원 정보를 저장할 예정
			// -> 새로운 회원 정보를 저장할 공간이 있는지 확인하고
			// 빈 공간의 인덱스 번호를 얻어오기
			
			int index = emptyIndex() ; // memberArr 배열에서 비어있는 인덱스 반환받음
										// 없다면 -1반환
			
			if(index == -1) {// 비어있는 인덱스가 없을경우 -> 회원가입불가능
				return " 회원 가입 불가능 합니다(인원 수 초과)";
			}
			System.out.print("아이디 : ");
			String memberId = sc.next();
			
			System.out.print("비밀번호 : ");
			String memberPw = sc.next();
			
			System.out.print("비밀번호 확인 : ");
			String memberPw2 = sc.next();
			
			System.out.print("이름 : ");
			String memberName = sc.next();
			
			System.out.print("나이 : ");
			int memberAge = sc.nextInt();
			
			System.out.print("지역 :");
			String region = sc.next();
			
			
			// 비밀번호, 비밀번호 확인이 일치하면 회원가입
			// 일치하지 않으면 회원가입 실패
			if( memberPw.equals(memberPw2)) {
				
				// 새로운 Member 객체 생성해서 할당된 주소를
				// memberArr의 비어있는 인덱스에 대입
				memberArr[index] = new Member(memberId, memberPw, memberName, region, memberAge);
				
				return "회원 가입 성공 !! " ; 
			} else { // 불일치 경우
				
			}
			
			 return "회원 가입 실패!!!(비밀번호 불일치)";
			
			
		}
		
		
		//로그인 메서드
		
		public String login() {
			
			System.out.println("\n============로그인===============");
			
			System.out.println("아이디 입력 : ");
			String memberId = sc.next();
			
			System.out.println("비밀번호 입력 : ");
			String memberPw = sc.next();
			
			// 1) memberArr 배열 내 요소를 순서대로 접근하여  null이 아닌지 확인
			for (int i = 0 ; i < memberArr.length; i++ ) {
				
				if ( memberArr[i] != null) { // 회원정보가 있을 경우
					// 2) 회원정보의 아이디, 비밀번호와 입력받은 아이디, 비밀번호가 같은지 비교
					
					if( memberArr[i].getMemberId().equals(memberId) 
							&& memberArr[i].getMemberPw().equals(memberPw)) {
						// 3) 로그인 회원 정보 객체를 참조할 변수 loginMember에
						// 현재 접근중인 memberArr[i] 요소에 저장된 주소를 얕은 복사
						loginMember = memberArr[i];
						break; // 더이상 같은 아이디, 비밀번호가 없기 때문에 효율을 위해 for문 종료
						
					}
					
				}
				
				
			}
			// 4) 로그인 성공/ 실패 여부에 따라 결과 값 반환
			if(loginMember == null) { //로그인 실패
				
				return "아이디 또는 비밀번호가 일치하지 않습니다.";
			} else { // 로그인 성공
				return loginMember.getMemberName() + "님 환영합니다";
			}
			
		}
		
		// 회원 검색 (지역 ) 메서드
		public void searchRegion() {
			
			System.out.println("===============회원검색===============");
			
			System.out.println("검색할 지역을 입력하세요 : ");
			String inputRegion = sc.next();
			
			// 검색 결과 신호용 변수
			boolean flag = true;
			
			// 1) memberArr 배열의 모든 요소 순차 접근
			for(int i = 0; i < memberArr.length; i++ ) {
				
				// 2) memberArr[i] 요소가 null인 경우 반복 종료
				if(memberArr[i] == null) {
					break;
				}
				
				// 3) memberArr[i] 요소에 저장된 지역( region)이 
				// 입력받은 지역(inputregion)과 일치할 경우
				// memberArr[i] 요소에 저장된 객체의
				// 회원의 아이디, 이름을 출력
				
				if(memberArr[i].getRegion().equals(inputRegion)) {
					System.out.printf("아이디 : %s, 이름 : %s\n", memberArr[i].getMemberId(), memberArr[i].getMemberName());
					flag = false; // 찾았다는 신호를 준
					
				}
			}
			
			if( flag == true ) {
				System.out.println("일치하는 검색 결과가 없습니다.");
			}
		}
		
		public String selectMember() {
			// 회원 정보 조회 메서드
			// 1) 로그인 여부 확인
			
			System.out.println("==============회원 정보 조회합니다===============");
			
			if ( loginMember == null ) {
				return "로그인을 먼저 진행해 주시기 바랍니다.";				
			} else { 
			
				return "이름 : " + loginMember.getMemberName() + "\n" 
						+ "아이디 : " + loginMember.getMemberId() + "\n"
						+ "나이 : " + loginMember.getMemberAge() + "\n"
						+ "지역 : " + loginMember.getRegion();
				
			}
			
			
			
			
			// 2) 로그인 되어있는 경우 현재 로그인한 회원의 정보를 출력할 문자열을 만들어 반환
			// 단, 비밀번호 제외
			// 이름: 홍길동
			// 아이디 : user01
			// 나이 : 20
			// 지역 : 서울
			
		}
		
		
		public int updateMember() {
			
			System.out.println("============회원 정보 수정 절차입니다=============");
			
			if ( loginMember == null) {
				return -1; 
			} 
			else {System.out.println("수정할 이름 : ");
				
				String name = sc.next();
			
				System.out.println("수정할 나이 : ");
				int age = sc.nextInt();
			
				System.out.println("수정할 지역 : ");
				String region = sc.next();
				
				System.out.println("비밀번호를 입력해주세요");
				String pw = sc.next();
				sc.nextLine();
				for ( int i = 0 ; i < memberArr.length; i++) {
					if (memberArr[i].getMemberPw()== loginMember.getMemberPw() ) {
					memberArr[i].setMemberName(name);	
					memberArr[i].setMemberAge(age);	
					memberArr[i].setRegion(region);	
						return 1;
						
					
				} break;
				
			}{ return 0 ;}	
			
			}}
			
			
			
			// 1) 로그인 여부 판별 -> 로그인이 되어있지 않으면 -1반환
			
			// 2) 수정할 회원 정보 입력받기 (이름, 나이, 지역)
			
			// 3) 비밀번호를 입력받아서
			
			// 로그인한 회원의 비밀번호와 일치하는지 확인
			
			// 4) 비밀번호가 같을경우 로그인한 회원의 이름, 나이, 지역 정보를 입력받은 값으로 변경 후
			
			// 1 반환
			
			// 5) 비밀번호가 다른 경우 0 반환
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
}
