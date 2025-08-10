package assignments12;

public class fibonnaci {
	public static void main(String[] args) {
        int a = 1, b = 2;
        System.out.print(a + " " + b + " ");
        for(int i = 3; i <= 10; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
