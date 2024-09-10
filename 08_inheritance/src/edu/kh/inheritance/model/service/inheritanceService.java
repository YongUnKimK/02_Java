package edu.kh.inheritance.model.service;

import edu.kh.inheritance.model.dto.Employee;
import edu.kh.inheritance.model.dto.Person;
import edu.kh.inheritance.model.dto.Student;

// 비즈니스 로직 처리하는 클래스
public class inheritanceService {

	//상속 확인 예제
	public void ex1() {
		Person p = new Person();
		
		p.setName("홍길동");
		p.setAge(25);
		p.setNationality("대한민국");
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getNationality());
		// Person을 상속받은 Student가 
		// Person의 필드, 메서드를 사용할 수 있는가?
		System.out.println("===============================");
		// Student 객체 생성
		Student std = new Student();
		
		// Student만의 고유한 필드
		
		std.setGrade(3);
		std.setClassRoom(5);
		
		// Person 클래스로부터 상속받은 필드, 메서드
		std.setName("고길동");
		std.setAge(19);
		std.setNationality("대한민국");
		
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getNationality());
		System.out.println(std.getGrade());
		System.out.println(std.getClassRoom());
		
		System.out.println("==============================");
		
		Employee emp = new Employee();
		
		// Employee 만의 고유 메서드
		emp.setCompany("KH정보교육원");
		
		// Person 클래스로부터 상속받은 메서드
		emp.setName("조미현");
		emp.setAge(20);
		emp.setNationality("대한민국");
		
		System.out.println(emp.getCompany());
		System.out.println(emp.getName());
		System.out.println(emp.getNationality());
		System.out.println(emp.getAge());
		
		
		p.breath();
		p.move();
		
		emp.breath();
		emp.move();
		
		std.breath();
		std.move();
		
		// 상속의 특징
		// 코드 길이 감소 및 중복제거 효과
		
	}
	
	// super() 생성자 이용방법
	public void ex2() {
		
		// Student 객체 생성
		Student std = new Student("김철수", 17, "한국", 1, 3);
		
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getNationality());
		System.out.println(std.getAge());
		System.out.println(std.getGrade());
		
		System.out.println("================================");
		
		//Employee 객체 생성
		Employee emp = new Employee("김노동", 30, "한국", "Kh정보교육원");
		
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getCompany());
		System.out.println(emp.getNationality());
	}
	
	// 오버라이딩 확인 예제
	public void ex3() {
		
		Student std = new Student();
		Employee emp = new Employee();
		
		System.out.println("=========================================");
		std.move(); // 오버라이딩 X -> Person(부모)의 메소드 수행
		// 사람은 움직일 수 있다.
		
		emp.move(); // 오버라이딩 O -> Employee에서 재정의한 메서드 수행
		// 오버라이딩된 move()
		// 효율적으로 빨리 일하고 퇴근한다
		
		
	}
	//toString() 오버라이딩 예제
	public void ex4() {
		Person p = new Person("김철수", 17, "한국");
		
		System.out.println(p.toString());
		System.out.println(p);
		// print구문 수행 시 참조변수 명을 작성하면
		// 자동으로 toString() 메서드 호출해서 출력해준다.
		
		System.out.println("=================================");
		
		Student std = new Student("강호동", 18, "미국", 2, 6);
		
		System.out.println(std.toString());
		System.out.println(std);
	
		Employee emp = new Employee("김노동", 36, "한국", "KH정보교육원");
		System.out.println(emp);
		
		
		
		
	}
	
		
	
	
}
