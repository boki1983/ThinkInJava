package boki.composition;

import boki.util.print.Print;

class WaterSource {
	private String s;
	WaterSource() {
		Print.print("WaterSource()");
		s = "Constructed";
	}
	public String toString() {
		return s;
	}
}

public class SprinkerSystem {
    private String value1;
    private Integer i;
    private WaterSource source = new WaterSource();
    SprinkerSystem() {
    	Print.print("SprinkerSystem()");
    }
	public String toString() {
		return "value1 = " + value1 +"\n" +
	                "i = " + i + "\n" + 
				    "source = " + source;
	}
	public static void main(String[] args) {
		SprinkerSystem ss = new SprinkerSystem();
		Print.print(ss);
	}
}
