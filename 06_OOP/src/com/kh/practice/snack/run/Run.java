package com.kh.practice.snack.run;

import com.kh.practice.snack.view.SnackMenu;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SnackMenu sm = new SnackMenu(); 
		
		sm.menu();
	}

}

// 코드의 흐름
// 클라이언트 -> 요청 --> Controller -> Service -> DB -> Service -> Controller -> View... -> 클라이언트에게 응답.......