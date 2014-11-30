package terminationCondition;

class Book {
	boolean checkOut = false;
	Book (boolean checkout) {
		checkOut = checkOut;
	}
	void checkIn() {
		checkOut = false;
	}
	protected void finalize() {
		if (checkOut) {
			System.out.println("Error checked out");
		}
	}
}

public class terminationCondition {
    public static void main(String args[]) {
    	Book novel = new Book(true);
    	novel.checkIn();
    	new Book(true);
    	System.gc();
    }
}
