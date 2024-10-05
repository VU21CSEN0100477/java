import java.util.Scanner;

class modfiveten {
    private int rollNo;
    private String name;
    private int[] marks = new int[5];
    
    public modfiveten(int rollNo, String name, int[] marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    
    public double getAverage() throws BacklogException {
        int sum = 0;
        int numSubjects = marks.length;
        int numBacklogs = 0;
        for (int mark : marks) {
            sum += mark;
            if (mark < 40) {
                numBacklogs++;
            }
        }
        if (numBacklogs > 2) {
            throw new BacklogException("Student has more than 2 backlogs");
        }
        return (double) sum / numSubjects;
    }
}

class BacklogException extends Exception {
    public BacklogException(String message) {
        super(message);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();
        sc.nextLine(); // consume the newline character left by nextInt()
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        int[] marks = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Marks in Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        modfiveten modfiveten = new modfiveten(rollNo, name, marks);
        try {
            double average = modfiveten.getAverage();
            System.out.println("Roll No: " + modfiveten.rollNo);
            System.out.println("Name: " + modfiveten.name);
            System.out.println("Average Marks: " + average);
        } catch (BacklogException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
