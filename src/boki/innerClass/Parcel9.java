package boki.innerClass;
// An anonymous inner class that performs
// initialization.A briefer version of Parcel5

public class Parcel9 {
	// Argument must be final to use inside
	// anonymous inner class
	// �Yinner class�ϥΨ�inner class���~���Y����Areference�޼ƥ�����final
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
