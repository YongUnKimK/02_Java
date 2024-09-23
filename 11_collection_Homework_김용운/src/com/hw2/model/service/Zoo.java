package com.hw2.model.service;

import java.util.List;
import java.util.Scanner;

import com.hw2.model.dto.Animal;

public class Zoo {
	Scanner sc = new Scanner(System.in);

	private  List<Animal> animal ;

	public Zoo() {};
	public void addAnimal(Animal animal) {};
	public void showAnimal() {};
	public void displayMenu() {
		boolean flag = false;
		System.out.println("**************KH 동물원 **************");
		System.out.println("원하는 작업을 선택하세요 :");
		do {
		System.out.println("1. 동물들의 울음소리 듣기");
		System.out.println("2. 종료");
		int select = sc.nextInt();
		if( select == 2) {
			System.out.println("프로그램을 종료합니다." ); return;
		} else {
			System.out.println("동물들의 울음소리를 들어보세요.");
			
				System.out.println( "호랑이가 어흥하며 포효합니다" );
				System.out.println( "원숭이가 우끼끼 소리를 냅니다");
				flag = true;
			
		}
		} while(flag == true);
		
		
		
		
		
	}
	public List<Animal> getAnimal() {
		return animal;
	}
	public void setAnimal(List<Animal> animal) {
		this.animal = animal;
	};
	

	
}
