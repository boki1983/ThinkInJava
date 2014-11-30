package initialValues;

class Cup {
	Cup(int maker) {
		System.out.println("Cup(" + maker + ")");
	}
	void f(int maker) {
		System.out.println("f(" + maker + ")");
	}
}

class Cups {
	static Cup cup1;
	static Cup cup2;
	static {
		cup1 = new Cup(1);
		cup1 = new Cup(2);
	}
	Cups() {
		System.out.println("Cups()");
	}
}

public class ExplicitStatic {
    public static void main(String args[]) {
    	//Cups cups1 = new Cups();
    	Cups.cup1.f(99);
    }
}
