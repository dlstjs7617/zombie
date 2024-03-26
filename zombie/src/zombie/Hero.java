package zombie;

public class Hero extends Unit{
	
	private int exp;
	
	public Hero(String name, int hp) {
		super(name, hp);
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
			this.exp += 10;
		}else {
			System.out.println(enemy);
		}
	}
	
	private void nomalAttack(int damage, Unit enemy) {
		enemy.setHp(damage);
		
		if(enemy.getHp() <= 0) {
			System.out.println(enemy.getName() + "을 처치하셨습니다");
			this.exp += 5;
		}else {
			System.out.println(enemy);
		}
	}
	
	public void attack(Unit enemy) {
		int damage = ran.nextInt(30)+10 + (this.getLevel*3);
		System.out.println("주인공의 공격 : " + damage);
		
		if(enemy instanceof BossMonster) {
			bossAttack(damage, enemy);
		}else {
			nomalAttack(damage, enemy);
		}
		
		
	}
	
}
