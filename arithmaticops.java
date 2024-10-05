import java.util.Scanner;
public class arithmaticops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two integers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("\nSUM       " +a+ " + " +b+ " = " + Sum(a,b));
        System.out.println("DIFFERENCE  " +a+ " - " +b+ " = " + Sub(a,b));
        System.out.println("PRODUCT     " +a+ " * " +b+ " = " + Mul(a,b));
        System.out.println("QUOTIENT    " +a+ " / " +b+ " = " + Div(a,b));
        System.out.println("MODULUS     " +a+ " % " +b+ " = " + Mod(a,b));
    }
    public static int Sum(int x,int y) 
    {
        return x+y;
    }
    public static int Sub(int x,int y) 
    {
        return x-y;
    }
    public static int Mul(int x,int y) 
    {
        return x*y;
    }
    public static float Div(int x,int y) 
    {
        return x/y;
    }
    public static int Mod(int x,int y) 
    {
        return x%y;
    }
}
