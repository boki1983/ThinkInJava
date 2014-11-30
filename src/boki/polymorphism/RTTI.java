package boki.polymorphism;
// Downcasting & Run-timetype information(RTTI)

class Useful {
	public void f() {};
	public void g() {};
}

class MoreUseful extends Useful{
	public void f() {};
	public void g() {};
	// extesible
	public void u() {};
	public void v() {};
	public void w() {};
}

public class RTTI {
    public static void main(String[] args) {
    	Useful[] x = {
    			new Useful(),
    			new MoreUseful()
    	};
    	x[0].f();
    	x[1].g();
    	// compiler time: method not found in Useful
    	// x[1].u();
    	((MoreUseful)x[1]).u();  // downcasting/RTTI
    	((MoreUseful)x[0]).u();  // Exception thrown
    }
}
