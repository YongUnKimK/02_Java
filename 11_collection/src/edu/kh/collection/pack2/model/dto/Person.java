package edu.kh.collection.pack2.model.dto;

import java.util.Objects;

public class Person {
	
	private String name;
	private int age;
	private char gender;
	
	public Person() {};
	
	public Person(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

	@Override
	public int hashCode() {
		// 필드에 저장된 값을 이용해서 hashcode 생성
		// hashcode : 객체별 식별 코드
		return Objects.hash(age, gender, name);
	}

	
	// 동일 비교 : Object.hashCode() 메서드 오버라이딩
	// hash 함수 : 값을 넣으면 같은 길이의 문자열이 반환되는 함수
	// ex) 123  -> qwerty
	//      sjadlkfjklsdajfklsdjklf -> asdfgh
	// 암호화에 많이 사용
	// alt + shift + s -> Generate hashCode() and equals() ...
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && gender == other.gender && Objects.equals(name, other.name);
	}
	// 동등 비교 : Object.equals() 메서드 오버라이딩
	
	
	
	
	// 객체가 같다(동일, 동등) 을 어떻게 비교할까 ? 
	// - 동일 : 가리키고 있는 것이 같다
	// - 동등 : 값이 같음
	
	// 동일 객체 : 메모리 주소가 같은 완전히 같은 객체
	// hashCode()는 주로 이런 객체를 식별하는데 사용
	
	// 동등 객체 : 메모리 주소가 다르더라도, 각 개체의 내부 값들이 같다면
	// 			   동일한 객체로 간주하는 경우를 말함
	// 		equals() 메서드는 이러한 객체가 같은지 판단할떄 사용
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}