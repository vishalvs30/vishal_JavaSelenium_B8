package Assignment4;
class Shape {
    void area() { 
    	System.out.println("Area of shape"); 
    	}
}

class Circle extends Shape {
    void area() { 
    	System.out.println("Area of Circle: πr^2"); 
    	}
}

class Rectangle extends Shape {
    void area() { 
    	System.out.println("Area of Rectangle: l*b"); 
    	}
}
public class MethOVer {
	public static void main(String[] args) {
        Shape s1 = new Circle();
        s1.area();
        Shape s2 = new Rectangle();
        s2.area();
    }
}
