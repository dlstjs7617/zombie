package zombie;

public class Zombie extends Unit{
	
	public Zombie(String name, int hp) {
		super(name, hp);
	}
	
	public void attack(Unit unit) {
		int damage = ran.nextInt(10)+1;
		
		unit.setHp(damage);
		System.out.printf("%s가 %d의 공격!!\n", getName(), damage);
		
		if(unit.getHp() <= 0) {
			System.out.println(unit.getName() + "이" +this.getName() + "의 공격에 사망하였습니다.");
		}else {
			System.out.println(unit);
		}
		
	}
	
	
	
	
}
