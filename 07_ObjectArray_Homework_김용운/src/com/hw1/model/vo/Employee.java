package com.hw1.model.vo;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Employee {

	private Scanner sc = new Scanner(System.in);	
	private int empNo;
	private String empName;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bonusPoint;
	private String phone;
	private String adress;
	
	public Employee() {}

	public Employee(int empNo, String empName, String job, char gender, String phone, String adress) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.job = job;
		this.gender = gender;
		this.phone = phone;
		this.adress = adress;
	}

	public Employee(int empNo, String empName, String dept, String job, int age, char gender, int salary,
			double bonusPoint, String phone, String adress) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.dept = dept;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.bonusPoint = bonusPoint;
		this.phone = phone;
		this.adress = adress;
	}

	public String information() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", dept=" + dept + ", job=" + job + ", age=" + age
				+ ", gender=" + gender + ", salary=" + salary + ", bonusPoint=" + bonusPoint + ", phone=" + phone
				+ ", adress=" + adress + "]";
	}

	
	
	
	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	public void program() {
		
		Scanner sc = new Scanner(System.in);
		
		Array[] arr = new Array[3];
		
		
		
		
		for ( int i = 0; i < arr.length; i++ ) {
			
			System.out.println("사번 : ");
			int empNo = sc.nextInt();
			
			System.out.println("사원명 : ");
			String empName = sc.next();
			
			System.out.println("소속부서 : ");
			String dept = sc.next();
			
			System.out.println("직급 : ");
			String job = sc.next();
			
			System.out.println("나이 : ");
			int age = sc.nextInt();
			
			System.out.println("성별 : ");
//			char gender = sc.next();
			
			System.out.println("급여 : ");
			int salary = sc.nextInt();
			
			System.out.println("보너스포인트 : ");
			double bonusPoing = sc.nextDouble();
			
			System.out.println("전화번호 : ");
			String phone = sc.next();
			
			System.out.println("주소 : ");
			String address = sc.next();
			
			
			
		}
		
		
	}

	
	
	
}
