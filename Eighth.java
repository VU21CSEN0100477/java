import java.util.Scanner;
class Eighth
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the five numbers: ");
        int y=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        int n=y+b+c+d+e;
        System.out.println("The sum is " +n);
        int avg=n/5;
        System.out.println("The average is " +avg);
    }
}