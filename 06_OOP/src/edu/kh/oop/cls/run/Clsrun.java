package edu.kh.oop.cls.run;

import edu.kh.oop.cls.model.service.ClsService;

public class Clsrun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClsService service = new ClsService();// <-기본 생성자 
		// ClsService 클래스에 기본생성자를 작성한적 없지만
		// 기본생성자 호출, 객체도 잘 만들어서 사용중..
		// 어떻게 가능한가?
		// -> 컴파일러가 코드를 번역할 때
		// 클래스 내부에 생성자가 하나도 없다면 
		// 자동으로 기본생성자를 추가해줌(우리눈엔안보임)
		service.ex2();
		service.ex3();
		service.ex4();
	}

}