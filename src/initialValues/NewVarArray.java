package initialValues;

class A {};

public class NewVarArray {
	// java SE 5 ���Ѩϥ�Object...  �N��޼ƥi���s�өΦh��(�i�ܤ޼ƦC)
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
