package zombie;

public class Hero extends Unit{
	
	private int exp;
	
	public Hero(String name, int hp) {
		super(name, hp);
	}
	
	public int getExp() {
		return this.exp;
	}
	
	public void setExp() {
		this.exp = 0;
	}
	
	private void bossAttack(int damage, Unit enemy) {
		Boss boss = (Boss)enemy;
		
		if(damage-boss.getShield() <= 0) {
			enemy.setHp(0);
		}else {
			enemy.setHp(damage - boss.getShield());				
		}
		
		if(enemy.getHp() <= 0) {
			System.out.println(enemy.getName() + "을 처치하셨습니다");
			System.out.println("50의 경험치를 획득");
			this.exp += 50;
		}else {
			System.out.println(enemy);
		}
	}
	
	private void nomalAttack(int damage, Unit enemy) {
		enemy.setHp(damage);
		
		if(enemy.getHp() <= 0) {
			System.out.println(enemy.getName() + "을 처치하셨습니다");
			System.out.println("20의 경험치를 획득");
			this.exp += 20;
		}else {
			System.out.println(enemy);
		}
	}
	
	public void attack(Unit enemy) {
		int damage = ran.nextInt(40)+10 + (this.getLevel()*3);
		System.out.println("주인공의 공격 : " + damage);
		
		if(enemy instanceof Boss) {
			bossAttack(damage, enemy);
		}else {
			nomalAttack(damage, enemy);
		}
		
		
	}
	
}
