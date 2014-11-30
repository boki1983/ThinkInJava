package boki.innerClass;

import boki.innerClass.Parcel1.Contents;
import boki.innerClass.Parcel1.Destination;
import boki.util.print.Print;

public class Parcel2 {
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
	
	 // outer class�禡�^�Ǥ@��reference���Vinner class
	public Destination to(String s) {
		return new Destination(s);
	}
	
	public Contents contents() {
		return new Contents();
	}
	
	public void ship(String dest) {
		Contents c = new Contents();
		Destination d = new Destination(dest);
		Print.print(d.readLabel());
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Parcel2 p = new Parcel2();
		p.ship("Tamsmania");
		
		Parcel2 q = new Parcel2();
		// Defining references to inner class
		// �Q�n�b�~��class��non-static�禡���~���ͤ@��inner class����A
		// �HOuterClassName.InnerClassName���Φ����w�Ӫ��󫬧O(reference)
		Parcel2.Contents c = q.contents();
		Parcel2.Destination d = q.to("Borneo");
		q.ship(d.readLabel());
	}

}
