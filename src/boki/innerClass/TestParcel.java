package boki.innerClass;

import boki.innerClass.Contents;
import boki.innerClass.Destination;

class Parcel4 {
	// notice: Interface�|�۰ʱN�Ҧ������নpublic
	// PContents�Oprivate���FParcel4�~��Lclass�L�k�s��
	private class PContents implements Contents {
		private int i = 11;
		public int value() {
			return i;
		}
	}
    // PDestination�Oprotected���FParcel4�P�lclass�Bpackage�~��Lclass�L�k�s�� 
	protected class PDestination implements Destination {
		private String label;
		PDestination (String whereTo) {
			label = whereTo;
		}
		public String readLabel() {
			return label;
		}
	}
	
	public Contents contents() {
		return new PContents();
	}

	public Destination to(String s) {
		return new PDestination(s);
	}

}

public class TestParcel {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Parcel4 p = new Parcel4();
		Contents c = p.contents();
		Destination d = p.to("Tasmania");
		// Illegal -- can't access private class:
		//Parcel4.PContents pc = p.new PContents(); 
				
	}

}
