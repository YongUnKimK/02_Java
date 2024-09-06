package edu.kh.opp.method.run;

import edu.kh.oop.method.model.service.MemberService;

public class MemberRun { //실행용
	public static void main(String[] args) {
		
		
		MemberService service = new MemberService();
		service.displayMenu();
	}
}
