package boki.polymorphism;

import boki.util.print.Print;

enum Note {
	MIDDEL_C, C_SHARPP, B_FLAT;
};

class Instrument {
	void play(Note n) {
		Print.print("Instrument.play() " + n);
	}
	String what() {
		return "Instrument";
	}
	void adjust() {
		Print.print("adjust Instrument");
	}
}

class Wind extends Instrument {
	void play(Note n) {
		Print.print("Wind.play() " + n);
	}
	String what() {
		return "Wind";
	}
	void adjust() {
		Print.print("adjust Wind");
	}
}

class Percussion extends Instrument {
	void play(Note n) {
		Print.print("Percussion.play() " + n);
	}
	String what() {
		return "Percussion";
	}
	void adjust() {
		Print.print("Percussion Wind");
	}
}

class Stringed extends Instrument {
	void play(Note n) {
		Print.print("Stringed.play() " + n);
	}
	String what() {
		return "Stringed";
	}
	void adjust() {
		Print.print("Stringed Wind");
	}
}

class Woodwind extends Wind {
	void play(Note n) {
		Print.print("Woodwind.play() " + n);
	}
	String what() {
		return "Woodwind";
	}
	void adjust() {
		Print.print("Woodwind Wind");
	}
}

class Brass extends Wind {
	void play(Note n) {
		Print.print("Brass.play() " + n);
	}
	String what() {
		return "Brass";
	}
	void adjust() {
		Print.print("Brass Wind");
	}
}

public class Music {
    public static void tune(Instrument i) {
    	i.play(Note.C_SHARPP);
    }
    public static void tuneAll(Instrument... e) {
    	for (Instrument i : e) {
    		tune(i);
    	}
    }
    public static void main(String[] args) {
    	Instrument[] oechestra  = {
    		new Wind(),
    		new Percussion(),
    		new Stringed(),
    		new Brass(),
    		new Woodwind()
    	};
    	tuneAll(oechestra);
    	//Wind flute = new Wind();
    	//tune(flute); // upcasting
    }
}
