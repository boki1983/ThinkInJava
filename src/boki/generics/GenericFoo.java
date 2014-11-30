package boki.generics;

import boki.util.print.Print;

// 泛型(Generics)：定義類別時，發現到好幾個類別的邏輯其實都相同，就只是當中所涉及的型態不一樣時使用
//  J2SE 5.0 可用Object來解決，但轉換介面時用錯了型態易造成ClassCastException
// <T> 用來宣告一個型態持有者（Holder），可以用 T 作為型態代表來宣告變數（參考）名稱
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
