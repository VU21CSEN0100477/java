class Fibonacci {
    int n;

    Fibonacci(int n) {
        this.n = n;
    }

    void generateSeries() {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series of " + n + " terms: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}

public class modfournine {
    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci(5);
        fib.generateSeries(); // Output: Fibonacci Series of 10 terms: 0 1 1 2 3 5 8 13 21 34
    }
}
