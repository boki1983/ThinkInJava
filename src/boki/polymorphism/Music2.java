package boki.polymorphism;

import boki.util.print.Print;

class Wind1 extends Instrument {
	public void play(Note n) {
		Print.print("Wind1.play() " + n);
	}
}

class Stringed1 extends Instrument {
	public void play(Note n) {
		Print.print("Stringed1.play() " + n);
	}
}

class Brass1 extends Instrument {
	public void play(Note n) {
		Print.print("Brass1.play() " + n);
	}
}

public class Music2 {
	 public static void tune(Wind1 i) {
	    	i.play(Note.C_SHARPP);
	    }
	 public static void tune(Stringed1 i) {
	    	i.play(Note.C_SHARPP);
	    }
	 public static void tune(Brass1 i) {
	    	i.play(Note.C_SHARPP);
	    }
	    public static void main(String[] args) {
	    	Wind1 flute = new Wind1();
	    	Stringed1 violin = new Stringed1();
	    	Brass1 frenchHorn = new Brass1();
	    	// noupcasting
	    	tune(flute); 
	    	tune(violin);
	    	tune(frenchHorn);
	    }
}
