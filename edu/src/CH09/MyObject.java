package CH09;

public class MyObject {

	int num;

	MyObject(int num){
		this.num = num;
	}

	public String toString() {

		return "MyObject";

	}

	public boolean equals(Object obj) {
		boolean result = false;
		MyObject arg = (MyObject) obj;

		if(this.num == arg.num) {
			result = true;
		}
		return result;
	}
}
