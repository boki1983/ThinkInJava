package boki.polymorphism;

import boki.util.print.Print;
//  Covarient retrun types  JAVA SE5  support

class Grain {
	public String toString() {
		return "Grain";
	}
}

class Wheat extends Grain {
	public String toString() {
		return "Wheat";
	}
}

class Mill {
	Grain process() {
		return new Grain();
	}
}

class WheatMill extends Mill {
	Wheat process() {
		return new Wheat();
	}
}

public class CovarientReturn {
    public static void main(String[] args) {
    	Mill m = new Mill();
    	Grain g = m.process();
    	Print.print(g);
        m = new WheatMill();
        g = m.process();
        Print.print(g);
    }
}
