package zombie;

abstract  class Unit {
	private String name;
	public final int MAX_HP;
	private int hp;
	private int location;
	private boolean isDead;
	
	
	public Unit(String name, int hp) {
		this.name = name;
		this.MAX_HP = hp;
		this.hp = hp;
	}
	
	public void setLocationPlus() {
		this.location++;
	}
	
	public int getLocation() {
		return location;
	}
	
	public int getHp() {
		return getHp();
	}
	
	public void setHp(int damage) {
		this.hp -= damage;
		if(this.hp <= 0) {
			this.isDead = true;
		}
	}
	
	@Override
	public String toString() {
		return String.format("%s : [%d/%d]", this.name, this.hp, this.MAX_HP);
	}
}
