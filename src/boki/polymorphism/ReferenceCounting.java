package boki.polymorphism;

import boki.util.print.Print;

class Shared {
	// 砆把σΩ计
	private int refcount = 0;
	// instance玻ネΩ计 ㄏノlong琌ňゎ犯
	private static long counter = 0;
	// 
	private final long id = counter++;
	
	public Shared() {
		Print.print("Creating " + this);
	}
	
	public void addRef() {
		refcount++;
	}
	
	protected void dispose() {
		if (--refcount == 0) { // 癘更砆把σΩ计=0  dispose
			Print.print("Disposeing " + this);
		}
	}
	
	public String toString() {
		return "Shared" + id;
	}
}

class Composing {
	private Shared shared;
	// instance玻ネΩ计 ㄏノlong琌ňゎ犯
	private static long counter = 0;
	// 
	private final long id = counter++;
	
	public Composing(Shared shared) {
		Print.print("Create " + this);
		this.shared =shared;
		// –糤Composing instance碞рshared把σ璸计竟+1
		this.shared.addRef();
	}
	
	protected void dispose() {
		Print.print("dispose "+ this);
		shared.dispose();
	}
	
	public String toString() {
		return "Composing" + id;
	}
}

public class ReferenceCounting {
	public static void main(String[] args) {
	    Shared shared = new Shared();
	    
	    Composing[] composing = {
	    	new Composing(shared), new Composing(shared),
	    	new Composing(shared), new Composing(shared),
	    	new Composing(shared)
	    };
	    
	    for (Composing c : composing) {
	    	c.dispose();
	    }
	}
}
