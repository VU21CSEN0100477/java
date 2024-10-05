abstract class Telephone {
    public abstract void dial();
    public abstract void lift();
    public abstract void disconnected();
}

class SmartTelephone extends Telephone {
    public void dial() {
        System.out.println("Dialing a number...");
    }

    public void lift() {
        System.out.println("Lifting the phone...");
    }

    public void disconnected() {
        System.out.println("Call disconnected.");
    }
}

public class modfoursix {
    public static void main(String[] args) {
        Telephone phone = new SmartTelephone();

        phone.dial(); // Output: "Dialing a number..."
        phone.lift(); // Output: "Lifting the phone..."
        phone.disconnected(); // Output: "Call disconnected."
    }
}
