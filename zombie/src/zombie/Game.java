package zombie;

public class Game {
	private Hero hero;
	private Zombie zombie;
	private Boss boss;
	
	private Game() {
		hero = new Hero("주인공", 400);
	}
	
	private static Game instance = new Game();
	
	public static Game getInstance() {
		return instance;
	}
	
	private void createZombie() {
		zombie = new Zombie("좀비", 100);
	}
	
	private void createBoss() {
		boss = new Boss("보스좀비", 500, 10);
	}
	
	private boolean isRun() {
		return hero.isDead() == false ? true : false;
	}
	
	private void printMenu() {
		System.out.println("1.전진하기");
		System.out.println("2.물약먹기");
	}
	
	private void gameRun() {
		while(isRun()) {
			printMenu();
			
		}
	}
	
	
	public void run() {
		gameRun();
	}
}
