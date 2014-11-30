package initialValues;

enum Spiciness {
	NOT,
	MILD,
	MEDIUM,
	HOT,
	FLAMEING
}

public class EnumOrder {
    public static void main(String[] args) {
    	for(Spiciness s : Spiciness.values()) {
    		System.out.println(s + " " + s.ordinal());
    	}
    	describe(Spiciness.HOT);
    	describe(Spiciness.MILD);
    }
    
    static void describe(Spiciness degree) {
    	switch(degree) {
    		case NOT:
    			System.out.println("NOT");
    			break;
    		case MILD:	
    			System.out.println("MILD");
    			break;
    		case MEDIUM:
    			System.out.println("MEDIUM");
    			break;
    		case HOT:
    			System.out.println("HOT");
    			break;
    		case FLAMEING:
    			System.out.println("FLAMEING");
    			break;
    		default:
    			break;
    	}
    }
}
