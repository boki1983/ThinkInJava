package boki.Protected;

import boki.Public.Cookie;
import boki.util.print.Print;

public class ChocolateChip extends Cookie{
    public ChocolateChip() {
    	new Print().print("ChocolateChip constructor");
    }
    public void chomp() {
    	bite();
    }
    public static void main(String[] args) {
    	ChocolateChip x = new ChocolateChip();
    	x.chomp();
    }
}
