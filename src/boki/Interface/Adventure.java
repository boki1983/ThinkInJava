package boki.Interface;

import boki.util.print.Print;

// 透過介面實現多重繼承
interface CanFight {
	void fight();
} 

interface CanSwim {
	void swim();
}

interface CanFly {
	void fly();
}

class ActionCharacter {
	private String name;
	ActionCharacter(String name) {
		this.name = name;
	}
	void name() {
		Print.print(name);
	}
	public void jump() {
		Print.print(" Can jump!!");
	}
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly {
	// 使用super透過子建構子呼叫父建構子(有帶參數)
	Hero(String name) {
		super(name);
	}
    
	public void fly() {
		Print.print(" Can Fight!!");
	}

	public void swim() {
		Print.print(" Can Swim!!");
	}

	public void fight() {
		Print.print(" Can CanFly!!");
	}	
}


public class Adventure {
	public static void t(CanFight x) {
    	x.fight();
    }
	public static void u(CanSwim x) {
    	x.swim();
    }
	public static void v(CanFly x) {
    	x.fly();
    }
	public static void w(ActionCharacter x) {
    	x.jump();
    }
	public static void main(String[] args) {
		Hero h = new Hero("boki");
		h.name();
		t(h);
		u(h);
		v(h);
		w(h);
	}
}
