package initialValues;

public class AutoboxingVarargs {
    public static void f(Integer...integers) {
    	for(Integer i : integers) {
    		System.out.println(i);
    	}
    }
    public static void main(String[] args) {
    	f(new Integer("1"), new Integer("2"), new Integer("3"));
    	f(1, new Integer("2"), 3);
    }
}
