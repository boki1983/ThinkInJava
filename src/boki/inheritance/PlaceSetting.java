package boki.inheritance;

import boki.util.print.Print;

class Plate {
	Plate(int i) {
		Print.print("Plate constructed " + i);
	}
}

class DinnerPlate extends Plate {
	DinnerPlate(int i) {
		super(i + 1);
		Print.print("DinnerPlate constructed " + i);
	}
}

class Utensil {
	Utensil(int i) {
		Print.print("Utensil constructed " + i);
	}
}

class Spoon extends Utensil {
	Spoon(int i) {
		super(i + 1);
		Print.print("Spoon constructed " + i);
	}
}

class Fork extends Utensil {
	Fork(int i) {
		super(i + 1);
		Print.print("Fork constructed " + i);
	}
}

class Knife extends Utensil {
	Knife(int i) {
		super(i + 1);
		Print.print("Knife constructed " + i);
	}
}

class Custom {
	Custom(int i) {
		Print.print("Custom constructed " + i);
	}
}

public class PlaceSetting extends Custom {
	private Spoon sp;
	private Fork fk;
	private Knife kf;
	private DinnerPlate dp;
	public PlaceSetting(int i) {
		super(i);
		sp = new Spoon(i);
		fk = new Fork(i);
		kf = new Knife(i);
		dp = new DinnerPlate(i);
		Print.print("PlaceSetting constructed " + i);
	}
	
	public static void main(String[] args) {
		PlaceSetting x = new PlaceSetting(1);
	}
}
