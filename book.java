import java.util.Scanner;
public class book
{
    private int code;
    private String title;
    private double price;
    public book(int code, String title, double price)
    {
        this.code = code;
        this.title = title;
        this.price = price;
    }
    public int getCode()
    {
        return code;
    }
    public String getTitle()
    {
        return title;
    }
    public double getPrice()
    {
        return price;
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        boolean exit=false;
        while (!exit)
        {
            System.out.println("Enter book code or enter -1");
            int code=scan.nextInt();
            if (code==-1)
            {
                exit=true;
                continue;
            }
            System.out.println("Enter book title: ");
            String title = scan.next();
            System.out.println("Enter book price: Rs.");
            double price = scan.nextDouble();
           
            book myBook=new book(code, title, price);
           
            System.out.println("Book code: " + myBook.getCode());
            System.out.println("Book title: " + myBook.getTitle());
            System.out.println("Book price: Rs." + myBook.getPrice());
        }
        scan.close();
    }
}