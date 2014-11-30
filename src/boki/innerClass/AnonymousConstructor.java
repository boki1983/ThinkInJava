package boki.innerClass;

import boki.util.print.Print;
// Creating a constructor for an anonymous inner class.

abstract class Base {
	// �z�L�����l��(instance initialization)�����ΦWinner class���غc
	public Base(int i) {
		Print.print("Base constructor, i = " + i);
	}
	public abstract void f();
}

public class AnonymousConstructor {
	// �޼�i���@�w�Ofinal�A�]����i�ǤJ�ΦWclass�غc�l�ɨä��|�����ϥ�i
    public static Base getBase(int i) {
    	return new Base(i) {
    		{Print.print("Inside instance initializer");}
			public void f() {
				Print.print("Inanonymous f()");
			}
    	};
    	
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Base base = getBase(47);
		base.f();
	}

}
