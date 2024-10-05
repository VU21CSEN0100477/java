import java.util.Scanner;
public class Arthmeticchar
{
    public static void main(String[] args)
    {
        String n;
        Scanner x=new Scanner(System.in);
        System.out.println("enter the name : ");
        n=x.next();
        System.out.println("the encrypted and decrypted versions respectively are:");
        for(int i = 0;i<n.length();i++)
        {
            char a=n.charAt(i);
            int b= a+1;
            char c=(char)b;
            System.out.println(c);
        }
        System.out.println(" and ");
        for(int j=0;j<n.length();j++)
        {
            char a=n.charAt(j);
            int d=a-1;
            char e=(char)d;
            System.out.println(e);
        }
    }
}