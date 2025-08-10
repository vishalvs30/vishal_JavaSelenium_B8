package assignment3;

public class ArrayReverse {
	public static void main(String[] args) {
        int[] numbers = {3, 4, 5, 6, 7, 8};
        
        System.out.print("Original array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        
        System.out.print("\nReversed array: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
