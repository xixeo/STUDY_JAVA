package CH08;

//abstract class Employee {
//    String name;
//    int salary;
//
//    public abstract void calcSalary();
//}
//
//class Salesman extends Employee {
//    public void calcSalary() {
//        System.out.println("급여 = 기본급 + 기본 수당");
//    }
//
//    public String toString() {
//        return "Salesman: name=" + name + ", salary=" + salary;
//    }
//}
//
//class Consultant extends Employee {
//    public void calcSalary() {
//        System.out.println("급여 = 기본급 + 컨설팅 특별 수당");
//    }
//
//    public String toString() {
//        return "Consultant: name=" + name + ", salary=" + salary;
//    }
//}
//
//class Manager extends Employee {
//    public void calcSalary() {
//        System.out.println("급여 = 기본급 + 팀 성과 수당");
//    }
//
//    public String toString() {
//        return "Manager: name=" + name + ", salary=" + salary;
//    }
//}
//
//class Director extends Manager {
//    public String toString() {
//        return "Director: name=" + name + ", salary=" + salary;
//    }
//}
//
//public class HRSTest {
//    public static void calcTax(Employee e) {
//        System.out.println("소독세를 계산합니다.");
//    }
//    
//    public static void main(String[] args) {
//    	Salesman s1 = new Salesman();
//    	Employee s2 = new Salesman();
//    	Object s3 = new Salesman();
//    	
//    	Object m1 = new Manager();
//    	Employee m2 = new Manager();
//    	Manager m3 = new Manager();
//    	//Director m4 = new Manager(); 오류 발생
//    	
//    	Object arr[] = new Object[6];
//    	arr[1] = s1;
//    	arr[2] = s2;
//    	arr[3] = s3;
//    	arr[4] = m1;
//    	arr[5] = m2;
//    	arr[6] = m3;
//    	
//    	for(int i=0; i < arr.length; i++) {
//    		System.out.println(arr[i]);
//    	}
//    	
//    }
//
//    public static void main(String[] args) {
//        Salesman s = new Salesman();
//        Consultant c = new Consultant();
//        Director d = new Director();
//
//        calcTax(s);
//        calcTax(c);
//        calcTax(d);
//
//        System.out.println(s);
//        System.out.println(c);
//        System.out.println(d);
//        
//        Salesman s2 = s;
//        System.out.println(s2.toString());
//
//        if (s.equals(s2)) {
//            System.out.println("동일한 객체 입니다.");
//        } else {
//            System.out.println("서로 다른 객체 입니다.");
//        }
//    }
//}
