package edu.kh.collection.pack1.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.kh.collection.pack1.model.service.StudentService;

public class StudentRun {
//	컬렉션 : 자바에서 제공하는 자료구조를 담당하는 프레임워크[틀]
//
//			Wrapper클래스 8가지!!!
//
//			**Boolean, Charactoer, Byte, Short, Integer, Long, Float, Double**
//
//			인터페이스 
//			- 관련없는 것들을 연결
//			- 공통된 메서드명을 제공하여 규약을 만듦
//
//			* List(나열) - 기본적으로 배열 모양을 가짐
//
//			Array(배열)과의차이점 : 길이를 늘렸다 줄었다 해줌
//			- 순서를 유지하고 저장
//			- 중복 저장 가능
//
//			* Set(집합) - 주머니 모양의 집합
//			- 순서 유지하지 않고 저장
//			- 중복 저장 안됨 [ 중복데이터 들어오면 제거]
//
//			*Map(지도) - 좌표를 찍으면 주소 나옴
//
//			- key / value 값의 쌍으로 저장 [ key는 인식키처럼] [ value는 key에 해당하는값 중복저장o] 
//			- key는 중복 저장 안됨
//
//			자바 : 멀티스레드 지원 ( 여러 스레드를 만들어 사용 가능) 
//			 
//			-> 싱글 스레드( main() -> 메인스레드 )
//			 -> Thread 클래스 상속
//			-> 멀티 스레드 필요한 경우 : 여러 작업을 동시에 처리하고 싶을떄
//			ex) 대용량 데이터 처리..
//			ex) UI가 응답성 유지하면서 백그라운드에서 작업을 실행하고 싶을때.
//			 - 파일 다운로드 중에도 사용자가 UI를 조작할 수 있게끔 할 떄
//
//			ArrayLiset : 동기화를 제공하지 않음
//			-> 만약 ArrayList를 멀티쓰레드 환경에서 사용한다면?
//			-> 문제가 생길 수 있음
//			동기화 : 하나의 자원(데이터)에 대해 여러 스레드가 접근 하려 할 때 한 시점에서 하나의 스레드만 사용할 수 있도록 하는 것
//
//			ArrayList : 검색 / LinkedList : 삽입, 수정, 삭제
	public static void main(String[] args) {
			
		
		StudentService service = new StudentService();
		
//		service.ex();
		service.displayMenu();
		
//		List<Integer> numberList = new ArrayList<Integer>();
//		
//		numberList.add(5);
//		numberList.add(3);
//		numberList.add(2);
//		numberList.add(1);
//		numberList.add(4);
//		
//		
//		//숫자 리스트를 정렬 ( Comparable이 이미 구현되어 있음.. ) 
//		Collections.sort(numberList);
//		
//		System.out.println(numberList);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
