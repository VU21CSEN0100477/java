public class modfourtwo {
    double length;
    double width;
    double height;

    public modfourtwo(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public modfourtwo(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public double calculate() {
        return 0.0;
    }
}
class Test1 extends modfourtwo {
    public Test1(double length, double width) {
        super(length, width);
    }
    public Test1(double length, double width, double height) {
        super(length, width, height);
    }
    @Override
    public double calculate() {
        return length * width * height;
    }
    public static void main(String[] args) {
        Test1 cube = new Test1(3, 3, 3);
        double volume = cube.calculate();
        System.out.println("Volume of cube: " + volume);
        Test1 pyramid = new Test1(4, 4, 3);
        volume = pyramid.calculate();
        System.out.println("Volume of pyramid: " + volume);
    }
}