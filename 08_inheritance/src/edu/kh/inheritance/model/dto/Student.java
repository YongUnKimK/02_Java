package edu.kh.inheritance.model.dto;

/*Object
 *  ㄴ Person
 *      ㄴ Student
 * 
 * 
 * 
 * 
 * */




public class Student extends Person{
	// Student 클래스의 Person 클래스 내용을 연장한다
	// == Student 클래스에 Person 클래스의 필드, 메서드를
	// 추가하여 확장한다
	
	//필드 (속성 ) 
//	private String name;
//	private int age;
//	private String nationlity -> 부모클래스 Person에게 상속받음
	private int grade;
	private int classRoom;
	
	public Student() {};
	
	public Student(String name, int age, String nationality ,int grade, int classRoom) {
		super(name, age, nationality);
		// super(); :  Person의 기본생성자 의미
		// super(매개변수) ; : 부모의 매개변수생성자 의미
		//Person(부모) 상속받은 메서드 setter
		
		// 부모의 setter를 이용할 수는 있지만 효율적이지않음
		/*  setName(name);
			setAge(age);
			setNationality(nationality);
		  */
		//		this.name = name;
		//왜 안될까??
		
		// -> this 참조변수는 본인 자신만을 의미함.
		// -> 상속을 받았어도 name, age, nationality는 부모의 고유 필드이기 때문에
		// 자식인 Student에서 this 참조변수를 이용해 직접접근 불간으
		this.grade = grade;
		this.classRoom = classRoom;
	}
	//매개변수 생성자

	//메서드 ( 기능 ) 
	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public String getNationlity() {
//		return nationlity;
//	}
//	public void setNationlity(String nationlity) {
//		this.nationlity = nationlity; -> 상속의 장점 ( 코드길이 감소 )
//	}
	public int getGrade() {
		return grade;
	}
	

	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " / " + grade + " / " + classRoom;
	}
}
