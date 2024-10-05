
		import java.util.Scanner;

interface QuadraticEquation {
    public void findRoots(double a, double b, double c);
}

class QuadraticEquationImpl implements QuadraticEquation {
    @Override
    public void findRoots(double a, double b, double c) {
        double root1, root2;
        double determinant = b * b - 4 * a * c;

        if (determinant > 0) {
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.println("The roots are real and different.");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } else if (determinant == 0) {
            root1 = -b / (2 * a);
            System.out.println("The roots are real and same.");
            System.out.println("Root 1 = Root 2 = " + root1);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-determinant) / (2 * a);
            System.out.println("The roots are complex and different.");
            System.out.println("Root 1 = " + realPart + "+" + imaginaryPart + "i");
            System.out.println("Root 2 = " + realPart + "-" + imaginaryPart + "i");
        }
    }
}

public class modfoureight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values of a, b, and c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        QuadraticEquation qe = new QuadraticEquationImpl();
        qe.findRoots(a, b, c);
    }
}
