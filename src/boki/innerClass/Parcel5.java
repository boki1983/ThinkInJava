package boki.innerClass;
// Nesting a class within a method

public class Parcel5 {
	// �b�禡���ϥ�inner class
    public Destination destination(String s) {
    	// �z�LinnerClass��@����
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
		// �z�Lmethod�̭�inner class��@Interface�Areturn reference
		Destination d = p.destination("Tasmania");
	}

}
