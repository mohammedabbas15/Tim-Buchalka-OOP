public class BankAccount
{
    private int balance;
    private int accountNumber;
    private int phoneNumber;
    private String name;
    private String email;

    public BankAccount()
    {
        // calling the pre-made constructor if no parameters are given
        // special case of the "this" method
        // has to be the first line in the empty constructor body
        this(100,12345,321432,"mohammed","mo@email.com");
        System.out.println("Empty constructor called");

    }
    public BankAccount(int balance, int accountNumber, int phoneNumber, String name, String email)
    {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.name = name;
        System.out.println("Fields initialized and constructor called");
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void withdraw(int amount)
    {
        if (amount > this.balance)
        {
            System.out.println("insufficient funds");
        }
        else
        {
            this.balance -= amount;
            System.out.println("Balance: " + this.balance);
        }
    }
    public void deposit(int amount)
    {
        this.balance += amount;
        System.out.println("Balance: " + this.balance);
    }
}
