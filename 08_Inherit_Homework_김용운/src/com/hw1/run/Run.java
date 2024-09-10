package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		
		// 3명의 학생 정보를 기록할 수 있게 객체배열 할당
		Student[] students = new Student[3];
		
		// 사용데이터 참고하여 3명의 학생 정보 초기화
		students[0] = new Student("홍길동", 20, 178.2, 70.0 ,1, "정보시스템공학과");
		students[1] = new Student("김말똥", 21 ,187.3, 80.0 ,2, "경영학과");
		students[2] = new Student("강개순", 23 ,167.0, 45.0 ,4, "정보통신공학과");
		
		// 학생 정보 모두 출력
		// 향상된 for문
		/*
		 * 자바에서 배열, 컬렉션과 같은 데이터를 순차적으로 간단하게 반복할 수 있는
		 * 구조를 제공
		 * 일반적인 for문 보다 코드가 더 간결하고 가독성이 좋아서
		 * 반복 작업을 더 쉽게 할 수 있음 굿
		 * 
		 * for(데이터타입 변수명 : 배열 또는 컬렉션) {
		 * 
		 * */
		
		for(Student std : students) { 
			System.out.println( std.information());
		}
			
		System.out.println("-----------------------------------------");
		Employee[] emps = new Employee[10];
		
		// 사원들의 정보를 키보드로 입력받고
		// 추가할것인지 물어보고
		// 대소문자 상관없이 'y'이면 계속 객체 추가
		// 한명씩 추가될  때마다 카운트
		
		Scanner sc = new Scanner(System.in);
		
		int count=0;
		
		while(true) {
			System.out.println("이름 : ");
			String name = sc.next();
			System.out.println("나이 : ");
			int age = sc.nextInt();
			System.out.println("신장: ");
			double height = sc.nextDouble();
			System.out.println("몸무게 : ");
			double weight = sc.nextDouble();
			System.out.println("급여 : ");
			int salary = sc.nextInt();
			System.out.println("부서 : ");
			String dept = sc.next();
			
			emps[count] = new Employee(name, age, height, weight, salary, dept);
			count++;
			
			if(count == emps.length) {break;}
			
			System.out.println("계속 추가할래? (y/n) : ");
			String str = sc.next().toUpperCase(); // 소문자 -> 대문자로 변경 , toLowerCase() 대문자 -> 소문자
			
			if(str.equals("N")) break;
			
			// 현재까지 기록된 사원들의 정보를 모두 출력
			
			for(Employee emp : emps) {
				
				// 만약에 emp가 null이면 반복멈춰라
				if(emp == null) break;
				
				System.out.println( emp.information() );
			}
		}
	}

}
