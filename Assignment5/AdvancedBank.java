package Assignment5;

import java.util.ArrayList;
import java.util.List;

class BankAccount {
	 
    private String accountNumber;
    private String accountHolder;
    private double balance;

   
    private List<Transaction> transactions;

   
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = Math.max(balance, 0); //to avoid neg balance
        this.transactions = new ArrayList<>();

        if (balance > 0) {
            transactions.add(new Transaction("Initial Deposit", balance));
        }
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add(new Transaction("Deposit", amount));
            System.out.println("Deposited: Rs" + amount);
        } else {
            System.out.println("Invalid deposit amount. Ignored.");
        }
    }

    
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactions.add(new Transaction("Withdrawal", amount));
            System.out.println("Withdrawn: Rs" + amount);
            return true;
        } else {
            System.out.println("Withdrawal failed. Insufficient funds or invalid amount.");
            return false;
        }
    }

   
    public double getBalance() {
        return balance;
    }

   
    public Transaction getLastTransaction() {
        if (transactions.isEmpty()) {
            return null;
        }
        return transactions.get(transactions.size() - 1);
    }

   
    @Override
    public String toString() {
        String masked = "****" + accountNumber.substring(accountNumber.length() - 4);
        return "BankAccount [Account Holder: " + accountHolder +
                ", Account Number: " + masked +
                ", Balance: Rs" + balance + "]";
    }

    private class Transaction {
        private String type;
        private double amount;

        public Transaction(String type, double amount) {
            this.type = type;
            this.amount = amount;
        }

        @Override
        public String toString() {
            return type + ": Rs" + amount;
        }
    }
}

public class AdvancedBank {

	public static void main(String[] args) {
        BankAccount account = new BankAccount("1234567890", "Alice Smith", 1000);

        System.out.println(account); 

        account.deposit(200);
        account.withdraw(150);
        account.withdraw(2000);

        System.out.println("\nBalance: Rs" + account.getBalance());

        // Last transaction
        System.out.println("Last Transaction: " + account.getLastTransaction());
    }
}