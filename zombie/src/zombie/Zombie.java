package zombie;

public class Zombie extends Unit{
	
	public Zombie(String name, int hp) {
		super(name, hp);
	}
	
	public void attack(Unit unit) {
		int damage = ran.nextInt(9)+1;
		
		unit.setHp(damage);
		System.out.printf("%s가 %d의 공격!!\n %s", this, damage, unit);
		
		if(unit.getHp() <= 0) {
			System.out.println(unit + "이" +this.getName() + "의 공격에 사망하였습니다.");
		}else {
			System.out.println(unit);
		}
		
	}
	
	
	
	
}
