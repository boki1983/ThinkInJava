package boki.inheritance;

import boki.util.print.Print;

class Insect {
	private int i = 9;
	protected int j;
	Insect() {
		Print.print(" i = " + i + ", j =" + j);
		j=39;
	}
	private static int x1 = printInit("static Insect.x1 init");
	static int printInit(String s) {
		Print.print(s);
		return 41;
	}
}

public class Beetle extends Insect {
    private int k = printInit("Beetle.x1 init");
    public Beetle() {
    	Print.print(" k = " + k);
    	Print.print(" j = " + j);
    }
    private static int x2 = printInit("static Beetle.x2 init");
    
    public static void main(String[] args) {
    	Print.print("Beetle constructor");
    	Beetle b = new Beetle();
    }
}
