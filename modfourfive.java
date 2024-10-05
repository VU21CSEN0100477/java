class Parent {
    public void parentMethod() {
        System.out.println("This is parent class");
    }
}

class Child extends Parent {
    public void childMethod() {
        System.out.println("This is child class");
    }
}

class modfourfive {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();

        // Call the method of parent class by object of parent class
        p.parentMethod(); // Output: "This is parent class"

        // Call the method of child class by object of child class
        c.childMethod(); // Output: "This is child class"

        // Call the method of parent class by object of child class
        c.parentMethod(); // Output: "This is parent class"
    }
}
