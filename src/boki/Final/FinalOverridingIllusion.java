package boki.Final;

import boki.util.print.Print;

class WithFianl {
	// identify to final 
	private final void f() {
		Print.print("WithFianl.f()");
	}
	
	// auto to final 
	private void g() {
		Print.print("WithFianl.g()");
	}
}

class OverridingPrivate extends WithFianl {
	
	private final void f() {
		Print.print("OverridingPrivate.f()");
	}
	
	private void g() {
		Print.print("OverridingPrivate.g()");
	}
}

class OverridingPrivate2 extends OverridingPrivate {
	
	public final void f() {
		Print.print("OverridingPrivate2.f()");
	}
	
	public void g() {
		Print.print("OverridingPrivate2.g()");
	}
}

public class FinalOverridingIllusion {
    public static void main(String[] args) {
    	OverridingPrivate2 op2 = new OverridingPrivate2();
    	op2.f();
    	op2.g();
    	// upcasting
    	OverridingPrivate op = op2;
    	//op.f();
    	//op.g();
    	// upcasting
    	WithFianl wf = op2;
    	//wf.f();
    	//wf.g();
    }
}
