package com.hw1.model.dto;

import java.util.Objects;

public class Friend {

	private String name;
	
	
	public void pickLeader() {
		int pick = (int)Math.random() * 5;
		switch(pick) {
		case 0 : System.out.println("짱구가 떡잎방범대 대장이다!");
		case 1 : System.out.println("철수가 떡잎방범대 대장이다!");
		case 2 : System.out.println("유리가 떡잎방범대 대장이다!");
		case 3 : System.out.println("훈이가 떡잎방범대 대장이다!");
		case 4 : System.out.println("맹구가 떡잎방범대 대장이다!");
		
		
		}
		
		
		
		
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Friend() {};
	
	public Friend(String name) {
		
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Friend other = (Friend) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Friend [name=" + name + "]";
	}
	
}
