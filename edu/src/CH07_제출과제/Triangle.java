package CH07_제출과제;

class Triangle implements Shape {
    private int x1, y1, x2, y2, x3, y3;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }
    
    // 삼각형 둘레 계산
    // 참고 https://stackoverflow.com/questions/54350941/distance-between-2-locations-method
    @Override
    public double perimeter() { 
        double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        return side1 + side2 + side3;
    }
    
    // 헤론의 공식도 있음 return 0.5f * Math.abs((x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2)));
    // 삼각형 면적 계산
    // 참고 https://www.prepbytes.com/blog/c-programming/area-of-triangle-program-in-c/
    @Override
    public float area() {
        // 세 점 사이의 거리를 이용하여 높이를 계산
        double height = 2 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) /
                Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        // 밑변의 길이를 한 변의 길이로 설정하여 면적 계산
        double base = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return (float) (0.5 * base * height);
    }
}