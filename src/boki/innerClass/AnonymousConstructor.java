package boki.innerClass;

import boki.util.print.Print;
// Creating a constructor for an anonymous inner class.

abstract class Base {
	// 透過實體初始化(instance initialization)完成匿名inner class的建構
	public Base(int i) {
		Print.print("Base constructor, i = " + i);
	}
	public abstract void f();
}

public class AnonymousConstructor {
	// 引數i不一定是final，因為當i傳入匿名class建構子時並不會直接使用i
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
