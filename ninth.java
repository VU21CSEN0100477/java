import java.util.Scanner;
class ninth
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int y=sc.nextInt();
        System.out.println("Enter the number of multiples: ");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            int x=y*i;
            System.out.println(y+"X"+i+"="+x);
        }
    }
}