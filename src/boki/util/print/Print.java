package boki.util.print;

import java.io.PrintStream;

public class Print {
	/**
	 * 传︽
	 * @param obj 肚把计
	 */
    public static void print(Object obj) {
    	System.out.println(obj);
    }
    /**
     * 传︽(礚把计)
     */
    public static void print() {
    	System.out.println();
    }
    /**
     * ぃ传︽
     * @param obj 肚把计
     */
    public static void printnb(Object obj) {
    	System.out.print(obj);
    }
    /**
     * new Java SE5 printf (like c pintf) 
     * @param format 
     * @param objects 
     * @return PrintStream
     */
    public static PrintStream printf(String format, Object...objects) {
    	return System.out.printf(format, objects);
    }
}
