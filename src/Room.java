
public class Room {

	int HP;
	int DEF;
	int ATK;
	int ACC;
	int AGL;
	int SPD;
	
	public int getHP() {
		return HP;
	}
	public void setHP(int hP) {
		HP = hP;
	}
	public int getDEF() {
		return DEF;
	}
	public void setDEF(int dEF) {
		DEF = dEF;
	}
	public int getATK() {
		return ATK;
	}
	public void setATK(int aTK) {
		ATK = aTK;
	}
	public int getACC() {
		return ACC;
	}
	public void setACC(int aCC) {
		ACC = aCC;
	}
	public int getAGL() {
		return AGL;
	}
	public void setAGL(int aGL) {
		AGL = aGL;
	}
	public int getSPD() {
		return SPD;
	}
	public void setSPD(int sPD) {
		SPD = sPD;
	}
	
	public Room(int hP, int dEF, int aTK, int aCC, int aGL, int sPD) {
		super();
		HP = hP;
		DEF = dEF;
		ATK = aTK;
		ACC = aCC;
		AGL = aGL;
		SPD = sPD;
	}
	
	
}
