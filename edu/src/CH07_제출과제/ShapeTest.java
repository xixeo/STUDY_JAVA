package CH07_제출과제;

//인터페이스 작성 연습
public class ShapeTest {
    public static void main(String[] args) {
        Shape t = new Triangle(1, 2, 3, 4, 5, 6);
        Shape r = new Rectangle(1, 2, 3, 4);
        Shape s = new Square(1, 2, 3);
        
        System.out.println("삼각형 둘레 길이 = " + t.perimeter());
        System.out.println("삼각형 면적 = " + t.area());
        System.out.println("사각형 둘레 길이 = " + r.perimeter());
        System.out.println("사각형 면적 = " + r.area());
    }
}