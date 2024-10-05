import java.util.Scanner;
class sixth
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year: ");
        int y=sc.nextInt();
        if(y%4==0 && y%100!=02)
        {
            System.out.println("It is a leap year");
        }
        else
        {
            System.out.println("Not a leap year");
        }
    }
}