package boki.inheritance;

import boki.util.print.Print;

class Cleaner {
	private String s = "Cleaner";
	public void append(String a) {
		s += a;
	}
	public void dilute() {
		append(" dilute()");
	}
	public void apply() {
		append(" apply()");
	}
	public void scrub() {
		append(" scrub()");
	}
	public String toString() {
		return s;
	}
	public static void main(String[] args) {
		Cleaner c = new Cleaner();
		c.dilute();
		c.apply();
		c.scrub();
		Print.print(c);
	}
}

public class Detergent extends Cleaner {
	public void scrub() {
		append(" Detergent.scrub()");
		super.scrub();
	}
	public void foam() {
		append(" foam()");
	}
	public static void main(String[] args) {
		Detergent d = new Detergent();
		d.dilute();
		d.apply();
		d.scrub();
		d.foam();
		Print.print(d);
		Print.print("base class: ");
		//  執行Cleaner主程式
		Cleaner.main(args);
	}
}
