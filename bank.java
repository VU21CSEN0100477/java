import java.util.Scanner;
public class bank
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the intial balance:");
        double b=sc.nextDouble();
        System.out.println("Enter the amount to be deposited:");
        double d=sc.nextDouble();
        deposit(d,b);
        System.out.println("Enter the amount to withdraw:");
        double a=sc.nextDouble();
        withdraw(a,b+d);
    }
    public static void deposit(double amount,double balance)
    {
        balance=balance+amount; 
        System.out.println("Balance after depoist "+balance);
    }
    public static void withdraw(double amount,double balance)
    {
        if(balance>=amount)
        {
            balance=balance-amount;
            System.out.println("Balance after withdraw "+balance);
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }
}