public class readcommandline {
    public static void main(String[] args) {
        int c = args.length;
        System.out.println("Total number of arguments: " +c);
        System.out.println("Arguments:");
        for (int i = 0; i < c; i++) {
            System.out.println((i+1) + ": " + args[i]);
        }
    }
}
