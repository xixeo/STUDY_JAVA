package CH07_Interface;

//7장 실습 구현 

abstract class Person {
    int pid;
    String name;
    int age;

    //This 생성자 구현
    public Person(int pid, String name, int age) {
        this.pid = pid;
        this.name = name;
        this.age = age;
    }

    //추상 메서드
    public abstract String toString();
}

class Student extends Person {
    int sid;
    String dept;
    int year;

    //This 생성자 구현
    public Student(int pid, String name, int age, int sid, String dept, int year) {
        super(pid, name, age);
        this.sid = sid;
        this.dept = dept;
        this.year = year;
    }

    // toString 메서드 오버라이드
    @Override
    public String toString() {
        return "학번: " + sid + ", 이름: " + name + ", 나이: " + age + ", 학과: " + dept + ", 학년: " + year;
    }
}

class Employee extends Person {
    int eno;
    String dept;
    int salary;

  //This 생성자 구현
    public Employee(int pid, String name, int age, int eno, String dept, int salary) {
        super(pid, name, age);
        this.eno = eno;
        this.dept = dept;
        this.salary = salary;
    }

    // toString 메서드 오버라이드
    @Override
    public String toString() {
        return "사번: " + eno + ", 이름: " + name + ", 나이: " + age + ", 부서: " + dept + ", 급여: " + salary;
    }
}

public class ClassEX {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Person arr[] = new Person[5];
        arr[0] = new Student(1, "김", 20, 1001, "컴퓨터 공학", 3);
        arr[1] = new Student(2, "이", 21, 1002, "수학", 2);
        arr[2] = new Employee(3, "박", 30, 2001, "인사", 3000);
        arr[3] = new Employee(4, "최", 35, 2002, "엔지니어링", 4000);
        arr[4] = new Student(5, "강", 22, 1003, "물리학", 4);
        for (Person p : arr) {
            System.out.println(p.toString());
        }

    }

}