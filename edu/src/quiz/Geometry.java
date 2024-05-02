package quiz;

abstract class Geometry1 {
	int[] xArr;
	int[] yArr;	

	public abstract double getArea();
	public abstract double getLength();
}

class Triangle extends Geometry1 {

	
	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
	
		super.xArr[0] = x1;
		super.xArr[1] = x2;
		super.xArr[2] = x3;
		super.yArr[0] = y1;
		super.yArr[1] = y2;
		super.yArr[2] = y3;
		
//		this.x1 = x1;
//		this.y1 = y1;
//		this.x2 = x2;
//		this.y2 = y2;
//		this.x3 = x3;
//		this.y3 = y3;
	}

//	public double getArea() {
//		return 0.5f * Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)));
//	}    
//
//	public double getLength() {
//		double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
//		double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
//		double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
//		return side1 + side2 + side3;
//	}
	
	public double getArea() {
		return 0.5f * Math.abs((xArr[0] * (yArr[1] - yArr[2]) + xArr[1] * (yArr[2] - yArr[0]) + xArr[2] * (yArr[0] - yArr[1])));
	}    

	public double getLength() {
		double side1 = Math.sqrt(Math.pow(xArr[1] - xArr[0], 2) + Math.pow(yArr[1] - yArr[0], 2));
		double side2 = Math.sqrt(Math.pow(xArr[2] - xArr[1], 2) + Math.pow(yArr[2] - yArr[1], 2));
		double side3 = Math.sqrt(Math.pow(xArr[0] - xArr[2], 2) + Math.pow(yArr[0] - yArr[2], 2));
		return side1 + side2 + side3;
	}
	
//	public double getArea() {
//        double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
//        double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
//        double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
//        return side1 + side2 + side3;
//    }
//
//	public double getLength() {
//        return 0.5f * Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)));
//    }
}

public class Geometry{
	public static void main(String[] args) {
		Triangle t = new Triangle(4, 7, 1, 1, 8, 5);//
		System.out.println(t.getArea());
		System.out.println(t.getLength());

	}
}