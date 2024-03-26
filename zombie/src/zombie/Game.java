package zombie;

import java.util.Scanner;

public class Game {
	private Scanner sc;
	
	private final int RUN = 1;
	private final int HEAL = 2;
	
	private Hero hero;
	private Zombie zombie;
	private Boss boss;
	
	private Game() {
		hero = new Hero("주인공", 400);
		sc = new Scanner(System.in);
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

	private int inputNumber(String message) {
		int number = -1;
		
		System.out.print(message + " : ");
		try {
			String input = sc.next();
			number = Integer.parseInt(input);
		} catch (Exception e) {
			System.err.println("숫자만 입력");
		}
		
		return number;
	}
	
	private void printMenu() {
		System.out.println("1.전진하기");
		System.out.println("2.물약먹기");
	}
	
	private void selectMenu(int sel) {
		if(sel == RUN)
			;
		else if(sel == HEAL)
			;
	}
	
	private void gameRun() {
		while(isRun()) {
			printMenu();
			int select = inputNumber("선택");
			selectMenu(select);
			
		}
	}
	
	
	public void run() {
		gameRun();
	}
}
