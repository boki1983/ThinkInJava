package boki.polymorphism;

import boki.util.print.Print;

class Derived extends privateOverride {
    public void f() {
    	Print.print("public f()");
    }
}

public class privateOverride {
    private void f() {
    	Print.print("private f()");
    }
    public static void main(String[] args) {
    	// not dynamic binding
    	// static final private method not a dynamic binding 
    	privateOverride po = new Derived();
    	po.f();
    }
}
