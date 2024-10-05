import java.util.Scanner;

class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            if (num < 0) {
                throw new NegativeNumberException("Number cannot be negative.");
            }
            else if (num == 0) {
                throw new ZeroNumberException("Number cannot be zero.");
            }
            else {
                System.out.println("Number is: " + num);
            }
        }
        catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }
        catch (ZeroNumberException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Program has ended.");
        }
    }
}

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

class ZeroNumberException extends Exception {
    public ZeroNumberException(String message) {
        super(message);
    }
}