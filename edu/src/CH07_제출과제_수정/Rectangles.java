package CH07_제출과제_수정;

public class Rectangles implements Shapes01 {
    protected int x1;
	protected int y1;
	protected int x2;
	protected int y2;
	protected int x3;
	protected int y3;
	protected int x4;
	protected int y4;

    public Rectangles(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
    }

    public double perimeter() {
        double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        return 2 * (side1 + side2);
    }

    public float area() {
        double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        return (float) (side1 * side2);
    }
    
    @Override
    public String toString() {
        return "Rectangle: (" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + "), "
        		+ "(" + x3 + ", " + y3 + "), (" + x4 + ", " + y4 + ")";
    }
}