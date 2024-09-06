package edu.kh.oop.cls.model.service;

import edu.kh.oop.cls.model.vo.Student;
//import edu.kh.oop.cls.model.vo.TestVO;
// ClsService와 Student는 패키지가 다름!!
import edu.kh.oop.cls.model.vo.User;

public class ClsService /*extends Student*/{
			// 부모로 Student 클래스를 상속받음
			// Student(부모) -> ClsService(자식)
	// public ClsService() {} // 기본생성자
	public void ex1() {
		
		
		//클래스 접근제한자 확인하기
		Student std = new Student();
		// public class인 Student는 import 가능(어디서든 접근가능)
		
		// TestVO test = new TestVO();
		// (default) class인 TestVO는 import가 불 가능[다른패키지]		
		
		// 필드 접근 제한자 check~
		System.out.println(std.v1 );
		// -> 전체에서 직접 접근 가능한 public인 v1만 에러발생 x
		
		
		
		//System.out.println(std.v2 );
		//System.out.println(std.v3 );
		//System.out.println(std.v4 );
				
		//상속 관계에서 직접 접근 가능범위 테스트
//		System.out.println( v1 ); // public -> 프로그램 전체에서 접근 가능
//		System.out.println( v2 ); 
		// protected -> Student 클래스를 상속 받았으므로 Student의 protected 변수인
		// v2는 직접 접근 가능
		// System.out.println(v3); // (default) 다른패키지 x
		// System.out.println(v4); // 클래스가 달라서 에러
	}
	public void ex2() {
		//static 필드 확인 예제
		
		// 학생 개체 두개 생성
		Student std1 = new Student();
		Student std2 = new Student();

		
		//학생 개체에 네임생성
		std1.setName("홍길동");
		std2.setName("김영희");
		
	    System.out.println(Student.schoolName);
	    System.out.println(Student.schoolName);
	    // schoolName에 노란줄이 뜨는이유(경고) -> 제대로 작성을 안해서
	    
	    // *** static이 붙은 필드(변수)는 '클래스명.변수명'으로 사용함
	    System.out.println(Student.schoolName);
	    
	    Student.schoolName = "KH정보교육원";
	    
	    System.out.println(Student.schoolName);
	    System.out.println(Student.schoolName);
	    /* static
	     * 
	     * 공유 메모리 영역(또는 정적 메모리 영역) 이라고 함.
	     * 
	     * -> 프로그램 시작 시 static이 붙은 코드들이 모두
	     * static 영역에 생성되고, 
	     * 프로그램이 종료될 때까지 사라지지 않음 (정적)
	     * 그리고, static 영역에 생성된 변수는 어디서든지 공유 가능(공유 메모리 영역)
	     * 
	     * 
	     * 
	     * 
	     * */
	    
	    
	    
	    
	}
	
	
	public void ex3() {
		
		//생성자 확인 테스트
		
		//User 기본 생성자를 이용해서 객체 생성 u1
		User u1 = new User();
		
		System.out.println(u1.getUserId());
		System.out.println(u1.getUserPw());
		System.out.println(u1.getUserName());
		System.out.println(u1.getUserAge());
		System.out.println(u1.getUserGender());
		
		User u2 = new User();
		
		System.out.println(u1.getUserId());
		System.out.println(u1.getUserPw());
		System.out.println(u1.getUserName());
		System.out.println(u1.getUserAge());
		System.out.println(u1.getUserGender());
		
		// 문제점 : u1이 참조하고있는 User객체와
		//			u2가 참조하고있는 user객체의 필드값이 모두 동일함
		// 왜? 같은 기본생성자로 User객체를 생성했기 떄문에.
		
		System.out.println("=============================================");
		
		// 해결방법 1 : setter를 이용해서 새로운 값으로 대입
		u2.setUserId("asd1234");
		u2.setUserPw("1w2e3r");
		u2.setUserName("김영희");
		u2.setUserAge(25);
		u2.setUserGender('여');
		
		System.out.println(u2.getUserId());
		System.out.println(u2.getUserPw());
		System.out.println(u2.getUserName());
		System.out.println(u2.getUserAge());
		System.out.println(u2.getUserGender());
		
		// 해결방법 2 : 매개변수 생성자를 이용해서
		// 객체가 생성될 떄 부터 다른값으로 필드를 초기화
		
		User u3 = new User("test3","password333"); // 매개변수 생성자를 이용해 객체o
		
		System.out.println(u3.getUserId());
		System.out.println(u3.getUserPw());
		
		
	}
	
	public void ex4() {
		// 매개변수 생성자 예제
		User u1 = new User(); // 기본생성자
		User u2 = new User("user02","pass02") ; //매개변수 2개 생성자
		User u3 = new User("user03" , "pass03" ,"백호", 30 , '남' ); //매개변수 5개 생성자(전부 초기화)
		
		
		System.out.printf("u1: %s %s %s %d %c\n", 
				u1.getUserId(), u1.getUserPw(), u1.getUserName(), u1.getUserAge()
				,u1.getUserGender());
		
		System.out.printf("u1:  %s %s %s %d %c\n", 
				u2.getUserId(), u2.getUserPw(), u2.getUserName(), u2.getUserAge()
				,u2.getUserGender());	
		
		System.out.printf("u1:  %s %s %s %d %c\n", 
				u3.getUserId(), u3.getUserPw(), u3.getUserName(), u3.getUserAge()
				,u3.getUserGender());
		
	}
}