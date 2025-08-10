package assignment3;

public class SecondLarge {
	public static void main(String[] args) {
        int[] numbers = {5, 3, 92, 2, 45, 34, 89};
        int highest = numbers[0];
        int secondHighest = numbers[0];
        
        for (int num : numbers) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num < highest) {
                secondHighest = num;
            }
        }
        
        System.out.print("Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nHighest element: " + highest);
        System.out.println("Second highest element: " + secondHighest);
    }
}
