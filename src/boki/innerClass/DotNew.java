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
        // �z�LOuterClass.new ���Ѥ@��reference���VInnerClass
        DotNew.Inner dni = dn.new Inner();
        // ���๳�H�U��knew�@��Inner Class����
        // ��������OuterClass����~�ಣ��InnerClass����
        // �]��innerClass����|�Q�t���s����Y��OuterClass����W
        //Inner in = new Inner();
	}

}
