public class TestBankAccount{
    public static void main(String[]args){
       BankAccount myAccount = new BankAccount(1000.0,500.0);
        myAccount.deposit(500.0);
        myAccount.withdraw(200.0);
        myAccount.display();
    }
}