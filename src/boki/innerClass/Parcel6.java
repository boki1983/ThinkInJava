package boki.innerClass;

import boki.util.print.Print;

// Nesting a class within a scope
public class Parcel6 {
    private void internalTracking(boolean b) {
    	if (b) {
    		class TrackingSlip {
    			private String id;
    			TrackingSlip(String s) {
    				id = s;
    			}
    			String getSlip() {
    				return id;
    			}
    		}
			TrackingSlip ts = new TrackingSlip("slip");
			String s = ts.getSlip();
			Print.print("id = " + ts.getSlip());
    	}
		// Can't use it here! Out of scope
    	// because innerClass只能在if (b)區塊裡面存取
		//TrackingSlip ts = new TrackingSlip("slip");
    }
    public void track() {
    	internalTracking(true);
    }
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Parcel6 p = new Parcel6();
		p.track();
	}

}
