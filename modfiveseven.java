class NameException extends Exception {
    public NameException(String message) {
        super(message);
    }
}

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) throws NameException, AgeException {
        if (isNumeric(name)) {
            throw new NameException("Invalid name: name should not be a number");
        }
        if (age > 50) {
            throw new AgeException("Invalid age: age should be less than or equal to 50");
        }
        this.name = name;
        this.age = age;
    }

    private boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Main {
    public static void main(String[] args) {
        try {
            Employee emp1 = new Employee("John", 30);
            System.out.println("Employee name: " + emp1.getName() + ", age: " + emp1.getAge());
            
            Employee emp2 = new Employee("123", 40);
            System.out.println("Employee name: " + emp2.getName() + ", age: " + emp2.getAge());
            
            Employee emp3 = new Employee("Alice", 55);
            System.out.println("Employee name: " + emp3.getName() + ", age: " + emp3.getAge());
        } catch (NameException e) {
            System.out.println("NameException: " + e.getMessage());
        } catch (AgeException e) {
            System.out.println("AgeException: " + e.getMessage());
        }
    }
}
/*OUTPUT:
 * Employee name: John, age: 30
   NameException: Invalid name: name should not be a number
 */