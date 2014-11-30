package boki.polymorphism;
//  polymorphism

public class Shape {
    protected void erase() {
    	System.out.println("erase sharp");
    } 
    protected void draw() {
    	System.out.println("erase draw");
    }
    
    static void doSomething(Shape shape) {
    	shape.erase();
    	shape.draw();
    }
    
    public static void main(String[] args) {
    	Circle circle = new Circle();
    	Triangle triangle = new Triangle();
    	Line line = new Line();
    	
    	doSomething(circle);
    	doSomething(triangle);
    	doSomething(line);
    }
}


class Circle extends Shape{
	protected void erase() {
    	System.out.println("erase Circle");
    } 
    protected void draw() {
    	System.out.println("erase Circle");
    }
}

class Triangle extends Shape{
	protected void erase() {
    	System.out.println("erase Triangle");
    } 
    protected void draw() {
    	System.out.println("erase Triangle");
    }
}

class Line extends Shape{
	protected void erase() {
    	System.out.println("erase Line");
    } 
    protected void draw() {
    	System.out.println("erase Line");
    }
}



