class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;
}

class Manager extends Member {
    String department;
public static void main(String[] args) {

    Employee employee = new Employee();
    employee.name = "John Smith";
    employee.age = 25;
    employee.phoneNumber = "123-456-7890";
    employee.address = "123 Main St.";
    employee.salary = 50000.0;
    employee.specialization = "Software Engineer";

    Manager manager = new Manager();
    manager.name = "Jane Doe";
    manager.age = 35;
    manager.phoneNumber = "555-555-5555";
    manager.address = "456 Park Ave.";
    manager.salary = 100000.0;
    manager.department = "Engineering";
System.out.println("Employee:");
System.out.println("Name: " + employee.name);
System.out.println("Age: " + employee.age);
System.out.println("Phone number: " + employee.phoneNumber);
System.out.println("Address: " + employee.address);
employee.printSalary();
System.out.println("Specialization: " + employee.specialization);

System.out.println();

System.out.println("Manager:");
System.out.println("Name: " + manager.name);
System.out.println("Age: " + manager.age);
System.out.println("Phone number: " + manager.phoneNumber);
System.out.println("Address: " + manager.address);
manager.printSalary();
System.out.println("Department: " + manager.department);
}
}