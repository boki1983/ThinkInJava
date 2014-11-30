package boki.com.operator;

import java.util.Random;

class Letter {
	char c;
}

public class PassObject {
    static void f(Letter y) {
    	y.c = 'z';
    }
    
	public static void main(String[] args) {
		//Random rand = new Random();
		Letter x = new Letter();
		x.c = 'a';
		System.out.println("x.c = " + x.c);
		//  物件透過argment傳遞給函數，也是call by reference，造成aliasing
		f(x);
		System.out.println("x.c = " + x.c);
	}
}
