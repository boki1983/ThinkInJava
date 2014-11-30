package boki.Final;

class SmallBrain {
	
}

final class Dinosaur {
	int i = 7;
	int j = 1;
	SmallBrain x = new SmallBrain();
	void f() {};
}

// final class can't extends
//class Further extends Dinosaur {}

public class FinalClass {
    public static void main(String[] args) {
    	Dinosaur d= new Dinosaur();
    	d.f();
    	d.i = 40;
    	d.j++;
    }
}
