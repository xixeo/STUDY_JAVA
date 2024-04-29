package CH07_제출과제_수정;

public class Triangles implements Shapes01 {
    private int x1, y1, x2, y2, x3, y3;

    public Triangles(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    @Override
    public double perimeter() {
        double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        return side1 + side2 + side3;
    }

    @Override
    public float area() {
        return 0.5f * Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)));
    }
    
    @Override
    public String toString() {
        return "Triangle: (" + x1 + ", " + y1 + "), "
        		+ "(" + x2 + ", " + y2 + "), (" + x3 + ", " + y3 + ")";
    }
    
}

