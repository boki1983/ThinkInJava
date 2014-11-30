package boki.innerClass;

import boki.util.print.Print;

public class Parcel1 {
	// Creating InnerClass
	class Contents {
		private int i = 11;
		public int value() {
			return i;
		}
	}

	class Destination {
		private String label;
		Destination (String whereTo) {
			label = whereTo;
		}
		String readLabel() {
			return label;
		}
	}
	
	// Using inner classes looks just like
	// using any other class, within Parcell
	public void ship(String dest) {
		Contents c = new Contents();
		Destination d = new Destination(dest);
		Print.print(d.readLabel());
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Parcel1 p = new Parcel1();
		p.ship("Tamsmania");
	}

}
