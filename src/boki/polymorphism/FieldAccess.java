package boki.polymorphism;

import boki.util.print.Print;

class Super {
	public int field = 0;
	public int getField() {return field;}
}

class Sup extends Super {
	public int field = 1;
	public int getField() {return field;}
	public int getSuperField() {return super.field;}
}

public class FieldAccess {
    public static void main(String[] args) {
    	Super sup = new Sup(); // Upcasting
    	Print.print("sup.field = " + sup.field + " " + // filed沒有多型，取得reference的field
    	"sup.getField() = " + sup.getField());  //  method多型
    	Sup sub = new Sup();
    	Print.print("sub.filed = " + sub.field + " " + 
    	"sub.getField() = " + sub.getField() + " " + 
    	"sub.getSuperField() = " + sub.getSuperField());
    }
}
