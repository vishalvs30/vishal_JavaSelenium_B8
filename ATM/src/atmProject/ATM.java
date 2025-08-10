package atmProject;

import java.util.Scanner;

public class ATM {

	private double balance;
	private Scanner scan;
	
	public ATM() {
		balance=1000.0;
		scan=new Scanner(System.in);
	}
	
	public void displayMenu() {
		System.out.println("ATM Menu");
		System.out.println("1. checkBalance");
		System.out.println("2. Deposit");
		System.out.println("3. WithDraw");
        System.out.println("4. Exit");
		
	}
	
	public void checkBalance() {
		System.out.println("your Balance is $: "+balance);
	}
	
    public void deposit() {
		System.out.println("Enter the amount to deposit: ");
		double amount=scan.nextDouble();
		if(amount>0) {
			balance+=amount;
			System.out.println("$"+amount+"has been deposited");
		}
		else {
			System.out.println("Invalid amount");
		}
	}
    
    public void withDraw() {
		System.out.println("Enter the amount to withdraw:");
		double amount=scan.nextDouble();
		if(amount>0&&amount<=balance) {
			balance-=amount;
			System.out.println("$"+amount+"has been withdrwan");
		}
		else if(amount>balance){
			System.out.println("Insufficeints funds");
		}
		else {
			System.out.println("Invalid amount");
		}
	}
	
	public static void main(String[] args) {
		ATM atm = new ATM();
		while(true) {
			atm.displayMenu();
			System.out.println("Enter your choice: ");
			int choice=atm.scan.nextInt();
			
			switch(choice) {
			case 1:
				atm.checkBalance();
				break;
			case 2:
				atm.deposit();
				break;
			case 3:
				atm.withDraw();
				break;
		    default:
		    	System.out.println("Invalid choice");
				
			}
		}
	}

	
}
