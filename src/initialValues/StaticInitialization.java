package initialValues;

class Bowl {
	Bowl(int maker) {
		System.out.println("Bowl(" + maker + ")");
	}
	void f1(int maker) {
		System.out.println("f1(" + maker + ")");
	}
}

class Table {
	static Bowl bowl1 = new Bowl(1);
	Table() {
		System.out.println("Table()");
		bowl2.f1(2);
	}
	void f2(int maker) {
		System.out.println("f2(" + maker + ")");
	}
	static Bowl bowl2 = new Bowl(2);
}

class Cupboard {
	Bowl bowl3 = new Bowl(3);
	static Bowl bowl4 = new Bowl(4);
	Cupboard() {
		System.out.println("Cupboard()");
		bowl4.f1(2);
	}
	void f3(int maker) {
		System.out.println("f3(" + maker + ")");
	}
	static Bowl bowl5 = new Bowl(5);
}

public class StaticInitialization {
	public static void main(String args[]) {
		System.out.println("create new Table in main");
		Table table = new Table();
		System.out.println("create new Cupboard in main");
		Cupboard cupboard = new Cupboard();
		table.f2(1);
		cupboard.f3(1);
	}

}
