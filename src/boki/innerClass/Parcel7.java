package boki.innerClass;
// Retrunung an instance of an anonymous inner class
public class Parcel7 {
	public Contents contents() {
		// ¦^¶Ç°Î¦WinnerClass
    	return new Contents() {
    		private int i = 11;
    		public int value() {
    			return i;
    		}
    	}; // Semicolon required in this case
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Parcel7 p = new Parcel7();
		Contents c = p.contents();
	}

}
