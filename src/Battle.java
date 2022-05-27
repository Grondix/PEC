import java.util.ArrayList;
import java.util.Random;

public class Battle {
	
	Random r = new Random();
	Room e = new Room(0, 0, 0, 0, 0);
	Room h = new Room(0, 0, 0, 0, 0);
	
	int hero = 4;
	public int getHero() {
		return hero;
	}
	public void setHero(int hero) {
		this.hero = hero;
	}
	int room;
	String name;
	
	public void battleSystem() {
		
		switch (hero) {
			case 1:
				name = "Warrior";
				h.setHP(42);
				h.setDEF(8);
				h.setATK(22);
				h.setAGL(5);
				h.setACC(12);
				break;
			case 2:
				name = "assassin";
				h.setHP(30);
				h.setDEF(3);
				h.setATK(15);
				h.setAGL(20);
				h.setACC(12);
				break;
			case 3:
				name = "Knight";
				h.setHP(60);
				h.setDEF(15);
				h.setATK(12);
				h.setAGL(2);
				h.setACC(5);
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
					e.setAGL(20);
					e.setACC(12);
					break;
				case 2:
					name = "undead warrior";
					e.setHP(42);
					e.setDEF(8);
					e.setATK(22);
					e.setAGL(5);
					e.setACC(12);
					break;
				case 3:
					name = "cursed bear";
					e.setHP(60);
					e.setDEF(15);
					e.setATK(12);
					e.setAGL(2);
					e.setACC(5);
					break;
			}
			while (e.getHP()==0 || h.getHP()==0) {
				int t=0;
				t++;
			}
		}
	}
}
