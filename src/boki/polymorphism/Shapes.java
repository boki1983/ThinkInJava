package boki.polymorphism;

public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();
    public static void main(String[] args) {
    	Shape1[] s = new Shape1[9];
    	for (int i = 0; i < s.length; i++) {
    		s[i] = gen.next();
    	}
    	for (Shape1 shape1 : s) {
    		shape1.draw();
    	}
    }
}
