package zombie;

public class Boss extends Zombie implements bossMonster{
	
	private final int CRITICAL = 1;
	private int shield;
	
	public Boss(String name, int hp, int shield) {
		super(name, hp);
		this.shield = shield;
	}
	
	public void setShield(int shield) {
		this.shield = shield;
	}
	
	public int getShield() {
		return this.shield;
	}
	
	private void criticalAttack(int damage, Unit charater) {
		int power = damage*2;
		System.out.println("보스의 치명타!공격 :" + power);
		
		charater.setHp(power);
		
		if(charater.getHp() <= 0) {
			System.out.println(charater.getName() +"이 " + getName() +"에 의해 사망하샸습니다");
		}else {
			System.out.println(charater);
		}
	}
	
	private void nomalAttack(int damage, Unit charater) {
		System.out.println("보스의 공격 : " + damage);
		charater.setHp(damage);
		
		if(charater.getHp() <= 0) {
			System.out.println(charater.getName() +"이 " + getName() +"에 의해 사망하셨습니다");
		}else {
			System.out.println(charater);
		}
	}
	
	public void attack(Unit charater) {
		int damage = ran.nextInt(10)+5;
		
		int critical = ran.nextInt(4)+1;
		
		if(critical == CRITICAL) {
			criticalAttack(damage, charater);
		}else {
			nomalAttack(damage, charater);
		}
	}
	
}
