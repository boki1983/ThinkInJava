package boki.Interface;

interface I1 { 
	void f();
}

interface I2 { 
	int f(int i);
}

interface I3 { 
	int f();
}

class C {
	public int f() {
		return 1;
	}
}

class C2 implements I1, I2 {
    // overload
	public int f(int i) {
		return 1;
	}
	public void f() {
	}
}

class C3 extends C implements I2 {
    // overload
	public int f(int i) {
		return 1;
	}
}

class C4 extends C implements I3 {
    // Identical, no problem
	public int f() {
		return 1;
	}
}

// method differ only by return type
//class C5 extends C implements I1 {}
//interface I4 extends I1, I3 {}

public class InterfaceCollision {

}
