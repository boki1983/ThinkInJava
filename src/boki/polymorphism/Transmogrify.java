package boki.polymorphism;

import boki.util.print.Print;
// Dynamic changing the behavior of object
// via composition (ths 'state' design pattern)

class Actor {
	public void act() {
		Print.print("Actor");
	}
}

class HappyActor extends Actor {
	public void act() {
		Print.print("HappyActor");
	}
}

class SadActor extends Actor {
	public void act() {
		Print.print("SadActor");
	}
}

class Stage {
	// composition
	private Actor actor = new HappyActor();
	public void change() {
		actor = new SadActor();
	}
	public void performPlay() {
		actor.act();
	}
	
}

public class Transmogrify {
    public static void main(String[] args) {
    	Stage stage = new Stage();
    	stage.performPlay();
    	stage.change();
    	stage.performPlay();
    }
}
