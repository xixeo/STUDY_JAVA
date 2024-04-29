package com.ruby.java.ch06;

//6장 실습 구현 - this 사용 생성자 구현 

class Employee {
	int pid;
	String name;
	int age;
	int eno;
	String dept;
	float salary;
	 public Employee(int pid, String name, int age, int eno, String dept, float salary) {
	     	this.pid = pid;
		 	this.name = name;
	        this.age = age;
	        this.eno = eno;
	        this.dept = dept;
	        this.salary = salary;
	    }
	    
	    //This 생성자 구현
	    public Employee(int pid, String name) {
	    	this(pid, name, 0, 0);
	        
	    }
	    
	    public Employee(int pid, String name, int age, int eno) {
	        this(pid, name, age, eno, null, 0.0f);

	    }
	    

	        
	    //메서드 재정의 
	    @Override
	    public String toString() {
	        return "Employee{" +
	                "pid=" + pid +
	                ", name='" + name + '\'' +
	                ", age=" + age +
	                ", eno=" + eno +
	                ", dept='" + dept + '\'' +
	                ", salary=" + salary +
	                '}';
	    }
	public Employee() {
		
	}


}
public class 실습6장생성자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Employee[]arr = new Employee[5];
	  arr[0] = new Employee();
	  arr[1] = new Employee(3, "Park");
	  arr[2] = new Employee(3, "Park", 30, 2001);
	  arr[3] = new Employee(4, "Choi", 35, 2002, "Engineering", 4000);
	  arr[4] = new Employee(5, "Kang", 22, 1003, "Physics", 4);
		for(Employee p : arr) {
			System.out.println(p.toString());
		}

	}

}
