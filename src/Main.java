import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Welcome to the game, Adventurer. You have been chosen by the elders of your village to go to the near cave because somebody");
		System.out.println("escaped from the cave and stole everything valuable. Now your village lives in poverty and you are the only one who can save the villagers.");
		System.out.println();
		System.out.println("But First you'll have to pick your character.");
		System.out.println("(1)Warrior \"A mighty fighter that wants to use justice for the sake of the world.\"(balanced stats good for beginners)");
		System.out.println("(2)Assassin \"He was a thief that betrayed his criminal brothers and now he's trying to help people and repay his sins.\"(high agility and accuracy but lacks defense)");
		System.out.println("(3)Knight \"Tough guy that fought in countless battles decided to leave royal army and help people.\"(high defense and damage but because of his armor his agility and accuracy are low) ");
		Battle b = new Battle();
		while (b.getHero()<1 || b.getHero()>3) {
			b.setHero(sc.nextInt());
			if (b.getHero()==1) {
				System.out.println("You have chosen warrior.");
			}
			else if (b.getHero()==2) {
				System.out.println("You have chosen assassin.");
			}
			else if (b.getHero()==3) {
				System.out.println("You have chosen knight");
			}
			else {
				System.out.println("!USE NUMBERS FROM THE SELECTION!");
			}
		}
		
		b.battleSystem();
	}
}
