package boki.innerClass;

import boki.util.print.Print;

// Creating an inner class directly using the .new syntax

public class DotNew {
	public class Inner{
		public void Inner() {
			Print.print("new Inner()");
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
        DotNew dn = new DotNew();
        // 透過OuterClass.new 提供一個reference指向InnerClass
        DotNew.Inner dni = dn.new Inner();
        // 不能像以下方法new一個Inner Class物件
        // 必須先有OuterClass物件才能產生InnerClass物件
        // 因為innerClass物件會被暗中連接到某個OuterClass物件上
        //Inner in = new Inner();
	}

}
