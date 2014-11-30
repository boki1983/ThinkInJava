package boki.generics;

import boki.util.print.Print;

// �x��(Generics)�G�w�q���O�ɡA�o�{��n�X�����O���޿��곣�ۦP�A�N�u�O���үA�Ϊ����A���@�ˮɨϥ�
//  J2SE 5.0 �i��Object�ӸѨM�A���ഫ�����ɥο��F���A���y��ClassCastException
// <T> �Ψӫŧi�@�ӫ��A�����̡]Holder�^�A�i�H�� T �@�����A�N��ӫŧi�ܼơ]�Ѧҡ^�W��
public class GenericFoo<T> {
	
    private T foo;
    
    public void setFoo(T foo) {        
    	this.foo = foo;
    }     
    
    public T getFoo() {
    	return foo;    
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GenericFoo<Boolean> foo1 = new GenericFoo<Boolean>();
		GenericFoo<Integer> foo2 = new GenericFoo<Integer>();
		
		foo1.setFoo(new Boolean(true));
		foo2.setFoo(new Integer(10));
		
		Print.print("foo1.getFoo() : " + foo1.getFoo());
		Print.print("foo2.getFoo() : " + foo2.getFoo());
	}

}
