package boki.com.operator;

class Tank {
	int level;
}

public class Assignment {
	public static void main(String[] args) {
	    Tank t1 = new Tank();
	    Tank t2 = new Tank();
	    t1.level = 9;
	    t2.level = 10;
	    System.out.println("t1.level = " + t1.level);
	    System.out.println("t2.level = " + t2.level);
	    // 物件的assign是reference，會造成aliasing
	    t1 = t2;
	    t1.level = 27;
	    System.out.println("t1.level = " + t1.level);
	    System.out.println("t2.level = " + t2.level);
	}

}
