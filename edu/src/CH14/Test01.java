package CH14;

interface MyInterface2 {
	public void print();
}

class MyClass1 implements MyInterface {
	@Override
	public void print() {
		System.out.println("MyClass1의 객체");
	}
}

class MyClass2 implements MyInterface {
	@Override
	public void print() {
		System.out.println("MyClass2");
	}
}

public class Test01 {
	//방법 4 : 함수 매개변수로 익명클래스 사용
	public static void test(MyInterface mi) { //함수 매개변수
		mi.print();
	}

	public static MyInterface test2() {
		MyInterface mi = new MyInterface() {
			@Override
			public void print() {
				System.out.println("test2()메서드에서 반환된 MyInterface");
			}
		};
		return mi;
	}

	public static void main(String[] args) {

		MyClass1 mc1 = new MyClass1();
		MyClass2 mc2 = new MyClass2();
		mc1.print(); // MyClass1
		mc2.print(); // MyClass2

		//방법2 : 익명 클래스로 구현
		MyInterface mi = new MyInterface() {
			@Override
			public void print() {
				System.out.println("익명 클래스로 구현");
			}
		};
		test(mc1); // MyClass1
		test(mi); // 익명 클래스로 구현

		mi.print(); // 익명 클래스로 구현

		//방법3 : 익명 클래스 선언, 익명 객체 생성, method 호출 : (익명객체).print(); : 클래스 이름, 변수 생략
		(new MyInterface() {
			@Override
			public void print() {
				System.out.println("선언, 생성, 호출을 한번에 처리");
			}
		}).print(); // 선언, 생성, 호출을 한번에 처리

		//방법4 : 매개변수
		test(mc1);
		test(mi);
		
		//방법5 : 리턴타입
		MyInterface mi2 = test2();		
		mi2.print(); // test2() 메서드에서 반환된 MyInterface
		// 일반 인터페이스 구현
	}
}