package constructorCleanup;

import boki.util.print.Print;

class Shape {
	Shape(int i) {
		Print.print("Shape constructor ");
	}
	void dispose() {
		Print.print("Shape dispose");
	}
}

class Circle extends Shape {
	Circle(int i) {
		super(i);
		Print.print("Drawing Circle ");
	}
	void dispose() {
		Print.print("Erasing Circle ");
		super.dispose();
	}
}

class Triangle extends Shape {
	Triangle(int i) {
		super(i);
		Print.print("Drawing Triangle ");
	}
	void dispose() {
		Print.print("Erasing Triangle ");
		super.dispose();
	}
}

class Line extends Shape {
	private int start, end;
	Line(int start, int end) {
		super(start);
		this.start = start;
		this.end = end;
		Print.print("Drawing Line: " + start + "," + end);
	}
	void dispose() {
		Print.print("Erasing Line: " + start + "," + end);
		super.dispose();
	}
}

public class CADSystem extends Shape{
   private Circle c;
   private Triangle t;
   private Line[] lines = new Line[3];
   public CADSystem(int i) {
	   super(i+1);
	   for(int j = 0; j < lines.length; j++) {
		   lines[j] = new Line(j,j*j);
	   }
	   c = new Circle(1);
	   t = new Triangle(1);
	   Print.print("Combine constructor");
   }
	void dispose() {
		Print.print("CAD dispose");
		c.dispose();
		t.dispose();
		for(Line line : lines) {
			line.dispose();
		}
		super.dispose();
	}
	public static void main(String[] args) {
		CADSystem x = new CADSystem(1);
		try {
			
		} finally {
			x.dispose();
		}
	}
}
