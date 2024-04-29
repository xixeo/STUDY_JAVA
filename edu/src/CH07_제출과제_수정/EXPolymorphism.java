package CH07_제출과제_수정;

public class EXPolymorphism {
    public static void main(String[] args) {
        Shapes01[] arr = new Shapes01[4];
        arr[0] = new Triangles(1, 2, 3, 4, 5, 6);
        arr[1] = new Rectangles(1, 2, 3, 2, 1, 5, 3, 5);
        arr[2] = new Squares(1, 2, 3, 2, 1, 4, 3, 4, 2);
        arr[3] = new Pentagon(5, 1, 8, 1, 3, 5, 10, 5, 6, 12);
        for (Shapes01 shape : arr) {
            System.out.println(shape.toString());
        }
    }
}
