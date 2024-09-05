package edu.kh.oop.practice.model.service;

import edu.kh.opp.practice.model.vo.Hero;

public class HeroService {
	
	
	
	public void practice() {



		
		Hero hero = new Hero();
		Hero hero1 = new Hero();
		
		System.out.println(hero.toString());
		
		hero.setNickName("지존전사");
		hero.setJob("전사");
		hero.setHp(200);
		hero.setMp(20);
		hero.setLevel(1);
		hero.setExp(0);
		
		System.out.printf("%s 직업으로 '%s'님이 생성되었습니다.", hero.getNickName());
		System.out.printf("현재 레벨 : %d", hero.getLevel());
		System.out.printf("현재 hp : %d", hero.getHp());
		System.out.printf("현재 mp : %d",hero.getMp());
		System.out.printf("현재 경험치 : %f",hero.getExp());
		
		
	
		
		
		
		
		
		System.out.println(hero.toString());
		
		
		hero1.setNickName("지존위자드");
		hero1.setJob("마법사");
		hero1.setHp(100);
		hero1.setMp(100);
		hero1.setLevel(1);
		hero1.setExp(0);
		
		System.out.printf("%s 직업으로 '%s'님이 생성되었습니다.", hero1.getNickName());
		System.out.printf("현재 레벨 : %d", hero1.getLevel());
		System.out.printf("현재 hp : %d", hero1.getHp());
		System.out.printf("현재 mp : %d",hero1.getMp());
		System.out.printf("현재 경험치 : %f",hero1.getExp());
		
		
		
	}
}
