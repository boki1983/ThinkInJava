package boki.designPattern;

import java.util.Random;
// Factory Pattern�G���ͨ�L���O���u�t���O
public class RandomShapeGenerator {
    private Random rand = new Random(47);
    public Shape1 next() {
    	switch(rand.nextInt(3)) {
    	default:
    	case 0 : return new Circle1();
    	case 1 : return new Square1();
    	case 2 : return new Triangle1();
    	}
    }
}
