public class NestedExceptionExample {

    public static void main(String[] args) {
        try {
            // Call method1 which throws an exception
            method1();
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
            System.out.println("Nested Exception: " + e.getCause().getMessage());
        }
    }

    public static void method1() throws Exception {
        try {
            // Call method2 which throws an exception
            method2();
        } catch (Exception e) {
            // Wrap the exception in a new exception and throw it
            throw new Exception("Exception occurred in method1", e);
        }
    }

    public static void method2() throws Exception {
        // Simulate an exception occurring in method2
        throw new Exception("Exception occurred in method2");
    }
}
