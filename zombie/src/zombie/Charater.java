package zombie;

public class Charater extends Unit{

	public Charater(String name, int hp) {
		super(name, hp);
	}
	
	public void attack(Unit enemy) {
		int damage = ran.nextInt(20)+10;
		System.out.println("주인공의 공격 : " + damage);
		
		enemy.setHp(damage);
		
		if(enemy.getHp() <= 0) {
			System.out.println(enemy.getName() + "을 처치하셨습니다");
		}else {
			System.out.println(enemy);
		}
	}
	
}
