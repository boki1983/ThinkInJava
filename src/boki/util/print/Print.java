package boki.util.print;

import java.io.PrintStream;

public class Print {
	/**
	 * ����C�L
	 * @param obj �ǤJ�C�L�Ѽ�
	 */
    public static void print(Object obj) {
    	System.out.println(obj);
    }
    /**
     * ����(�L�Ѽ�)
     */
    public static void print() {
    	System.out.println();
    }
    /**
     * ������C�L
     * @param obj �ǤJ�C�L�Ѽ�
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
