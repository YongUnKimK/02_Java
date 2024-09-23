package com.hw1.run;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.hw1.model.dto.Friend;

public class Run {
	public static void main(String[] args) {
		
		Friend friend = new Friend();
		
		Set<String> set = new HashSet<String>();
		set.add("짱구");
		set.add("철수");
		set.add("유리");
		set.add("훈이");
		set.add("맹구");
		
		System.out.println(set);
		
		
		List<String> list = new ArrayList<String>(set);
				int pick = (int)(Math.random() * 5) ;
		switch(pick) {
		case 0 : System.out.println(list.get(0) + "가 떡잎방범대 대장이다!"); break;
		case 1 : System.out.println(list.get(1) + "가 떡잎방범대 대장이다!"); break;
		case 2 : System.out.println(list.get(2) + "가 떡잎방범대 대장이다!"); break;
		case 3 : System.out.println(list.get(3) + "가 떡잎방범대 대장이다!"); break;
		case 4 : System.out.println(list.get(4) + "가 떡잎방범대 대장이다!"); break;
		}
		
		
		
	}
}

