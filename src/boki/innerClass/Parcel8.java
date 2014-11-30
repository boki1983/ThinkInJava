package boki.innerClass;

import boki.util.print.Print;

// Calling the base-class constructor

public class Parcel8 {
    public Wrapping wrapping(int x) {
    	// Base constructor call
    	return new Wrapping(x) { // Passing constructor argument
    		public int value() {
    			return super.value() * 47;
    		}
    	};
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Parcel8 p = new Parcel8();
		Wrapping w = p.wrapping(10);
	}

}
