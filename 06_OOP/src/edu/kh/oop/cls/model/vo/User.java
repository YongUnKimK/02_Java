package edu.kh.oop.cls.model.vo;

public class User {

	// 필드 => 속성
	// 아이디, 비밀번호, 이름, 나이, 성별 (추상화 진행) 
	// 캡슐화 (데이터 직접접근 불가 원칙 -> 필드는 기본적으로 private)
	private String userId;
	private String userPw;
	private String userName;
	private int userAge;
	private char userGender;
	
	
	
	
	// 생성자 + 메서드 => 기능
	/*
	 *  
	 * */
	
	
	
	
	// 기본생성자-> 매개변수 없는 생성자
	// 다른 매개변수 생성자가 있으면 기본생성자 생성해야함
	public User() {
		
		//기능
		System.out.println("기본생성자로 User객체 생성");
		
		
		
		//필드 초기화
		userId = "user01";
		userPw = "pass01";
		userName = "홍길동";
		userAge = 20;
		userGender = '남';
				
		
	}
	
	// 매개변수 생성자
	// ** 사용되는 기술, 변수 : 매개변수, Overloading(오버로딩), this
	
	// ** 매개변수 : 생성자나 메서드 호출 시 () 안에 작성되어
	// 전달되어지는 값을 저장하고 있는 변수
	// -> 전달받은 값을 저장하고 있는 매개체 역할의 변수
	
	public User(String userId, String userPw) {
		System.out.println("매개변수 생성자를 이용하여 User객체 생성");
		System.out.println(userId + " / " + userPw);
		
		//필드 초기화
		this.userId = userId;
		this.userPw = userPw;
		//필드 = 매개변수 
		
		// this 참조변수
		// - 객체가 자기 자신을 참조할 수 있도록 하는 변수
		// 왜 사용?
		// -> 필드명과 매개변수 명이 같은 경우
		// 이를 구분하기 위해서 사용한다.
	};
	
	// 필드를 전부 초기화하는 목적의 매개변수 생성자
	public User(String userId, String userPw, String userName, 
			int userAge, char userGender ) {
		
		// this() 생성자 ! **반드시첫줄이래요
		// 같은 클래스의 다른 생성자를 호출할 때 사용
		// 생성자 내에서 반드시 첫번째 줄에 작성해야한다!
		// 왜 사용하는가?
		// 중복 코드 제거, 코드 길이 감소, 재사용성 증가..
		// 가독성이 조금 떨어지는 경우가 있음(단점)
		this(userId, userPw);
		
//		this.userId = userId;
//		this.userPw = userPw;
		this.userName = userName;
		this.userAge = userAge;
		this.userGender = userGender;
				
		
	}

	// 자바는 기본적으로 필드명, 생성자명, 메서드명, 변수명의
	// 중복을 허용하지 않음.
	// private String userId; // Duplicate field User.userId
	//public User() {} // Duplicate method User() in type User
	
	
	// *** 오버로딩(Overloading) ***
	// - 클래스 내에 동일한 이름의 메서드(생성자도포함)을 여러개 작성하는 기법
	
	// [ 오버로딩 조건 ] 
	// 1) 메서드의 이름이 동일
	// 2) 매개변수의 개수, 타입, 순서 중 1개라도 달라야 함.
	
	//public User() {} // 기본생성자가 이미 작성되어 있어서 X
	
	public User(String userId) {} // 매개변수의 개수가 같은 생성자 없음 -> 오버로딩 성립
	
	public User(int userAge) {} // 매개변수의 개수가 같은 생성자가 있지만 타입이 다름 -> 오버로딩 성립
	
	public User(String userId, int userAge) {}
	// 매개변수 같은 생성자가 있지만 타입이 다름 -> 오버로딩 성립
	
	public User(int userAge, String userId) {}
	// 순서가 다름. - > 오버로딩 성립
	
	//public User(int userAge, String userName) {} // 매개변수의 개수, 타입, 순서가 똑같기 때문에 오버로딩x
	
	public String getUserId() {
		return userId;
	}




	public void setUserId(String userId) {
		this.userId = userId;
	}




	public String getUserPw() {
		return userPw;
	}




	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}




	public String getUserName() {
		return userName;
	}




	public void setUserName(String userName) {
		this.userName = userName;
	}




	public int getUserAge() {
		return userAge;
	}




	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}




	public char getUserGender() {
		return userGender;
	}




	public void setUserGender(char userGender) {
		this.userGender = userGender;
	} 
	
	
	
	
	
	
	
	
}
