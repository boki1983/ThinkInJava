package boki.Interface;

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
    	// stragety pattern
    	process(new Upcase(), s);
    	process(new Downcase(), s);
    	process(new Splitter(), s);
    }
}
