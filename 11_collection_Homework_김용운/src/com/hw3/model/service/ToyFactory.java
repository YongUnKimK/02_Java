package com.hw3.model.service;

import java.util.*;

import com.hw3.model.dto.Toy;

public class ToyFactory extends Toy {
	private Scanner sc = new Scanner(System.in);
	private Set<Toy> toySet = new HashSet<Toy>(); 
	// 중복된 Toy 객체가 없도록 저장할 컬렉션 중 Set
	private Map<Integer, String> materialMap = new HashMap<Integer, String>();
	// 재료가 저장되어있는 map
	private List<Toy> list = new ArrayList<Toy>(toySet);
	
	public void ToyFactory() {
		materialMap.put(1, "면직물");
		materialMap.put(2, "플라스틱");
		materialMap.put(3, "유리");
		materialMap.put(4, "고무");
		
		toySet.add(new Toy("마미롱레그", 8, 36000, "분홍색", "19950805", addMaterials(1, 4)));
		toySet.add(new Toy("허기워기", 5, 12000, "파란색", "19940312", addMaterials(1, 2)));
		toySet.add(new Toy("키시미시", 5, 15000, "분홍색", "19940505", addMaterials(1, 2)));
		toySet.add(new Toy("캣냅", 8, 27000, "보라색", "19960128", addMaterials(1, 2)));
		toySet.add(new Toy("파피", 12, 57000, "빨간색", "19931225", addMaterials(1, 2, 4)));
	}
	
	// materials에 전달받은 값들을 추가하고 Set으로 반환
	// 매개변수 Integer...newMaterials : 개수 미상
	public Set<String> addMaterials(Integer...newMaterials) {
			
			Set<String> addedMaterials = new HashSet<String>();
			
			for(Integer materialKey : newMaterials ) {
				
				// Map에서 해당 번호(key)에 대응하는 재료를 가져와 추가
				String materialValue = materialMap.get(materialKey);
				
				if(materialValue != null) {
					addedMaterials.add(materialValue);
				}
			}
			return addedMaterials;
	}
	
	public void displayMenu() {
		
		int menuNum = 0;
		
		System.out.println("<< 플레이타일 공장>>");
		System.out.println("1. 전체 장난감 조회하기");
		System.out.println("2. 새로운 장난감 만들기");
		System.out.println("3. 장난감 삭제하기");
		System.out.println("4. 장난감 제조일 순으로 조회하기");
		System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
		System.out.println("6. 재료 추가");
		System.out.println("7. 재료 제거");	
		System.out.print("선택 : ");
		
			
		menuNum = sc.nextInt();
		switch(menuNum) {
		case 1 : displayAllToys() ; break;
		case 2 :/* 새장난감만들기 */ ; break;
		case 3 :/* 장난감삭제하기*/ ; break;
		case 4 :/* 장난감 제조일 순으로 조회하기*/ ; break;
		case 5 :/* 연령별 사용 가능한 장난감 리스트 조회하기*/ ; break;
		case 6 :/* 재료 추가*/ ; break;
		case 7 :/* 재료 제거*/ ; break;
		default : System.out.println(" 올바른 값을 입력해 주시기 바랍니다.");	
		} }
	
	public void displayAllToys() {
		
		for(Toy t : list) {
			System.out.println(t);
		}
		
		
		
	}
}
