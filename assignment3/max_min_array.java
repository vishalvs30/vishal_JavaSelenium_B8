package assignment3;

public class max_min_array {
	public static void main(String[] args) {
        int[] numbers = {5, 3, 92, 2, 45, 34, 89};
        int max = numbers[0];
        int min = numbers[0];
        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        
        System.out.print("Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nMaximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}
