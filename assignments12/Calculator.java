package assignments12;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Choose (+, -, *, /): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+': System.out.println("Sum: " + (a + b)); 
            break;
            case '-': System.out.println("Diff: " + (a - b)); 
            break;
            case '*': System.out.println("Product: " + (a * b)); 
            break;
            case '/': System.out.println("Divide: " + (a / b)); 
            break;
            default: System.out.println("Invalid operator");
	}
	}

}
