package assignments12;

public class CountDigits {
	public static void main(String[] args) {
        int number = 45689;
        int count = 0;
        while(number > 0) {
            number = number / 10;
            count++;
        }
        System.out.println("Total digits = " + count);
    }
}
