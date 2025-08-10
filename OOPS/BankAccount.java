package OOPS;

public class BankAccount {

    private String accountNumber = "1234567890";      // only inside class
    String accountType = "Savings";                   // default - same package
    protected double balance = 10000.50;              // subclass can access
    public String bankName = "State Bank of India";   // anywhere

    private void showAccNumber() {
        System.out.println("Account Number: " + accountNumber);
    }

    void showAccType() {
        System.out.println("Account Type: " + accountType);
    }

    protected void showBalance() {
        System.out.println("Balance: Rs" + balance);
    }

    public void showBankName() {
        System.out.println("Bank Name: " + bankName);
    }

    public void showDetails() {
        showAccNumber();
        showAccType();
        showBalance();
        showBankName();
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.showDetails();
    }
}
