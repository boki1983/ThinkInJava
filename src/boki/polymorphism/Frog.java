package boki.polymorphism;

import boki.util.print.Print;

class Characteristic {
	private String s;
	Characteristic(String s) {
		this.s = s;
		Print.print("Creating Characteristic " + s);
	}
	protected void dispose() {
		Print.print("disposing Characteristic " + s);
	}
}

class Description {
	private String s;
	Description(String s) {
		this.s = s;
		Print.print("Creating Description " + s);
	}
	protected void dispose() {
		Print.print("disposing Description " + s);
	}
}

class LivingCreature {
	private Characteristic p = new Characteristic("is alive");
	private Description t = new Description("Basic Living Creature");
	
	LivingCreature() {
		Print.print("LivingCreature() ");
	}
	protected void dispose() {
		Print.print("LivingCreature dispose");
		t.dispose();
		p.dispose();
	}
}

class Animal extends LivingCreature {
	private Characteristic p = new Characteristic("has heart");
	private Description t = new Description("Animal not Vegetable");
	
	Animal() {
		Print.print("Animal()");
	}
	protected void dispose() {
		Print.print("Animal dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}
}

class Amphibian extends Animal {
	private Characteristic p = new Characteristic("can liveinwater");
	private Description t = new Description("Both water and land");
	
	Amphibian() {
		Print.print("Amphibian()");
	}
	protected void dispose() {
		Print.print("Amphibian dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}
}

public class Frog extends Amphibian {
	private Characteristic p = new Characteristic("Croaks");
	private Description t = new Description("Eats Bugs");
	
	Frog() {
		Print.print("Frog()");
	}
	protected void dispose() {
		Print.print("Frog dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}
	
	public static void main(String[] args) {
		Frog frog = new Frog();
		Print.print("Bye!!");
		frog.dispose();
	}
}
