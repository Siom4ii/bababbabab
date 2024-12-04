
public class BankAccount {
    private static int totalAccounts = 0;

    private double balance;
    private String accountHolderName;

    public BankAccount (String name, double initialBalance){
        accountHolderName =  name;
        balance = initialBalance;
        totalAccounts++;
    }
    public void deposit (double amount){
        if (amount > 0){
            balance += amount;
            System.out.println(accountHolderName + " deposited " + amount + ".\nNew balance: " + balance);
        }else{
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void checkBalance (){
        System.out.println(accountHolderName + "'s current balance: " + balance);
    }
    public static int getTotalAccounts (){
        return totalAccounts;
    }
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("\nJane", 1000);
        BankAccount account2 = new BankAccount("\nLori", 2000);

        account1.deposit(200);
        account2.checkBalance();

        System.out.println("\nTotal bank accounts: " + BankAccount.getTotalAccounts());
    }
}
