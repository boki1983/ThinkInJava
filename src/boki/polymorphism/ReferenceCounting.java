package boki.polymorphism;

import boki.util.print.Print;

class Shared {
	// �Q�ѦҪ�����
	private int refcount = 0;
	// instance���ͪ����� �ϥ�long�O���F�����
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
		if (--refcount == 0) { // �O���Q�ѦҪ�����=0  �~��dispose
			Print.print("Disposeing " + this);
		}
	}
	
	public String toString() {
		return "Shared" + id;
	}
}

class Composing {
	private Shared shared;
	// instance���ͪ����� �ϥ�long�O���F�����
	private static long counter = 0;
	// 
	private final long id = counter++;
	
	public Composing(Shared shared) {
		Print.print("Create " + this);
		this.shared =shared;
		// �C�W�[�@��Composing instance�N��shared���Ѧҭp�ƾ�+1
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
