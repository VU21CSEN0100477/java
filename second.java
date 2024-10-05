import java.util.Scanner;  
public class second
{ 
    public static void main(String[] Strings)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of a: ");  
        double a = sc.nextDouble();  
        System.out.println("Enter the value of b: ");  
        double b = sc.nextDouble();  
        System.out.println("Enter the value of c: ");  
        double c = sc.nextDouble();  
        double d= b * b - 4.0 * a * c;  
        if (d> 0.0)
        {
            double x = (-b + Math.pow(d, 0.5)) / (2.0 * a);  
            double y = (-b - Math.pow(d, 0.5)) / (2.0 * a);  
            System.out.println("The roots are " + x + " and " + y);  
        }   
        else if (d == 0.0)   
        {  
            double x = -b / (2.0 * a);  
            System.out.println("The root is " + x);  
        }   
        else   
        {  
            System.out.println("Roots are not real");
        }
    }
}