package boki.innerClass;
// Nesting a class within a method

public class Parcel5 {
	// 在函式中使用inner class
    public Destination destination(String s) {
    	// 透過innerClass實作介面
    	class PDestination implements Destination {
    		private String label;
    		private PDestination (String whereTo) {
    			label = whereTo;
    		}
    		public String readLabel() {
    			return label;
    		}
    	}
    	return new PDestination(s);
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Parcel5 p = new Parcel5();
		// 透過method裡面inner class實作Interface，return reference
		Destination d = p.destination("Tasmania");
	}

}
