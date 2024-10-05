import java.util.Scanner;
class tenth
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int y=sc.nextInt();
        for(int i=1;i<=y;i++)
        {
            for(int j=1;j<=i;j++)
            {
            System.out.print(j+" ");
            }
            System.out.println("\n");
        }
    }
}