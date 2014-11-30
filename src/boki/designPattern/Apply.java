package boki.designPattern;

import java.util.Arrays;

import boki.util.print.Print;

public class Apply {
    public static void process(Processor p, Object s) {
    	Print.print("Using processor " + p.name());
    	// polymorphism
    	Print.print(p.process(s));
    }
    public static String s = "Disagreement with beliefs is by definition incorrent";
    
    public static void main(String[] args) {
    	// stragety pattern：根據傳入引數物件不同而展現不同行為的method
    	process(new Upcase(), s);
    	process(new Downcase(), s);
    	process(new Splitter(), s);
    }
}
