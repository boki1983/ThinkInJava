package boki.Interface;

import boki.util.print.Print;

interface Monster {
	void menace();
}

// ³z¹LÄ~©ÓÂX¥Rinterface
interface DangerousMonster extends  Monster{
	void destroy();
}

interface Lethal {
	void kill();
}

class DragonZilla implements  DangerousMonster {
	public void destroy() {
		Print.print("destroy by DragonZilla");
	}
	public void menace() {
		Print.print("menace by DragonZilla");
	}
}

interface Vampire extends DangerousMonster, Lethal {
	void drinkBlood();
}

class VeryBadVampire implements Vampire {
	public void menace() {
		Print.print("menace by VeryBadVampire");
	}
	public void destroy() {
		Print.print("destroy by VeryBadVampire");
	}
	public void kill() {
		Print.print("kill by VeryBadVampire");
	}
	public void drinkBlood() {
		Print.print("drinkBlood by VeryBadVampire");
	}
}

public class HorrorShow {
	static void u(Monster b) {
		b.menace();
	}
	static void v(DangerousMonster d) {
		d.menace();
		d.destroy();
	}
	static void w(Lethal l) {
		l.kill();
	}
    public static void main(String[] args) {
    	DangerousMonster barney = new DragonZilla();
    	u(barney);
    	v(barney);
    	Vampire vlad = new VeryBadVampire();
    	u(vlad);
    	v(vlad);
    	w(vlad);
    }
}
