package CH08;

//interface Shape {
//    double perimeter();
//    float area();
//}
//
//class Triangle implements Shape {
//    private int x1, y1, x2, y2, x3, y3;
//
//    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
//        this.x1 = x1;
//        this.y1 = y1;
//        this.x2 = x2;
//        this.y2 = y2;
//        this.x3 = x3;
//        this.y3 = y3;
//    }
//
//    @Override
//    public double perimeter() {
//        // Implement parameter calculation for triangle
//    }
//
//    @Override
//    public float area() {
//        // Implement area calculation for triangle
//    }
//
//    @Override
//    public String toString() {
//        // Implement toString method for triangle
//    }
//}
//
//class Rectangle implements Shape {
//    private int x1, y1, x2, y2, x3, y3, x4, y4;
//
//    public Rectangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
//        this.x1 = x1;
//        this.y1 = y1;
//        this.x2 = x2;
//        this.y2 = y2;
//        this.x3 = x3;
//        this.y3 = y3;
//        this.x4 = x4;
//        this.y4 = y4;
//    }
//
//    @Override
//    public double perimeter() {
//        // Implement perimeter calculation for rectangle
//    }
//
//    @Override
//    public float area() {
//        // Implement area calculation for rectangle
//    }
//
//    @Override
//    public String toString() {
//        // Implement toString method for rectangle
//    }
//}
//
//class Square extends Rectangle {
//    private int side;
//
//    public Square(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int side) {
//        super(x1, y1, x2, y2, x3, y3, x4, y4);
//        this.side = side;
//    }
//
//    @Override
//    public double perimeter() {
//        // Implement perimeter calculation for square
//    }
//
//    @Override
//    public float area() {
//        // Implement area calculation for square
//    }
//
//    @Override
//    public String toString() {
//        // Implement toString method for square
//    }
//}
//
//class Pentagon implements Shape {
//    private int x1, y1, x2, y2, x3, y3, x4, y4, x5, y5;
//
//    public Pentagon(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int x5, int y5) {
//        this.x1 = x1;
//        this.y1 = y1;
//        this.x2 = x2;
//        this.y2 = y2;
//        this.x3 = x3;
//        this.y3 = y3;
//        this.x4 = x4;
//        this.y4 = y4;
//        this.x5 = x5;
//        this.y5 = y5;
//    }
//
//    @Override
//    public double perimeter() {
//        // Implement perimeter calculation for pentagon
//    }
//
//    @Override
//    public float area() {
//        // Implement area calculation for pentagon
//    }
//
//    @Override
//    public String toString() {
//        // Implement toString method for pentagon
//    }
//}
//
//public class Main Polymorpshism {
//    public static void main(String[] args) {
//        Shape[] arr = new Shape[4];
//        arr[0] = new Triangle(1, 2, 3, 4, 5, 6);
//        arr[1] = new Rectangle(1, 2, 3, 2, 1, 5, 3, 5);
//        arr[2] = new Square(1, 2, 3, 2, 1, 4, 3, 4, 2);
//        arr[3] = new Pentagon(5, 1, 8, 1, 3, 5, 10, 5, 6, 12);
//
//        for (Shape shape : arr) {
//            System.out.println(shape.toString());
//            System.out.println("Perimeter: " + shape.perimeter());
//            System.out.println("Area: " + shape.area());
//        }
//    }
//}