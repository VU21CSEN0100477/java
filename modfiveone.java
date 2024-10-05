package package1;

public class A {
    public int pub = 1;
    protected int prot = 2;
    int def = 3;
    private int priv = 4;
}

package package2;

import package1.A;

class B extends A {
    void display() {
        System.out.println("public member in subclass: " + pub); // visible
        System.out.println("protected member in subclass: " + prot); // visible
        System.out.println("default member in subclass: " + def); // visible
        // System.out.println("private member in subclass: " + priv); // not visible
    }
}

class C {
    void display() {
        A a = new A();
        System.out.println("public member in different package: " + a.pub); // visible
        // System.out.println("protected member in different package: " + a.prot); // not visible
        System.out.println("default member in different package: " + a.def); // visible
        // System.out.println("private member in different package: " + a.priv); // not visible
    }
}
