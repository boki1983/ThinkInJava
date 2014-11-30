package boki.com.operator;

public class Casting {
   public static void main(String[] args) {
	   int i = 200;
	   long lng = (long)i;
	   //  widening casting
	   lng = i;
	   long lng2 = (long)200;
	   lng2 = 200;
	   //  narrowing conversion
	   i = (int) lng2;
   }
}
