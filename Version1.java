//Topics: Constructor, private-public access specifier, class-object
import java.util.*; 

class Version1 
{ 
    private String accNo; 
    private double balance; 
 
    // Constructor 
    public Version1(String accNo, double balance)  
    { 
        this.accNo = accNo; 
        this.balance = balance; 
    } 
 
    public void checkBalance()  
    { 
        System.out.println("Current Balance: Rs." + balance); 
    } 
 
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
} 
 
public class BankApplication 
{ 
    public static void main(String[] args)  
    { 
        Scanner sc = new Scanner(System.in); 
 
        System.out.print("Enter Account Number: "); 
        String accNo = sc.nextLine(); 
 
        System.out.print("Enter Initial Balance: "); 
        double balance = sc.nextDouble(); 
 
        Version1 account = new Version1(accNo, balance); 
 
        int choice; 
        do  
        { 
            System.out.println("---- DASHBOARD ----"); 
            System.out.println("1. Check Balance"); 
            System.out.println("2. Deposit"); 
            System.out.println("3. Withdraw"); 
            System.out.println("4. Exit"); 
            System.out.print("Enter Choice:"); 
            choice = sc.nextInt(); 
 
            switch (choice)  
            { 
                case 1: 
                    account.checkBalance(); 
                    break; 
 
                case 2: 
                    System.out.print("Enter Deposit Amount:"); 
                    double dep = sc.nextDouble(); 
                    account.deposit(dep); 
                    break; 
 
                case 3: 
                    System.out.print("Enter Withdraw Amount:"); 
                    double wd = sc.nextDouble(); 
                    account.withdraw(wd); 
                    break; 
 
                case 4: 
                    System.out.println("Thank You!"); 
                    break; 
 
                default: 
                    System.out.println("Invalid Choice!"); 
                    break; 
            } 
        }  
        while(choice != 4); 
        
        sc.close(); 
    } 
}