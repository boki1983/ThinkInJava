package boki.innerClass;

import boki.util.print.Print;

public class Sequence {
    private Object[] items;
    private int next = 0;
    public Sequence(int size) {
    	items = new Object[size];
    }
    public void add(Object x) {
    	if (next < items.length) {
    		items[next++] = x;
    	}
    }
    // 建立一個inner class時，其物件擁有外圍物件(Outer class)所有成員存取權限
    private class SequenceSelector implements Selector {
        private int i = 0;
		public boolean end() {
			// InnerClass SequenceSelector可直接存取OuterClass Sequence資料成員
			return i == items.length;
		}

		public Object current() {
			return items[i];
		}

		public void next() {
			if (i < items.length) {
				i++;
			}
		}
    }
    
    // 透過公用函式回傳inner class reference
    public Selector selector() {
    	return new SequenceSelector();
    }
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Sequence sequence = new Sequence(10);
		for (int i = 0; i < 10; i++) {
			sequence.add(Integer.toString(i));
		}
		Selector selector = sequence.selector();
		while (!selector.end()) {
			Print.print(selector.current());
			selector.next();
		}
	}

}
