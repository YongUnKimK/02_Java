package com.kh.practice.snack.controller;


// Controller : 웹 서비스 기본 - 사용자(클라이언트)      서버
// 사용자의 요청을 받아서 처리하고, 그 입력에 따라 Model(데이터 처리, 비즈니스 로직)과 View(화면 출력)를 연결해주는 역할

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {
	
	// 필드
	
	private Snack s = new Snack();
	

	
	
	
	// 생성자
		
	public SnackController() {};
	
	// 메서드
	
	public String confirmDate() {
		// 저장된 데이터를 반환함.
		return s.information();
	};
	
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		
		return "저장 완료되었습니다" + "\n저장한 정보를 확인하시겠습니까(y/n)";
	};
}

