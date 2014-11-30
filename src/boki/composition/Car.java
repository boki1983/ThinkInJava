package boki.composition;

import boki.util.print.Print;
// composition with public object

class Engine {
	public void start() {
		Print.print("start");
	}
	public void rev() {
		Print.print("rev");
	}
	public void stop() {
		Print.print("stop");
	}
}

class Wheel {
	public void inflate(int psi) {
		Print.print("inflate " + psi + "psi");
	}
}

class Window {
	public void rollup() {
		Print.print("rollup");
	}
	public void rolldown() {
		Print.print("rolldown");
	}
}

class Door {
	public Window window = new Window();
	public void open() {
		Print.print("open");
	}
	public void close() {
		Print.print("close");
	}
}

public class Car {
    public Engine engine = new Engine();
    public Wheel[] wheels = new Wheel[4];
    public Door leftdoor = new Door(), rightdoor = new Door();
    public Car() {
    	for(int i = 0; i < 4; i++) {
    		wheels[i] = new Wheel();
    	}
    }
    public static void main(String[] args) {
    	Car car= new Car();
    	car.leftdoor.window.rollup();
    	car.wheels[0].inflate(72);
    }
}
