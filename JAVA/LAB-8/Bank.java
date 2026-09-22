class BankAccount
{
    int accountno;
    double balance;

    static String bankName;
    static double intrest;

    public  BankAccount(int accountno, double balance)
    {
        this.accountno = accountno;
        this.balance = balance;
    }

    public static void setBankName(String name) {
        bankName = name;
    }

    public static void setAccIntreat(double ins) {
        intrest = ins;
    }

    public static String getBankName() {
        return bankName;
    }

     public static double getinst() {
        return intrest;
    }



    public void display()
    {
        System.out.println("Bankname is :" + getBankName());
        System.out.println("Account Number is :" + accountno);
        System.out.println("Balance is :" + balance);
        System.out.println("Account Intrest is :" +getinst() );

    }


}


public class Bank {
    public static void main(String[] args) {

        BankAccount.setBankName("Chandni public bank");
        BankAccount.setAccIntreat(5);

        BankAccount o1 = new BankAccount(123,500);
        
        o1.display();
        
    }
}
