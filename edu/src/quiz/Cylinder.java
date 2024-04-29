package quiz;

public class Cylinder {
	
	//원기둥 클래스
	private double radius; //반지름
    private double height; //높이
    
    //초기화 작업 
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    
    //메소드 부피 변환
    public double getVolume() {
    	 double volume = Math.PI * radius * radius * height;
         return volume;
    }
    
    //메소드 겉넓이 변환
    public double getArea() {
    	 double area = 2 * Math.PI * radius * (radius + height);
    	 return area;
    }
    
    //PI * radius * radius * height 원기둥 부피
    //PI * radius * radius * 2 + (2 * PI * radius) * height 원기둥 넓이
    
    //출력
    public static void main(String[] args) {
    	
    	Cylinder cylinder = new Cylinder(50,10); //반지름, 겉넓이 설정
    	System.out.println("원기둥의 부피: " + String.format("%.2f", cylinder.getVolume())); //부피 출력
        System.out.println("원기둥의 겉넓이: " + String.format("%.2f", cylinder.getArea())); //겉넓이 출력
    }

}
