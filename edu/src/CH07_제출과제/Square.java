package CH07_제출과제;

//Square 클래스의 인스턴스를 초기화
class Square extends Rectangle {
    public Square(int x1, int y1, int side) {
        super(x1, y1, x1 + side, y1 + side);
    }
}