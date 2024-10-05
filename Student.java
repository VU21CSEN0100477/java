class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age should be between 15 and 21");
        }
        if (name.matches(".*\\d.*") || !name.matches("^[a-zA-Z]*$")) {
            throw new NameNotValidException("Name should not contain numbers or special symbols");
        }
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }
}

class Main {
    public static void main(String[] args) {
        try {
            Student student1 = new Student(1, "John", 20, "Computer Science");
            System.out.println("Roll no: " + student1.getRollNo() + ", Name: " + student1.getName() + ", Age: " + student1.getAge() + ", Course: " + student1.getCourse());

            Student student2 = new Student(2, "123", 25, "Mechanical Engineering");
            System.out.println("Roll no: " + student2.getRollNo() + ", Name: " + student2.getName() + ", Age: " + student2.getAge() + ", Course: " + student2.getCourse());
        } catch (AgeNotWithinRangeException e) {
            System.out.println("AgeNotWithinRangeException: " + e.getMessage());
        } catch (NameNotValidException e) {
            System.out.println("NameNotValidException: " + e.getMessage());
        }
    }
}
/*OUTPUT:
Roll no: 1, Name: John, Age: 20, Course: Computer Science
AgeNotWithinRangeException: Age should be between 15 and 21*/