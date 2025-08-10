package Assignment5;

import java.util.function.*;
import java.util.Arrays;

//1.	Sum of Two Integers
//2.	Define a functional interface SumCalculator { int sum(int a, int b); } and a lambda expression to sum two integers.
//3.	Check If a String Is Empty
//Create a lambda (via a functional interface like Predicate<String>) that returns true if a given string is empty.
//Predicate<String> isEmpty = s -> s.isEmpty();
//4.	Filter Even or Odd Numbers 
//
//
//
//
//
//5.	 Convert Strings to Uppercase/Lowercase
//6.	 Sort Strings by Length or Alphabetically
//7.	 Aggregate Operations (Sum, Max, Average) on Double Arrays
//8.	Create similar lambdas for max/min. 
//9.	Calculate Factorial

public class LambdaExp{
    public static void main(String[] args) {
        SumCalculator sumCalc = (a, b) -> a + b;
        System.out.println("Sum of 2 and 3: " + sumCalc.sum(2, 3));

        Predicate<String> isEmpty = s -> s.isEmpty();
        System.out.println("\"\" is empty: " + isEmpty.test(""));
        System.out.println("\"abc\" is empty: " + isEmpty.test("abc"));

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("Even: ");
        for (int n : arr) if (n % 2 == 0) System.out.print(n + " ");
        System.out.print("\nOdd: ");
        for (int n : arr) if (n % 2 != 0) System.out.print(n + " ");
        System.out.println();

        Function<String, String> toUpper = s -> s.toUpperCase();
        Function<String, String> toLower = s -> s.toLowerCase();
        System.out.println(toUpper.apply("hello"));
        System.out.println(toLower.apply("WORLD"));

        String[] words = {"dog", "apple", "bat"};
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        System.out.println("By length: " + Arrays.toString(words));
        Arrays.sort(words);
        System.out.println("Alphabetically: " + Arrays.toString(words));

        double[] nums = {2.5, 1.7, 6.2};
        double sum = 0, max = nums[0], min = nums[0];
        for (double d : nums) {
            sum += d;
            if (d > max) max = d;
            if (d < min) min = d;
        }
        System.out.println("Sum: " + sum + ", Max: " + max + ", Min: " + min + ", Avg: " + (sum/nums.length));

        Function<Integer, Long> fact = n -> {
            long r = 1;
            for (int i = 2; i <= n; i++) r *= i;
            return r;
        };
        System.out.println("5! = " + fact.apply(5));
    }

    interface SumCalculator { int sum(int a, int b); }
}
