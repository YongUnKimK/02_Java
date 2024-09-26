package toyproject.model.dto;

import java.util.Objects;

public class Army {
	// 성 / 이름 나눈 후 무작위로 5명 뽑은 후, 번호를 누르면 징병
	private String firstName; // 성
	private String middleName; // 이름
	private int age; //나이
	private int ex; //경험
	private int wealth; // 부유함 ( 1 ~ 5 )
	
	
	

	public Army() {};
	
	public Army(String firstName, String middleName, int age, int ex, int wealth) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.age = age;
		this.ex = ex;
		this.wealth = wealth;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getEx() {
		return ex;
	}
	public void setEx(int ex) {
		this.ex = ex;
	}
	public int getWealth() {
		return wealth;
	}
	public void setWealth(int wealth) {
		this.wealth = wealth;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(age, ex, firstName, middleName, wealth);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Army other = (Army) obj;
		return age == other.age && ex == other.ex && Objects.equals(firstName, other.firstName)
				&& Objects.equals(middleName, other.middleName) && wealth == other.wealth;
	}
	
	@Override
	public String toString() {
		return "성 : " + firstName + " 이름 : " + middleName
				+ " 나이 : " + age + " 경험 : " + ex + " 생활수준 : "
				+ wealth;
	}
	
	
	
	
	
	
	
	
	
}
