package boki.designPattern;

import boki.util.print.Print;

// Interface通常被設計用來做為多重實作的gateway
// FactoryPatternl：產生符合某interface之Object，不透過建構式，而是透過factory之生成函式。

interface Service {
	void method1();
	void method2();
}

interface ServiceFactory {
	Service getService();
}

class Impl1 implements Service {
	Impl1() {}; // package access
	public void method1() {
		Print.print("Impl1 method1");
	}
	public void method2() {
		Print.print("Impl1 method2");
	}
}

class Impl1Factory implements ServiceFactory {
	public Service getService() {
		return new Impl1();
	}
}

class Impl2 implements Service {
	Impl2() {}; // package access
	public void method1() {
		Print.print("Impl2 method1");
	}
	public void method2() {
		Print.print("Impl2 method2");
	}
}

class Impl2Factory implements ServiceFactory {
	public Service getService() {
		return new Impl2();
	}
}

public class Factories {
    public static void serviceConsumer(ServiceFactory fact) {
    	Service s = fact.getService();
    	s.method1();
    	s.method2();
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		serviceConsumer(new Impl1Factory());
		serviceConsumer(new Impl2Factory());
	}

}
