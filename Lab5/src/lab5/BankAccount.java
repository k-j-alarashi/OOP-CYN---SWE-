package lab5;

public class BankAccount {
    private int accountID ;
    private String accountHolder;
    private double amount ;

    public BankAccount(int accountID, String accountHolder, double amount) {
        this.accountID = accountID;
        this.accountHolder = accountHolder;
        this.amount = amount;
    }
    
    public void depodite(double amount){
        this.amount = this.amount + amount ;
        System.out.println("Your Current Cash : "+this.amount);
    }
    public void withDraw(double amount){
        if(amount<=this.amount){
            this.amount = this.amount - amount ;
            System.out.println("Withdraw : "+amount);
            System.out.println("Your Current Cash is : "+this.amount);
        }
        else{
            System.out.println("Sorry , You Have No Enough Cash ..!");
        }
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getAmount() {
        return amount;
    }
}
