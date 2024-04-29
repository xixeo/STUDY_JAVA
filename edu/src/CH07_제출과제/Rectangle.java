package CH07_제출과제;

class Rectangle implements Shape {
    private int x1, y1, x2, y2;

    public Rectangle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    //사각형 둘레 공식
    @Override
    public double perimeter() {
        return 2 * (Math.abs(x2 - x1) + Math.abs(y2 - y1));
    }
    
  //사각형 면적 공식
    @Override
    public float area() {
        return Math.abs((x2 - x1) * (y2 - y1));
    }
}
