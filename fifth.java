import java.util.Scanner;
class fifth
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first floating-point number: ");
        float a=sc.nextFloat();
        System.out.println("Enter the second floating-point number: ");
        float b=sc.nextFloat();
        float x=a*1000;
        float y=b*1000;
        int x1;
        int x2;
        x1=(int)x;
        x2=(int)y;
        if(x1==x2)
        {
            System.out.println("They are the same upto three decimal places");
        }
        else
        {
            System.out.println("They are not equal");
        }
    }
}