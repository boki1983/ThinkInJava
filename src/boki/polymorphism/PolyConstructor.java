package boki.polymorphism;

import boki.util.print.Print;

// Ploymorphism in constructor
class Glyph {
	void draw() {
		Print.print("Glyph.draw()");
	}
	Glyph() {
		Print.print("Glyph() before draw()");
		draw();
		Print.print("Glyph() after draw()");
	}
}

class RoundGlyph extends Glyph{
	private int radius = 1;
	RoundGlyph(int r) {
		radius = r;
		Print.print("RoundGlyph.RoundGlyph(), radius = " + radius);
	}
	void draw() {
		Print.print("RoundGlyph.draw(), radius = " + radius);
	}
}

public class PolyConstructor {
    public static void main(String[] args) {
    	new RoundGlyph(5);
    }
}
