package boki.innerClass;

import boki.util.print.Print;
// Qualifying access to the outer-class object.

public class DotThis {
    void f() {
    	Print.print("DotThis.f()");
    }
    
    public class Inner {
    	public DotThis outer() {
    		// 使用.this指向outerClass之object的reference
    		return DotThis.this;
    	}
    }
    
    public Inner inner() {
    	return new Inner();
    }
    
    public static void  main(String[] args) {
    	DotThis dt = new DotThis();
    	DotThis.Inner dti = dt.inner();
    	// 透過outer()方法傳回DotThis物件
    	dti.outer().f();
    }
}
