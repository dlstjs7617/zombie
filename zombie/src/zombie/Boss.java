package zombie;

public class Boss extends Zombie{
	private int shield;
	
	public Boss(String name, int hp, int shield) {
		super("보스좀비", 400);
		this.shield = shield;
	}
	
	public void setShield(int shield) {
		this.shield = shield;
	}
	
	public int getShield() {
		return this.shield;
	}
	
	
}
