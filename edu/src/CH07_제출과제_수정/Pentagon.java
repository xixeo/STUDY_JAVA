package CH07_제출과제_수정;

//제출완

public class Pentagon implements Shapes01 {
    private int x1, y1, x2, y2, x3, y3, x4, y4, x5, y5;
    

    public Pentagon(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int x5, int y5) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
        this.x5 = x5;
        this.y5 = y5;
    }

    @Override
    public double perimeter() {
        double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double side3 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
        double side4 = Math.sqrt(Math.pow(x5 - x4, 2) + Math.pow(y5 - y4, 2));
        double side5 = Math.sqrt(Math.pow(x1 - x5, 2) + Math.pow(y1 - y5, 2));
        return side1 + side2 + side3 + side4 + side5;
    }

    @Override
    public float area() {
        // 펜타곤을 5개의 삼각형으로 나누어 각 삼각형의 넓이를 계산하여 합산
        Triangles t1 = new Triangles(x1, y1, x2, y2, x3, y3);
        Triangles t2 = new Triangles(x3, y3, x4, y4, x5, y5);
        Triangles t3 = new Triangles(x5, y5, x1, y1, x2, y2);
        Triangles t4 = new Triangles(x2, y2, x3, y3, x5, y5);
        Triangles t5 = new Triangles(x3, y3, x5, y5, x4, y4);
        
        return t1.area() + t2.area() + t3.area() + t4.area() + t5.area();
    }

    @Override
    public String toString() {
        return "Pentagon: (" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + "), (" + x3 + ", " + y3 + "), "
        		+ "(" + x4 + ", " + y4 + "), (" + x5 + ", " + y5 + ")";
    }
}