package initialValues;

class Mug {
	Mug(int maker) {
		System.out.println("Mug(" + maker + ")");
	}
	void f(int maker) {
		System.out.println("f(" + maker + ")");
	}
}

class Mugs {
	Mug Mug1;
	Mug Mug2;
	{
		Mug1 = new Mug(1);
		Mug1 = new Mug(2);
		System.out.println("mug1 & mug2 init");
	}
	Mugs() {
		System.out.println("Mugs()");
	}
	Mugs(int i) {
		System.out.println("Mugs(int)");
	}
}

public class nonStatic {
    public static void main(String[] args) {
    	new Mugs();
    	System.out.println("Mugs() completed");
    	new Mug(1);
    	System.out.println("Mug(1) completed");
    }
}
