package CH08;

abstract class Employee {
    String name;
    int salary;

    public abstract void calcSalary();
}

class Salesman extends Employee {
	int annual_sales;
    public void calcSalary() {
        System.out.println("급여 = 기본급 + 기본 수당");
    }

    public String toString() {
        return "Salesman: name=" + name + ", salary=" + salary;
    }
}

class Consultant extends Employee {
	int num_project;
    public void calcSalary() {
        System.out.println("급여 = 기본급 + 컨설팅 특별 수당");
    }

    public String toString() {
        return "Consultant: name=" + name + ", salary=" + salary;
    }
}

class Manager extends Employee {
	int num_team;
    public void calcSalary() {
        System.out.println("급여 = 기본급 + 팀 성과 수당");
    }

    public String toString() {
        return "Manager: name=" + name + ", salary=" + salary;
    }
}

class Director extends Manager {
    public String toString() {
        return "Director: name=" + name + ", salary=" + salary;
    }
}


public class HRSTest2 {
	
	public static void calcTax(Employee e) {
		
		if(e instanceof Salesman) {
			Salesman s =(Salesman) e;
			s.annual_sales = 6500000;
			System.out.println("sa 입니다." + s.annual_sales);
		}else if(e instanceof Manager) {
			Manager m = (Manager) e;
			m.num_team = 5;
			System.out.println("ma 입니다." + m.num_team);
		}else if(e instanceof Consultant) {
			Consultant c = (Consultant) e;
			c.num_project = 35;
			System.out.println("co 입니다." + c.num_project);
		}else {
			System.out.println("Employee 입니다.");
			}
		}

	public static void main(String[] args) {
        Salesman s = new Salesman();
        Consultant c = new Consultant();
        Director d = new Director();

        calcTax(s);
        calcTax(c);
        calcTax(d);

       
    }

}
