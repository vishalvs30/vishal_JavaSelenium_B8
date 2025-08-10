package assignment3;

public class SumElements {
	  public static void main(String[] args) {
	        int[] numbers = {9, 1, 15, 3, 2};
	        int sum = 0;
	        
	        for (int i = 0; i < numbers.length; i++) {
	            sum += numbers[i];
	        }
	        
	        System.out.print("Array elements: ");
	        for (int num : numbers) {
	            System.out.print(num + " ");
	        }
	        System.out.println("\nSum of all elements: " + sum);
	    }
}
