package CH14;

@FunctionalInterface
interface Multiply{
//interface Multiply { //이 인터페이스는 functional interface가 아니라고 에러가 뜸
	double getValue();
//	void setValue();
}

public class Test02 {

	public static void main(String[] args) {

		Multiply m;
		m = () -> 3.14 * 2;
		System.out.println(m.getValue());

		m = () -> 10 * 3;
		System.out.println(m.getValue());
		
		m = () -> 5 * 4;
		System.out.println(m.getValue());
	}
}