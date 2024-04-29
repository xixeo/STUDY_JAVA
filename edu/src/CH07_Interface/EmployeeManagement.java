package CH07_Interface;

//6장 실습 구현 - this 사용 생성자 구현(2) 
//

public class EmployeeManagement {

    public static void main(String[] args) {
        EmployeeDetails[] arr = new EmployeeDetails[5];
        arr[0] = new EmployeeDetails();
        arr[1] = new EmployeeDetails(3, "Park");
        arr[2] = new EmployeeDetails(3, "Park", 30, 2001);
        arr[3] = new EmployeeDetails(4, "Choi", 35, 2002, "Engineering", 4000);
        arr[4] = new EmployeeDetails(5, "Kang", 22, 1003, "Physics", 4);
        for (EmployeeDetails p : arr) {
            if (p != null)
                System.out.println(p.toString());
        }
    }
}