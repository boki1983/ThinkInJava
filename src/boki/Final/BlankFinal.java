package boki.Final;

class poppet {
	private int i;
	poppet(int ii) {
		i = ii;
	}
}

public class BlankFinal {
	//  initiallized final
    private final int i = 0;
    // blank final
    private final int j;
    // blank final reference
    private final poppet p;
    
    //  Blank final must be initiallized in the constructor
    public BlankFinal() {
    	j = 1;
    	p = new poppet(j);
    }
    
    public BlankFinal(int x) {
    	j = x;
    	p = new poppet(x);
    }
    
    public static void main(String[] args) {
    	new BlankFinal();
    	new BlankFinal(5);
    }
}
