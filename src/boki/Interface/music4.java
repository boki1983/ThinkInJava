package boki.Interface;

import boki.util.print.Print;

enum Note {
	MIDDEL_C, C_SHARPP, B_FLAT;
};
// 多型搭配abstract class
abstract class Instrument {
	// storage allocated for each
	private int i;
	public abstract void play(Note n);
	public String what() { return "Instrument"; }
	public abstract void adjust();
}

class Wind extends Instrument {
	@Override
	public void play(Note n) {
		Print.print("Wind.play() " +n);
	}
	public String what() { return "Wind"; }
	@Override
	public void adjust() { }
}

class Percussion extends Instrument {
	@Override
	public void play(Note n) {
		Print.print("Percussion.play() " +n);
	}
	public String what() { return "Percussion"; }
	@Override
	public void adjust() { }
}

class Stringed extends Instrument {
	@Override
	public void play(Note n) {
		Print.print("Stringed.play() " +n);
	}
	public String what() { return "Stringed"; }
	@Override
	public void adjust() { }
}

class Brass extends Wind {
	@Override
	public void play(Note n) {
		Print.print("Brass.play() " +n);
	}
	@Override
	public void adjust() { Print.print("Brass.adjust()"); }
}

class Woodwind extends Wind {
	@Override
	public void play(Note n) {
		Print.print("Woodwind.play() " +n);
	}
	public String what() { return "Woodwind"; }
}

public class music4 {
	// Doesn't care about type, so new types
	// added to the system still work right;
    static void tune(Instrument i) {
    	i.play(Note.C_SHARPP);
    }
    static void tuneAll(Instrument[] e) {
    	for (Instrument i : e) {
    		tune(i);
    	}
    }
   public static void main(String[] args) {
	   // Upcasting duringaddtion to the array
	   Instrument[] orchestra = {
			new Wind(),
			new Percussion(),
			new Stringed(),
			new Brass(),
			new Woodwind()
	   };
	   tuneAll(orchestra);
   }
}
