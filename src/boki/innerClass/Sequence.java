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
    // �إߤ@��inner class�ɡA�䪫��֦��~�򪫥�(Outer class)�Ҧ������s���v��
    private class SequenceSelector implements Selector {
        private int i = 0;
		public boolean end() {
			// InnerClass SequenceSelector�i�����s��OuterClass Sequence��Ʀ���
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
    
    // �z�L���Ψ禡�^��inner class reference
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
