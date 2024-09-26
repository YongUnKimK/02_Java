package com.kh.test.model.vo;

import java.util.Objects;

public class Student {

	private String name;
	private int score;
	
	public Student() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Student(String name, int score) { //안만듬
		super();
		this.name = name;
		this.score = score;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, score);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && score == other.score;
	}

	@Override
	public String toString() {
		return name + "학생의 점수 : " + score + "점";
		
	}
	
}
