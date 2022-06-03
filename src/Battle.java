import java.util.ArrayList;
import java.util.Random;

public class Battle {
	
	Random r = new Random();
	
	int hero = 4;
	public int getHero() {
		return hero;
	}
	public void setHero(int hero) {//Math.abs(n)
		this.hero = hero;
	}
	
	
	public void battleSystem() {
		
		Room e = new Room(0, 0, 0, 0, 0, 0);
		Room h = new Room(0, 0, 0, 0, 0, 0);
		
		int room;
		String name;
		int efATK;
		int efACC;
		int hfATK;
		int hfACC;
		int hit;
		
		switch (hero) {
			case 1:
				name = "Warrior";
				h.setHP(42);
				h.setDEF(8);
				h.setATK(22);
				h.setAGL(5);
				h.setACC(12);
				h.setSPD(3);
				break;
			case 2:
				name = "assassin";
				h.setHP(30);
				h.setDEF(3);
				h.setATK(15);
				h.setAGL(12);
				h.setACC(14);
				h.setSPD(2);
				break;
			case 3:
				name = "Knight";
				h.setHP(60);
				h.setDEF(15);
				h.setATK(12);
				h.setAGL(2);
				h.setACC(5);
				h.setSPD(4);
				break;
		}
		
		for(int i = 0; i<7;i++) {
			
			room = r.nextInt(3)+1;
			switch (room) {
				case 1:
					name = "goblins";
					e.setHP(30);
					e.setDEF(3);
					e.setATK(15);
					e.setAGL(12);
					e.setACC(14);
					e.setSPD(2);
					break;
				case 2:
					name = "undead warrior";
					e.setHP(42);
					e.setDEF(8);
					e.setATK(22);
					e.setAGL(5);
					e.setACC(14);
					e.setSPD(3);
					break;
				case 3:
					name = "cursed bear";
					e.setHP(60);
					e.setDEF(15);
					e.setATK(12);
					e.setAGL(2);
					e.setACC(6);
					e.setSPD(4);
					break;
			}
			int t=0;
			while (e.getHP()>0 && h.getHP()>0) {
				t++;
				System.out.println("Health:" + h.getHP() + "Enemy Health:" + e.getHP());
				System.out.println(t);
				hfATK = h.getATK() - e.getDEF();
				hfACC = h.getACC() - e.getAGL();
				efATK = e.getATK() - h.getDEF();
				efACC = e.getACC() - h.getAGL();
				
				if (t % h.getSPD()==0) {
					System.out.println("You've attacked");
					hit = r.nextInt(20)+1;
					if (hit<h.getATK()+1) {
						e.setHP(e.getHP()-hfATK);
						System.out.println("Enemy health -" + efATK);
					}
					else {
						System.out.println("You've missed");
					}
				}
				else if (t % e.getSPD()==0) {
					System.out.println("Enemy attacked");
					hit = r.nextInt(20)+1;
					if (hit<e.getATK()+1) {
						h.setHP(h.getHP()-efATK);
						System.out.println("Health -" + efATK);
					}
					else {
						System.out.println("Enemy missed");
					}
				}
			}
			System.out.println("Battle ended");
		}
	}
}
