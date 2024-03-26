package zombie;

import java.util.Random;
import java.util.Scanner;

public class Game {
	
	private final int RUN = 1;
	private final int EXIT = 2;
	
	private final int ATTACK = 1; 
	private final int HEAL = 2; 
	
	private Scanner sc;
	private Random ran;
	private Hero hero;
	private Zombie zombie;
	private Boss boss;
	
	private Game() {
		hero = new Hero("주인공", 400);
		sc = new Scanner(System.in);
		ran = new Random();
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
		System.out.println("2.종료하기");
	}
	
	private void printFightMenu() {
		System.out.println("1.공격하기");
		System.out.println("2.물약먹기");
	}

	private void zombieFight() {
		System.out.println(zombie.getName() + "와 조우했습니다!");
		createZombie();
		
		while(zombie.isDead() || hero.isDead()) {
			printFightMenu();
			int sel = inputNumber("선택");
			
			if(sel == ATTACK)
				hero.attack(zombie);
			else if(sel == HEAL) {
				hero.setHpHeal();
				System.out.println("50의 체력을 회복하셨습니다.");
			}
			
		}
	}
	
	private void bossFight() {
		System.out.println(boss.getName() + "와 조우했습니다!");
		createBoss();
		
		while(boss.isDead() || hero.isDead()) {
			printFightMenu();
			int sel = inputNumber("선택");
			
			if(sel == ATTACK)
				hero.attack(boss);
			else if(sel == HEAL) {
				hero.setHpHeal();
				System.out.println("50의 체력을 회복하셨습니다.");
			}
			
		}
	}
	
	
	private void forward() {
		int encounter = ran.nextInt(10)+1;
		
		if(encounter == 1) {
			zombieFight();
			hero.setLocationPlus();
		}else if(encounter == 5) {
			bossFight();
			hero.setLocationPlus();
		}else {
			hero.setLocationPlus();
			System.out.println(hero.getName() + "은 전진했습니다.");
		}
		
		
	}
	
	private void selectMenu(int sel) {
		if(sel == RUN)
			forward();
		else if(sel == EXIT)
			;
	}
	
	private void gameRun() {
		while(isRun()) {
			System.out.println(hero);
			printMenu();
			int select = inputNumber("선택");
			selectMenu(select);
			
		}
	}
	
	
	public void run() {
		gameRun();
	}
}
