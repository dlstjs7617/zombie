package zombie;

public class Zombie extends Unit{
	
	public Zombie(String name, int hp) {
		super("일반좀비", 100);
	}
	
	public void attack(Unit unit) {
		int damage = ran.nextInt(9)+1;
		
		unit.setHp(damage);
		
		if(unit.getHp() <= 0) {
			unit.setHp(0);
			unit.setDead();
			System.out.println(unit + "이 사망하였습니다.");
		}else {
			System.out.printf("%s가 %d의 공격!!\n %s", this, damage, unit);
		}
	}
	
}
