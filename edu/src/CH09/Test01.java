package CH09;

public class Test01 {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = new Object();

		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		
		Class c = obj1.getClass();
		System.out.println(c.getName());
		
		MyObject obj4 = new MyObject(123);
		System.out.println(obj4);
		
		MyObject obj5 = new MyObject(123);
		System.out.println(obj5);
		
		if(obj4.equals(obj5)) {
			System.out.println("동일 객체");
		}
		else {
			System.out.println("다른 객체");
		}
		
		if(obj4 == obj5) {
			System.out.println("동일 객체");
		}
		else {
			System.out.println("다른 객체");
		}
		
	}
//	hashing = 임의의 숫자를 지정하는거	
//	== : 같은 객체냐/
//	equals : 같은 값이냐, 같은 해시코드를 갖고있냐고 묻는 것 but 개발자가 편집가능
}
