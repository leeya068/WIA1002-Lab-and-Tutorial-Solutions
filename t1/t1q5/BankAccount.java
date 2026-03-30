package t1q5;

public class BankAccount implements Account{
    private double balance;

    BankAccount(double balance){
        this.balance = balance;
    }

    public double deposit(double depositAmount){
        balance = balance + depositAmount;
        return balance;
    }

    public boolean withdraw(double withdrawAmount){
        if (withdrawAmount <= this.balance){
            this.balance = this.balance - withdrawAmount;
            return true;
        } else{
            System.out.println("You do not have sufficient balance.");
            return false;
        }

    }
}
