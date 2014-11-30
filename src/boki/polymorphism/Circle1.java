package boki.polymorphism;

import boki.util.print.Print;

public class Circle1 extends Shape1 {
	   public void draw() {
		   Print.print("Circle.draw()");
	   }
	   public void erase() {
		   Print.print("Circle.erase()");
	   }
}
