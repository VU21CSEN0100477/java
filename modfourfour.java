class Shape {
    public void printShape() {
        System.out.println("This is shape");
    }
}

class Rectangle extends Shape {
    public void printShape() {
        System.out.println("This is rectangular shape");
    }
}

class Circle extends Shape {
    public void printShape() {
        System.out.println("This is circular shape");
    }
}

class Square extends Rectangle {
    public void printShape() {
        System.out.println("Square is a rectangle");
    }
}

class modfourfour {
    public static void main(String[] args) {
        Square s = new Square();
        s.printShape(); // Output: "Square is a rectangle"
        
        Rectangle r = new Rectangle();
        r.printShape(); // Output: "This is rectangular shape"
        
        Shape sh = new Shape();
        sh.printShape(); // Output: "This is shape"
    }
}
