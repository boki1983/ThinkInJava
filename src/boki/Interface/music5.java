package boki.Interface;

import boki.util.print.Print;

class WindI implements InstrumentI {
	public void play(Note n) {
		Print.print("Wind.play() " +n);
	}
	public String what() { return "Wind"; }
	public void adjust() { }
}

class PercussionI implements InstrumentI {
	public void play(Note n) {
		Print.print("Percussion.play() " +n);
	}
	public String what() { return "Percussion"; }
	public void adjust() { }
}

class StringedI implements InstrumentI {
	public void play(Note n) {
		Print.print("Stringed.play() " +n);
	}
	public String what() { return "Stringed"; }
	public void adjust() { }
}

class BrassI extends WindI {
	@Override
	public void play(Note n) {
		Print.print("Brass.play() " +n);
	}
	@Override
	public void adjust() { Print.print("Brass.adjust()"); }
}

class WoodwindI extends WindI {
	@Override
	public void play(Note n) {
		Print.print("Woodwind.play() " +n);
	}
	public String what() { return "Woodwind"; }
}

public class music5 {
	    // Doesn't care about type, so new types
		// added to the system still work right;
	    static void tune(InstrumentI i) {
	    	i.play(Note.C_SHARPP);
	    }
	    static void tuneAll(InstrumentI[] e) {
	    	for (InstrumentI i : e) {
	    		tune(i);
	    	}
	    }
	    public static void main(String[] args) {
	 	   // Upcasting duringaddtion to the array
	 	   InstrumentI[] orchestra = {
	 			new WindI(),
	 			new PercussionI(),
	 			new StringedI(),
	 			new BrassI(),
	 			new WoodwindI()
	 	   };
	 	   tuneAll(orchestra);
	    }
}
