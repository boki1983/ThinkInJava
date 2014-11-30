package boki.innerClass;

import boki.util.print.Print;

// Using "instance initialization" to perform
// constructor on an anonymous inner class

public class Parcel10 {
	// 透過destination完成anonymous inner class初始值設定
    public Destination destination(final String dest, final float price) {
    	return new Destination() {
    		private int cost;
            // Instance initialization for each object
    		{
    			cost = Math.round(price);
    			if (cost > 100) {
    				Print.print("Over Budget!!");
    			}
    		}
    		private String  label = dest;
    		
			public String readLabel() {
				return label;
			}
    		
    	};
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Parcel10 p = new Parcel10();
		Destination d = p.destination("Tsamania", 101.395F);
	}

}
