package zombie;

public class Game {
	
	private Game() {
		Hero hero = new Hero("주인공", 400);
	}
	
	private static Game instance = new Game();
	
	public static Game getInstance() {
		return instance;
	}
	
	private void createZombie() {
		Zombie zombie = new Zombie("좀비", 100);
	}
	
	private void createBoss() {
		Boss boss = new Boss("보스좀비", 500, 10);
	}
	
	private void printMenu() {
		System.out.println("1.전진하기");
		System.out.println("2.물약먹기");
	}
	
	private void gameRun() {
		printMenu();
	}
	
	
	public void run() {
		gameRun();
	}
}
