package Assignment5;

interface Polygon1 {

	double getArea();

	default double getPerimeter(int... sides) {
		double sum = 0;
		for (int side : sides) {
			sum += side;
		}
		return sum;
	}

	static String shapeInfo() {
		return "A polygon is a closed figure with straight sides.";
	}
}

class Rectangle1 implements Polygon1 {

	private final double length;
	private final double breadth;

	public Rectangle1(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double getArea() {
		return length * breadth;
	}
}

class Triangle implements Polygon1 {

	private final double base;
	private final double height;

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public double getArea() {
		return 0.5 * base * height;
	}
}

public class Polygon {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(10, 5);
		Triangle tri = new Triangle(6, 4);

		System.out.println("Rectangle Area: " + rect.getArea());
		System.out.println("Rectangle Perimeter: " + rect.getPerimeter(10, 5, 10, 5));

		System.out.println("Triangle Area: " + tri.getArea());
		System.out.println("Triangle Perimeter: " + tri.getPerimeter(6, 6, 6));

		System.out.println("Polygon Info: " + Polygon.shapeInfo());
	}
}