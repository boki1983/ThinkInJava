package boki.innerClass;
// An anonymous inner class that performs
// initialization.A briefer version of Parcel5

public class Parcel9 {
	// Argument must be final to use inside
	// anonymous inner class
	// 若inner class使用到inner class之外的某物件，reference引數必須為final
    public Destination destination(final String dest) {
    	return new Destination() {
    		private String label = dest;
    		public String readLabel() {
    			return label;
    		}
    	};
    }
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Parcel9 p = new Parcel9();
		Destination d = p.destination("Tasmania");
	}

}
