package boki.Singleton;

import boki.util.print.Print;

class Soup1 {
	private static int i = 0;
	private Soup1() {};
	public static Soup1 makeSoup1() {
		i++;
		new Print().print("create Soup1 obj" + i);
		return new Soup1();
	}
}

class Soup2 {
	private static int i;
	private Soup2() {i = 0;};
	//  singleton
	private static Soup2 s2 = new Soup2();
	public static Soup2 accessSingleton() {
		new Print().print("access Singleton Soup2 obj" + i);
		return s2;
	}
}

public class Lunch {
    public static void main(String[] args) {
    	//Soup1 s1 = new Soup1();
    	Soup1 s1 = Soup1.makeSoup1();
    	Soup1 s3 = Soup1.makeSoup1();
    	
    	//Soup2 s2 = new Soup2();
    	Soup2 s2 = Soup2.accessSingleton();
    	Soup2 s4 = Soup2.accessSingleton();
    }
}
