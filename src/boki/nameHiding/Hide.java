package boki.nameHiding;

import boki.util.print.Print;

class Homer {
	char doh(char c) {
		Print.print("doh(char)");
		return c;
	}
	float doh(float f) {
		Print.print("doh(float)");
		return f;
	}
}

class Milhouse {}

class Bart extends Homer {
	void doh(Milhouse m) {
		Print.print("doh(Milhouse)");
	}
	@Override
	float doh(float f) {
		Print.print("Bart's doh(float)");
		return f;
	}
}

public class Hide {
    public static void main(String[] args) {
    	Bart b= new Bart();
    	b.doh(1);
    	b.doh('x');
    	b.doh(1.0f);
    	b.doh(new Milhouse());
    }
}
