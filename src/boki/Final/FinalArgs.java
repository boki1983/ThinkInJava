package boki.Final;

import boki.util.print.Print;

class Gizmo {
	public void spin() {
		Print.print("spin");
	};
}

public class FinalArgs {
    void with(final Gizmo g) {
    	// The final local variable i cannot be assigned
    	//g = new Gizmo();
    }
    
    void without(Gizmo g) {
    	g = new Gizmo();
    	g.spin();
    }
    
    void f(final int i) {
    	// The final local variable i cannot be assigned
    	//Print.print(i++);
    }
    
    int g(final int i) { return i + 1; }
    
    public static void main(String[] args) {
    	FinalArgs fa = new FinalArgs();
    	fa.with(new Gizmo());
    	fa.without(new Gizmo());
    }
}
;