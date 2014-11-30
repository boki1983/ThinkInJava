package initialValues;

class A {};

public class NewVarArray {
	// java SE 5 提供使用Object...  代表引數可為零個或多個(可變引數列)
    static void printArray(Object...objects) {
    	for (Object obj : objects) {
    		System.out.println(obj + " ");
    	}
    }
    public static void main(String[] args) {
    	printArray(new Integer("1"), new Float("2.22"), new Double ("3.33"));
    	printArray("one", "two", "three");
    	printArray(new A(), new A());
    	//  Empty is OK
    	printArray();
    }
}
