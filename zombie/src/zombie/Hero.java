package zombie;

public class Hero extends Unit{

	public Hero(String name, int hp) {
		super(name, hp);
	}
	
	public void attack(Unit enemy) {
		int damage = ran.nextInt(20)+10;
		System.out.println("주인공의 공격 : " + damage);
		
		if(enemy instanceof bossMonster) {
			Boss boss = (Boss)enemy;
			
			if(damage-boss.getShield() <= 0) {
				enemy.setHp(0);
			}else {
				enemy.setHp(damage - boss.getShield());				
			}
			
			if(enemy.getHp() <= 0) {
				System.out.println(enemy.getName() + "을 처치하셨습니다");
			}else {
				System.out.println(enemy);
			}
		}else {
			enemy.setHp(damage);
			
			if(enemy.getHp() <= 0) {
				System.out.println(enemy.getName() + "을 처치하셨습니다");
			}else {
				System.out.println(enemy);
			}
		}
		
		
	}
	
}
