package Assignment5;

public class Rectangle {

	private int width;
	private int height;

	// constructor with validation
	public Rectangle(int width, int height) {
		if (width > 0) {
			this.width = width;
		} else {
			this.width = 1;
		}

		if (height > 0) {
			this.height = height;
		} else {
			this.height = 1;
		}
	}

	public void setWidth(int width) {
		if (width > 0) {
			this.width = width;
		} else {
			System.out.println("Invalid width. Must be positive.");
		}
	}

	public void setHeight(int height) {
		if (height > 0) {
			this.height = height;
		} else {
			System.out.println("Invalid height. Must be positive.");
		}
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getArea() {
		return width * height;
	}

	public int getPerimeter() {
		return 2 * (width + height);
	}

	public void displayDetails() {
		System.out.println("Width: " + width);
		System.out.println("Height: " + height);
		System.out.println("Area: " + getArea());
		System.out.println("Perimeter: " + getPerimeter());
	}

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(10, 5);
		rect1.displayDetails();

		System.out.println();

		Rectangle rect2 = new Rectangle(-4, 0); // Invalid values
		rect2.displayDetails();
	}
}