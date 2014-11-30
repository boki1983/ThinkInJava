package boki.innerClass;

import boki.util.print.Print;
// Qualifying access to the outer-class object.

public class DotThis {
    void f() {
    	Print.print("DotThis.f()");
    }
    
    public class Inner {
    	public DotThis outer() {
    		// �ϥ�.this���VouterClass��object��reference
    		return DotThis.this;
    	}
    }
    
    public Inner inner() {
    	return new Inner();
    }
    
    public static void  main(String[] args) {
    	DotThis dt = new DotThis();
    	DotThis.Inner dti = dt.inner();
    	// �z�Louter()��k�Ǧ^DotThis����
    	dti.outer().f();
    }
}
