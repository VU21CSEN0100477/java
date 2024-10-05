public class modfivenine {
    private int accno;
    private String name;
    private double bal;

    public modfivenine(int accno, String name, double bal) {
        this.accno = accno;
        this.name = name;
        this.bal = bal;
    }

    public void deposit(double amt) {
        bal += amt;
        System.out.println("Amount deposited: " + amt);
        System.out.println("Current balance: " + bal);
    }

    public void withdraw(double amt) throws Exception {
        if (bal - amt < 1000) {
            throw new Exception("Insufficient balance");
        }
        bal -= amt;
        System.out.println("Amount withdrawn: " + amt);
        System.out.println("Current balance: " + bal);
    }

    public static void main(String[] args) {
        modfivenine acc = new modfivenine(1234, "John", 2000);
        try {
            acc.withdraw(1500);
            acc.withdraw(600);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
