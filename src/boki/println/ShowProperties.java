package boki.println;

public class ShowProperties {
    public static void main(String[] args) {
    	// �N����{���Ҧb�t�Ϊ��Ҧ��S�ʿ�X��console
    	System.getProperties().list(System.out);
    	//  PC�ϥΪ̦W��
    	System.out.println(System.getProperty("user.name"));
    	//  java�����ܼƸ��|
    	System.out.println(System.getProperty("java.library.path"));
    }
	
}
