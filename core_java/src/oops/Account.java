package oops;
import java.util.Scanner;
public class Account {
    private int id;
    private double balance;
    private long password;
    public void setId(int id) {
        this.id = id;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setPassword(long password) {
        this.password = password;
    }
    public int getId() {
        return id;
    }
    public double getBalance(long pass) {
        if (this.password != pass) {
            System.out.println("Invalid password. Cannot show balance.");
            return -1;
        }
        if (balance < 0) {
            System.out.println("Add funds in the account.");
            return -1;
        }
        return balance;
    }
    public static void main(String[] args) {
        Account a = new Account();
        a.setId(101);
        a.setPassword(1234);
        a.setBalance(500000000);
        System.out.println("Account ID: " + a.getId());
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the password: ");
        long userPass = sc.nextLong();
        double bal = a.getBalance(userPass);
        if (bal != -1) {
            System.out.println("Balance: ₹" + bal);
        }
        sc.close();
    }
}
