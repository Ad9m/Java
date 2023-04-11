public class BankAccount{
    private double checkingBalance;
    private double savingsBalance;
    public static int numberOfAccounts=0;
    public static double totalAmount=0;
    public BankAccount(double checkingBalance,double savingsBalance){
        this.checkingBalance=checkingBalance;
        this.savingsBalance=savingsBalance;
        numberOfAccounts++;
    }
    public double getCheckingBalance(){
        return checkingBalance;
    }
    public double getSavingsBalance(){
        return savingsBalance;
    }
    public void deposit(double amount){
       checkingBalance+=amount;
       savingsBalance+=amount;
        
    } public void withdraw(double amount) {
        if (savingsBalance < amount) {
            System.out.println("Insufficient funds");
        } else {
            savingsBalance -= amount;
        }
    }
     public void display() {
    System.out.println("Checking Balance: " + checkingBalance);
    System.out.println("Savings Balance: "+ savingsBalance)
    }
}