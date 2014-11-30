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
    	//  �I�s����
    	// 1. �l�غc�l�|�V�W�I�s�̤W�h���غc�l�A�b�@�h�h�I�s�U��
    	// 2. �I�s�غc�l�e�|����l�Ʀ���
    }
}
