package com.hw2.model.run;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Prisoner;
import com.hw2.model.service.Company;
import com.hw2.model.service.ManagementSystem;
import com.hw2.model.service.Prison;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ManagementSystem company = new Company(10); 
		// 부모타입 참조변수 = 자식객체 ( 업캐스팅 )
		
		company.addPerson(new Employee("EMP001", "유재석", "기획팀"));
		company.addPerson(new Employee("EMP002", "정형돈", "개발팀"));
									// 	다형성 업캐스팅 사용
		
		
		//등록된직원 모두 조회
		company.displayAllPersons(); // 동적바인딩
		
		System.out.println("----------------------------------");
		
		
		
		// EMP001 id를 가진 직원 삭제
		company.removePerson("EMP001");
		
		
		
		company.displayAllPersons(); // 동적바인딩
		
		ManagementSystem prison = new Prison(10);
		
		prison.addPerson(new Prisoner("EPM003", "백일홍", "살인죄"));
		prison.addPerson(new Prisoner("EPM003", "백일홍", "살죄"));
		prison.addPerson(new Prisoner("EPM001", "백일홍", "살죄"));
		
		
		prison.removePerson("EPM001");
		
		prison.displayAllPersons();
	}

}
