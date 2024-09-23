package com.hw2.run;

import com.hw2.model.dto.Monkey;
import com.hw2.model.dto.Tiger;
import com.hw2.model.service.Zoo;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zoo zoo = new Zoo();
		
		Tiger tiger = new Tiger();
		Monkey monkey = new Monkey();
		
		tiger.setName("호랑이");	
		monkey.setName("원숭이");
		
		
		zoo.addAnimal(tiger);
		zoo.addAnimal(monkey);
		
		System.out.println(zoo);
		zoo.displayMenu();
	}

}
