package boki.println;

public class ShowProperties {
    public static void main(String[] args) {
    	// 將執行程式所在系統的所有特性輸出到console
    	System.getProperties().list(System.out);
    	//  PC使用者名稱
    	System.out.println(System.getProperty("user.name"));
    	//  java環境變數路徑
    	System.out.println(System.getProperty("java.library.path"));
    }
	
}
