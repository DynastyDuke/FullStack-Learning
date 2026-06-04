package Java.OOP;

public class BankAccount {

    private String account;
    private String password;
    private String name;
    private int balance;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public BankAccount(String account, String password, String name, int balance) {
        this.account = account;
        this.password = password;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.printf("Amount %d, Total balance %d.%n", amount, balance);
    }

    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
        System.out.printf("Amount %d, Total balance %d.%n", amount, balance);
    }

    public void checkBalance() {
        System.out.printf("Your account balance is %d", balance);
    }
}