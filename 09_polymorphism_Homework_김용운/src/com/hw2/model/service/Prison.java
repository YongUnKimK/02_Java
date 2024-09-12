package com.hw2.model.service;

import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;

public class Prison implements ManagementSystem {

	
	private Prisoner[] prisoners; // 수감자
	private int prisonerCount; // 수감자 수
	
	public Prison(int size) {
		
		this.prisoners = new Prisoner[size];
		int prisonerCount = 0;
	}
	
	public Prisoner[] getPrisoners() {
		return prisoners;
	}

	public void setPrisoners(Prisoner[] prisoners) {
		this.prisoners = prisoners;
	}

	public int getPrisonerCount() {
		return prisonerCount;
	}

	public void setPrisonerCount(int prisonerCount) {
		this.prisonerCount = prisonerCount;
	}

	public void ManagementSystem() {
	}

	@Override
	public void addPerson(Person person) {
		if(person instanceof Prisoner && prisonerCount < prisoners.length) {
			prisoners[prisonerCount++] = (Prisoner)person; // 다운캐스팅
			System.out.println("죄수가 추가되었습니다 - " + person.getInfo());
															// 동적바인딩
		} else {
			System.out.println("인원이 모두 충원되어 더 이상 추가 못함");
		}
		
	}

	@Override
	public void removePerson(String id) {
			for(int i = 0; i < prisonerCount; i++) { // 현재 등록된 직원 수 만큼만 반복
			
			if(prisoners[i].getId().equals(id)) {
				System.out.println("직원이 삭제되었습니다 - " + prisoners[i].getInfo());
				prisoners[i] = null; // 삭제
				
				for(int j = i; j < prisonerCount - 1; j++) {
					// 삭제한 요소가 있는 i번째 인덱스부터 배열에 존재하는 직원 마지막 요소까지 순차접근
					prisoners[j] = prisoners[j + 1];
					// 배열 내 모든 후속 요소를 왼쪽으로 한칸씩 이동함
				}
				
				prisoners[--prisonerCount] = null;
				// employeeCount 변수를 감소시켜 배열의 마지막 요소를 null로 설정하여 직원수 줄이기
				return;
				}
			}
		
	}

	@Override
	public void displayAllPersons() {
		System.out.println("전체 죄수 명단 : ");
		for(int i = 0 ; i < prisonerCount; i++) {
			System.out.println(prisoners[i].getInfo());
		
		}
		
	}
}
