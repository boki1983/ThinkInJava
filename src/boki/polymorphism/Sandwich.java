package boki.polymorphism;

import boki.util.print.Print;

class Meal {
	Meal() {Print.print("Meal(");}
}

class Bread {
	Bread() {Print.print("Bread()");}
}

class Cheese {
	Cheese() {Print.print("Cheese()");}
}

class Lettuce {
	Lettuce() {Print.print("Lettuce()");}
}

class Lunch extends Meal {
	Lunch() {Print.print("Lunch()");}
}

class PortableLunch extends Lunch {
	PortableLunch() {Print.print("PortableLunch()");}
}

//  inheritance  composition  polymorphism
public class Sandwich extends PortableLunch {
	public Sandwich() {
		Print.print("Sandwich()");
	}
	private Bread b = new Bread();
	private Cheese c = new Cheese();
	private Lettuce l = new Lettuce();
    public static void main(String[] args) {
    	new Sandwich();
    	//  呼叫順序
    	// 1. 子建構子會向上呼叫最上層父建構子，在一層層呼叫下來
    	// 2. 呼叫建構子前會先初始化成員
    }
}
