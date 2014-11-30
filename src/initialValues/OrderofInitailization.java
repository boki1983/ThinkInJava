package initialValues;

class Window {
	Window(int maker) { System.out.println("Window(" + maker + ")"); }
}

class House {
	Window w1 = new Window(1);
	House() {
		System.out.println("House()");
		w3 = new Window(33);
	}
	void f() {System.out.println("f()");}
	Window w2 = new Window(2);
	Window w3 = new Window(3);
}

public class OrderofInitailization {
    public static void main(String args[]) {
    	House h = new House();
    	h.f();
    }
}
