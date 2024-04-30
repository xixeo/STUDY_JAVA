package quiz;

// 추상클래스 인스턴스 배열
abstract class Drink {
	public abstract void drink();
}

class Juice extends Drink{
	public void drink() {
		System.out.println("주스를 마십니다.");

	}
}

class Coffee extends Drink{
	public void drink() {
		System.out.println("커피를 마십니다.");

	}
}

class Beer extends Drink{
	public void drink() {
		System.out.println("맥주를 마십니다.");

	}
}

class Water extends Drink{
	public void drink() {
		System.out.println("물을 마십니다.");

	}
}

class Tea extends Drink{
	public void drink() {
		System.out.println("차를 마십니다.");

	}
}

public class Drinks{
	public static void main(String[] args) {
		Juice j = new Juice();
		Coffee c = new Coffee();
		Beer b = new Beer();
		Water w = new Water();
		Tea t = new Tea();
		
		Drink[] drinks = {j, c, b, w, t};
		
		for(Drink i : drinks) {
			i.drink();
		}
	}
}