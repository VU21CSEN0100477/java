import java.io.*;
public class Static{
    static int n= 77;
    static String s= "Gitam";
    static void display()
    {
        System.out.println("static number is "+n);
        System.out.println("static string is "+s);
    }
    void nonstatic()
    {
        display();
    }
    public static void main(String args[])
    {
        Static obj = new Static();
        obj.nonstatic();
        display();
    }
}