package quiz;
/*
 * 객체를 정렬하는 코드 완성 
 * 스트링 배열을 정렬
 * 객체 배열을 정렬 
 */
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
class Student{
	String sname;
	String sno;
		
	public Student(String sno, String sname) {
		this.sname = sname;
		this.sno = sno;
	}
	
	public String toString() {
		return "이름:"+ sname  + ", "+ sno + " 번" ;
	}

}
class SnoComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        // 학번을 기준으로 비교 : string 을 int로 변환
    	int s1num = Integer.parseInt(s1.sno);
    	int s2num = Integer.parseInt(s2.sno);
    	
    	return s1num - s2num; //정수 비교
//        return s1.sno.compareTo(s2.sno); //문자열 비교
    }
}

public class Array {
	static void showData(String msg, Object[]data) {
		System.out.println(msg);
		for(int i = 0; i < data.length; i++) {
			System.out.println(" " + data[i]);
		}
	}
	public static void main(String[] args) {
		String [] stringData = {"apple","grape","blueberry","banana"}; //
		Student [] data = { //객체
				new Student("12", "홍길동"),
				new Student("121", "홍길순"),
				new Student("213", "홍길춘"),
				new Student("9", "홍길홍")
		};
		showData("정렬전", stringData);
		Arrays.sort(stringData);
		showData("정렬후", stringData);
		showData("정렬전", data);
//		Arrays.sort(null, null);
		Arrays.sort(data, new SnoComparator());
		showData("정렬후", data);
	}

}

//https://jinee0717.tistory.com/36
