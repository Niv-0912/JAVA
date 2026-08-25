// Topics: this keyword, method overloading, constructor overloading, increment, decrement
import java.util.*;
class Version2
{
    private String accNo;
    private double balance;

    private static int accCount = 0;

    // Constructor 1
    public Version2(String accNo, double balance)
    {
        this.accNo = accNo;
        this.balance = balance;
        accCount++;
        System.out.println("Account Created Successfully.");
        System.out.println("Total Accounts: " + accCount);
    }

    // Constructor 2 - Constructor Overloading
    public Version2(String accNo)
    {
        this.accNo = accNo;
        this.balance = 0;
        accCount++;
        System.out.println("Account Created Successfully.");
        System.out.println("Initial Balance: Rs." + balance);
        System.out.println("Total Accounts: " + accCount);
    }

    public void checkBalance()
    {
        System.out.println("Current Balance: Rs." + balance);
    }

    // Method Overloading
    public void deposit(double amount)
    {
        if (amount > 0)
        {
            balance = balance + amount;
            System.out.println("Rs." + amount + " Deposited Successfully.");
        }
        else
        {
            System.out.println("Invalid Amount!");
        }
    }

    // Method Overloading
    public void deposit(double amount, String type)
    {
        if (amount > 0)
        {
            balance = balance + amount;
            System.out.println("Rs." + amount + " Deposited Successfully.");
            System.out.println("Deposit Type: " + type);
        }
        else
        {
            System.out.println("Invalid Amount!");
        }
    }

    public void withdraw(double amount)
    {
        if (balance < 10000)
        {
            System.out.println("Withdrawal not allowed! Minimum balance should be Rs.10000.");
        }
        else if (amount > 10000)
        {
            System.out.println("You can withdraw maximum Rs.10000 at a time.");
        }
        else if (amount <= 0)
        {
            System.out.println("Invalid Amount!");
        }
        else if (amount > balance)
        {
            System.out.println("Insufficient Balance.");
        }
        else
        {
            balance = balance - amount;
            System.out.println("Rs." + amount + " Withdrawn Successfully.");
            System.out.println("Remaining Balance: Rs." + balance);
        }
    }

    // Display account
    public void display()
    {
        System.out.println("----- ACCOUNT DETAILS -----");
        System.out.println("Account Number: " + this.accNo);
        System.out.println("Balance: Rs." + this.balance);
    }

    // Decrement when account is deleted
    public void closeAccount()
    {
        accCount--;

        System.out.println("Account " + this.accNo + " deleted successfully.");
        System.out.println("Total Accounts: " + accCount);
    }

    // Static method
    public static void totalAccounts()
    {
        System.out.println("Total Accounts: " + accCount);
    }
}

public class BankApplication
{
    public static void main(String[] args)
    {
        System.out.print("Enter Account Number: ");
        Scanner sc = new Scanner(System.in);
        String accNo = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        // Constructor 1 called
        Version2 account = new Version2(accNo, balance);

        int choice;
        do
        {
            System.out.println("\n---- DASHBOARD ----");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Deposit with Type");
            System.out.println("4. Withdraw");
            System.out.println("5. Display Account");
            System.out.println("6. Delete Account");
            System.out.println("7. Total Accounts");
            System.out.println("8. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    account.checkBalance();
                    break;

                case 2:
                    System.out.print("Enter Deposit Amount: ");
                    double dep = sc.nextDouble();

                    // Method Overloading
                    account.deposit(dep);
                    break;

                case 3:
                    System.out.print("Enter Deposit Amount: ");
                    double dep2 = sc.nextDouble();

                    sc.nextLine();

                    System.out.print("Enter Deposit Type: ");
                    String type = sc.nextLine();

                    // Method Overloading
                    account.deposit(dep2, type);
                    break;

                case 4:
                    System.out.print("Enter Withdraw Amount: ");
                    double wd = sc.nextDouble();

                    account.withdraw(wd);
                    break;

                case 5:
                    account.display();
                    break;

                case 6:
                    // Decrement account count
                    account.closeAccount();
                    break;

                case 7:
                    Version2.totalAccounts();
                    break;

                case 8:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
                    break;
            }

        }
        while(choice != 8);
        sc.close();
    }
}