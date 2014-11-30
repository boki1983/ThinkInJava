package constructorCleanup;

public class Flower {
    int petalCount = 0;
    String s = "initial value";
    
    Flower(int petals) {
    	petalCount = petals;
    	System.out.println("Constructor w/ int arg only, petalCount = " + petalCount);
    }
    
    Flower(String ss) {
    	s = ss;
    	System.out.println("Constructor w/ String arg only, s = " + s);
    }
    
    Flower(String s, int petals) {
    	//  this呼叫本身符合引數型態建構子
    	this(petals);
    	// this呼叫本身物件  將資料成員s指定成引數s
    	this.s = s;
    	System.out.println("String & int args");
    }
    
    Flower() {
    	this("hi", 47);
    	System.out.println("Default constructor ");
    }
    
    void printPetalCount() {
    	System.out.println("PetalCount = " + petalCount + " s = " + s);
    }
    
    public static void main(String[] args) {
    	Flower x = new Flower();
    	x.printPetalCount();
    }
}
