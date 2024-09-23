package edu.kh.collection.pack3.model.service;

import java.util.*;

import edu.kh.collection.pack3.model.dto.Member;

public class MapService {

	
	// Map : Key와 Value 한 쌍이 데이터가 되어 이를 모아둔 객체
	
	// - Key를 모아두면 Set의 특징 ( 중복 X) 
	// - Value를 모아두면 List의 특징 ( 중복 O) 
	
	public void ex1() {
		
		// HashMap< K, V > : Map의 자식 클래스 중 가장 대표적인 Map		
		Map<Integer , String> map = new HashMap<Integer , String>();
		
		// Map.put(Integer Key, String Value) : 추가
		map.put(1, " 홍길동 ");
		map.put(2, " 고길동 ");
		map.put(3, " 김길동 ");
		map.put(4, " 박길동 ");
		map.put(5, " 이길동 ");
		map.put(6, " 최길동 ");
		
		System.out.println(map); // map.toString() 오버라이딩 되어있음
		// {k = v, k=v , k = v ...}
		
		// key 중복 테스트 -> 중복 허용 X, 대신 Value 덮어쓰기
		map.put(1, " 하우도 ");
		
		// value 중복 테스트
		map.put(7, " 최길동 ");
		
		System.out.println(map);
		
	}
	
	public void ex2() {
		// Map 사용 예제
		
		// VO( 값 저장용 객체 )는 특정 데이터 묶음의 재사용이 많은 경우 주로 사용
		// -> 재사용이 적은 VO 는 오히려 코드 낭비
		// -> Map 을 이용해서 VO와 비슷한 코드를 작성할 수 있음
		
		// 1) VO 버전
		Member mem = new Member() ; 
		
		// 값세팅
		mem.setId("User01");
		mem.setPw("pass01");
		mem.setAge(30);
		
		// 값출력
		System.out.println(mem.getId());
		System.out.println(mem.getPw());
		System.out.println(mem.getAge());
		
		// 2) Map 버전
		
		Map <String , Object> map = new HashMap<String, Object>();
		// value가 Object 타입 == 어떤 객체든 Value에 들어올 수 있다.
		
		// 값세팅
		map.put("id", "user02");
		map.put("pw", "pass02");
		map.put("age", 25);
		
		// auto Boxing / Auto UnBoxing
		
		// Auto Boxing : 기본 자료형 데이터를 객체 타입 Wrapper 클래스로 자동 변환
		// int -> Integer
		// map.put("age", 25);
		// map.put("age", Integer.valueOf(25));
		
		// Auto UnBoxing : Wrapper 클래스인 객체를 기본 자료형 데이터로 자동 변환
		// int num = Integer.valueOf(100);
		
		// 값출력
		// Object(Value) Map.get(Object Key) : 매개변수로 전달받은 key와 대응되는  
		System.out.println(map.get("id"));
		System.out.println(map.get("pw"));
		System.out.println(map.get("age"));
		
		System.out.println("----------------------------------------------------");
		
		// ** Map 에 저장된 데이터 순차적으로 접근하기
		
		// Map 에서 Key 만 모아두면 Set 의 특징을 가진다.
		// -> 이를 활용해서 Map에서 keySet() 메서드 제공
		// -> Key만 모아서 Set으로 반환
		
		Set<String> set = map.keySet(); // id, pw, age 가 저장된 Set반환
		
		System.out.println("keySet() : " + set);
		
		// 향상된 for문
		for(String key : set ) {
			System.out.println( map.get(key));
		}
		// map에 저장된 데이터가 많거나
		// 어떤 key가 있는지 불분명 할 떄
		// 또는 map에 저장된 모든 데이터에 접근해야 할 떄
		// keySet() + 향상된 for문 코드 사용
	}
	
	public void ex3() {
		
		List< Map <String, Object>> list = new ArrayList< Map <String, Object>>();
		
		for (int i = 0; i < 10; i++) {
			
			// Map 생성
			Map<String, Object> map = new HashMap<String, Object>();
			
			// Map에 데이터 추가
			map.put("id", "user0"+ i);
			
			// Map을 List에 추가
			list.add(map);
		}
		
		// for문 종료 시 list에 10개의 map 객체가 추가되어 있다
		System.out.println(list);
		
		// 향상된 for문 이용하여 key가 "id"에 대응되는 value값 출력하기
		for(Map<String, Object> temp : list) {
			System.out.println(temp.get("id"));
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}