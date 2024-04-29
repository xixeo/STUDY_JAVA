package CH07_Interface;

//6장 실습 구현 - this 사용 생성자 구현(1) 
public class EmployeeDetails {
    int pid;
    String name;
    int age;
    int eno;
    String dept;
    float salary;

    public EmployeeDetails() {

    }
    
    //+추가
    public EmployeeDetails(String name, int age, int eno, String dept, float salary) {
        this.name = name;
        this.age = age;
        this.eno = eno;
        this.dept = dept;
        this.salary = salary;
    }
    
    //This 생성자 구현
    public EmployeeDetails(int pid, String name) {
        this.pid = pid;
        this.name = name;
    }
    
    public EmployeeDetails(int pid, String name, int age, int eno) {
        this(pid, name);
        this.age = age;
        this.eno = eno;
    }
    
    public EmployeeDetails(int pid, String name, int age, int eno, String dept, float salary) {
        this(pid, name, age, eno);
        this.dept = dept;
        this.salary = salary;
    }
        
    //메서드 재정의 
    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", eno=" + eno +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}
