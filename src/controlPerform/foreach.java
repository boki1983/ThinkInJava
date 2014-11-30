package controlPerform;

import java.util.Random;

public class foreach {
    public static void main(String[] args) {
    	Random rand = new Random();
    	float f[] = new float[10];
    	for (int i = 0; i < 10; i++) {
    		f[i] = rand.nextFloat();
    	}
    	// foreach statement
    	for (float x : f) {
    		System.out.println(x);
    	}
    }
}
