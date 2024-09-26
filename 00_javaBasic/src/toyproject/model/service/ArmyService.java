package toyproject.model.service;

import toyproject.model.dto.Army;

import java.util.*;

import com.hw3.model.dto.Toy;

public class ArmyService {
	
	Set<Army> manpower = new HashSet<Army>(); //병사목록 ( 중복 X )
	Set<Army> headMan = new HashSet<Army>();
	
	public void Army() {
		
		manpower.add(new Army("칼", "프란츠", 19 , 1, 3));
		manpower.add(new Army("발타자르", "겔트", 19 , 1, 3));
		manpower.add(new Army("하인리히", "케믈러", 19 , 1, 3));
		manpower.add(new Army("르", "팡스", 19 , 1, 3));
		manpower.add(new Army("헬무트", "포비", 19 , 1, 3));
	}
	
	public void displayMenu() {
		Scanner sc = new Scanner(System.in);
		int action = 0;

		try {
			do {			
			System.out.println("당신은 모병관입니다.");
			System.out.println("=============== 모병 행동 목록==================");
			System.out.println("1. 징병된 병사 전체 목록");
			System.out.println("2. 소대장 목록 ( 병사 10명 넘어갈시 1명 선발 ) ");		
			System.out.println("3. 모병된 병사 나이 순으로 정렬");
			System.out.println("4. 모병된 병사 재산 순으로 정렬");
			System.out.println("5. 모병된 병사 경험 순으로 정렬");
			System.out.println("6. 소대 목록");
			System.out.println("7. 부대 출발 ");
			System.out.println("8. 병사 징병");
			System.out.println("0. 행동 종료");
			
			System.out.print("수행할 행동을 입력하십시오 : ");
			action = sc.nextInt(); 
			switch(action) {
			case 1: allManpower()         ; break;
			case 2: headMan()         ; break;
			case 3: ageManpower()         ; break;
			case 4:          ; break;
			case 5:          ; break;
			case 6:          ; break;
			case 7:          ; break;
			case 8:          ; break;
			case 0:          ; break;
			default : System.out.println("올바른 값을 입력해 주십시오.");
			}
		  } while( action != 0) ;
		} catch( Exception e) {
			System.out.println("올바른 숫자를 입력하셔야 합니다. 모병관님");
		}
		
		
		
		
	}
	
	public void allManpower() {
		System.out.println("===========전체 징집병 목록==========");	
		int index = 1;
		for (Army manpower  : manpower) {
			System.out.println(index + ". " + manpower);
			index++;}
	}
	
	public void headMan() {
		
		System.out.println("============소대장 목록=============");
		int index = 1;
		for ( Army headMan : headMan ) {
			System.out.println(index + ". " + headMan);
			index++;
		}
	}
	
	public void ageManpower() {
		
		System.out.println("=======나이 순으로 병사 정렬=======");
		
		List<Army> toyList = new ArrayList<Army>(manpower);
		
		toyList.sort(Comparator.comparingInt(ArmyService::age));
		int index = 1;
		for(Army man : manpower) {
			System.out.println(index + ". " +manpower);
			index++;
		}
		
	}
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
