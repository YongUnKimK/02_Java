package edu.kh.opp.practice.model.vo;

public class Hero {

	private String nickName;
	private String job;
	private int hp;
	private int mp;
	private int level;
	private double exp;
		
	public Hero() {};
	
	

	public Hero(String nickName ,String job ,int hp, int mp,int level, double exp) 
	{
		this.nickName=nickName;
		this.job=job;
		this.hp=hp;
		this.mp= mp;
		this.level= level;
		this.exp = exp;
	} 
	
	public void attack() {
		exp += exp;
		if(exp >= 300) {
		level++;
		System.out.println("레벨이 올랐습니다!");
		}
		
	}
	
	public void dash() {
		mp -= 10;
		System.out.println("대시를 사용했습니다");
		if(mp <= 0) {
			System.out.println("마력이 부족합니다.");
		}
	}
	
	@Override
	public String toString() {
		return "==============캐릭터 생성============";
	}



	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public double getExp() {
		return exp;
	}

	public void setExp(double exp) {
		this.exp = exp;
	}
	
	
	
}
