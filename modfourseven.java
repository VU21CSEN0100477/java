abstract class Vehicle {
    public abstract void drive();
}

class Car extends Vehicle {
    public void drive() {
        System.out.println("Driving a car...");
    }
}

class Motorcycle extends Vehicle {
    public void drive() {
        System.out.println("Riding a motorcycle...");
    }
}

class Truck extends Vehicle {
    public void drive() {
        System.out.println("Driving a truck...");
    }
}

public class modfourseven {
    public static void main(String[] args) {
        Vehicle[] vehicles = {new Car(), new Motorcycle(), new Truck()};

        for (Vehicle v : vehicles) {
            v.drive();
        }
    }
}
