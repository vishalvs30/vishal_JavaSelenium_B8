package OOPS;

public class BankAcc {
  
	private double balance=0;
	public void deposite(double amt){
		if(amt>0) {
			balance+=amt;
			System.out.println("Deposited: "+amt);
		}
	}
	private void withdraw(double amt) {
		if(amt>0 && amt<=balance) {
			balance-=amt;
			 String amtStr = String.valueOf((int) amt); // Remove decimals
	         String masked = "*".repeat(amtStr.length());
			System.out.println("Withdraw amount: "+masked);
		}
		else {
			System.out.println("Invalid amount");
		}
	}
	private double getbalance(){
		return balance;
		
	}
	public static void main(String[] args) {
		BankAcc acc = new BankAcc();
		acc.deposite(5000.00);
		acc.withdraw(2000.00);
		System.out.println("Balance: "+acc.getbalance());
	}
	
	
}
