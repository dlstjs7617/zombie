package zombie;

import java.util.Random;

abstract  class Unit {
	private String name;
	public final int MAX_HP;
	private int hp;
	
	private int level;

	private int location;
	private boolean isDead;
	
	Random ran;
	
	public Unit(String name, int hp) {
		this.name = name;
		this.MAX_HP = hp;
		this.hp = hp;
		this.level = 1;
		ran = new Random();
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public void setHp(int damage) {
		this.hp -= damage;
		if(this.hp <= 0) {
			this.hp = 0;
			this.isDead = true;
		}
	}
	
	public void setHpHeal() {
		this.hp += 50;
		if(this.hp > this.MAX_HP) {
			this.hp = this.MAX_HP;
		}
	}
	
	public int getLevel() {
		return this.level;
	}

	public void setLevel() {
		this.level++;
	}
	
	public void setLocationPlus() {
		this.location++;
	}
	
	public int getLocation() {
		return location;
	}
	
	public boolean isDead() {
		return isDead;
	}

	public void setDead() {
		this.isDead = true;
	}

	@Override
	public String toString() {
		return String.format("%s : [%d/%d]", this.name, this.hp, this.MAX_HP);
	}
}
