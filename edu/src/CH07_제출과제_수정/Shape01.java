package CH07_제출과제_수정;

public class Shape01 {
    public static void main(String[] args) {
        Shapes01 t = new Triangles(1, 2, 3, 4, 5, 6);
        Shapes01 r = new Rectangles(1, 2, 3, 2, 1, 5, 3, 5);
        Shapes01 s = new Squares(1, 2, 3, 2, 1, 5, 3, 5, 3);

        System.out.println("삼각형 둘레 길이 = " + t.perimeter());
        System.out.println("삼각형 면적 = " + t.area());
        System.out.println("사각형 둘레 길이 = " + r.perimeter());
        System.out.println("사각형 면적 = " + r.area());
    }
}
