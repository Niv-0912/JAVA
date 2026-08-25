// Version 4
// Topics: this keyword, method overloading, constructor overloading,
// increment, decrement, static block, static method, static variable,
// equalsIgnoreCase(), equals()

import java.util.*;

class Version4
{
    private String accNo;
    private double balance;

    // Login details
    private static String userId = "Diya";
    private static String password = "1234";

    // Static Variable
    private static int accCount = 0;

    // Static Block
    static
    {
        System.out.println("Bank Application Started.");
        System.out.println("Static Block Executed.");
    }

    // Constructor 1
    public Version4(String accNo, double balance)
    {
        this.accNo = accNo;
        this.balance = balance;

        accCount++;

        System.out.println("Account Created Successfully.");
        System.out.println("Total Accounts: " + accCount);
    }

    // Constructor 2 - Constructor Overloading
    public Version4(String accNo)
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

    // Static Method
    public static void totalAccounts()
    {
        System.out.println("Total Accounts: " + accCount);
    }
}

public class BankApplication
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // LOGIN
        System.out.println("----- LOGIN -----");

        System.out.print("Enter User-ID: ");
        String inputUserId = sc.nextLine();

        System.out.print("Enter Password: ");
        String inputPassword = sc.nextLine();

        // User-ID uses equalsIgnoreCase()
        // Password uses equals()
        if (inputUserId.equalsIgnoreCase("Diya") &&
            inputPassword.equals("1234"))
        {
            System.out.println("Login Successful!");
        }
        else
        {
            System.out.println("Invalid User-ID or Password!");
            sc.close();
            return;
        }

        // ACCOUNT DETAILS
        System.out.print("\nEnter Account Number: ");
        String accNo = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        // Constructor 1 called
        Version4 account = new Version4(accNo, balance);

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
                    // Static Method
                    Version4.totalAccounts();
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