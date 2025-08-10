package assignment3;

public class CountDigits {
	public static void main(String[] args) {
        String str = "Java1234";
        int digitCount = 0;
        int charCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                digitCount++;
            } else if (Character.isLetter(ch)) {
                charCount++;
            }
        }

        System.out.println("Digits: " + digitCount);
        System.out.println("Characters: " + charCount);
    }
}
