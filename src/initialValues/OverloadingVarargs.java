package initialValues;

public class OverloadingVarargs {
    public static void f(Character...characters) {
    	System.out.println("first");
    	for(Character c : characters) {
    		System.out.println(c);
    	}
    }
    public static void f(Integer...integers) {
    	System.out.println("second");
    	for(Integer i : integers) {
    		System.out.println(i);
    	}
    }
    public static void f(Long...longs) {
    	System.out.println("third");
    	for(Long l : longs) {
    		System.out.println(l);
    	}
    }
    public static void main(String[] args) {
    	f('a','b','c');
    	f(1,2,3);
    	f(1L,2L,3L);
    	//  The method f(Character[]) is ambiguous for the type OverloadingVarargs
    	//f();
    }
}
