interface A {
    void displayA();
}

interface B {
    void displayB();
}

class C implements A, B {
    public void displayA() {
        System.out.println("This is method from interface A.");
    }

    public void displayB() {
        System.out.println("This is method from interface B.");
    }
}

public class modfourten {
    public static void main(String[] args) {
        C c = new C();
        c.displayA();
        c.displayB();
    }
}
