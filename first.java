import java.util.Scanner;
class first 
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();  
        if(n>0)
            System.out.println(n + " is POSITIVE");
        else if(n<0)
            System.out.println(n + " is NEGATIVE");
        else
            System.out.println(n + " is a ZERO.");
    }
}