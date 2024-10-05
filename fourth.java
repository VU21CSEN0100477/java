import java.util.Scanner;
public class fourth
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input the 1st number: ");
    int a =sc.nextInt();
    System.out.println("Input the 2nd number: ");
    int b = sc.nextInt();
    System.out.println("Input the 3rd number: ");
    int c =sc.nextInt();
    if (a > b && a > c)
    {
    System.out.println("The greatest: " + a);
    }
    if (b > a && b > c)
    {
    System.out.println("The greatest: " +b);
    }
    if (c > a && c > b)
    System.out.println("The greatest: " + c);
 }
}