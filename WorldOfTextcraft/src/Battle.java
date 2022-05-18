import java.util.ArrayList;
import java.util.Random;

public class Battle {
	
	Random r = new Random();
	Room e = new Room(0, 0, 0, 0, 0);
	
	int room;
	String name;
	
	public void battleSystem() {
		
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
				
			
			
		}
	}
}
