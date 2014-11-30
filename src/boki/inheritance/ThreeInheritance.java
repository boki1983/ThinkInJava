package boki.inheritance;

import boki.util.print.Print;

class one {
	one(int i) {
		Print.print("One constructor" + i);
	}
}

class two extends one {
	two(int i) {
		super(i + 1);
		Print.print("Two constructor" + i);
	}
}

public class ThreeInheritance extends two{
	ThreeInheritance(int i) {
		super(i + 1);
		Print.print("ThreeInheritance constructor" + i);
	}
	public static void main(String[] args) {
		ThreeInheritance three = new ThreeInheritance(1);
		
	}
}
