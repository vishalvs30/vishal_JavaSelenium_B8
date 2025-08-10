package Assignment5;

interface Printer {
	void print(String document);
}

class LaserPrinter implements Printer {
	public void print(String document) {
		System.out.println("LaserPrinter is printing: " + document);
	}
}

class InkjetPrinter implements Printer {
	public void print(String document) {
		System.out.println("InkjetPrinter is printing: " + document);
	}
}

public class printer {
	public static void main(String[] args) {
		Printer p;

		p = new LaserPrinter();
		p.print("Programming Notes");

		p = new InkjetPrinter();
		p.print("Test Report");
	}
}
