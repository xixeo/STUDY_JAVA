package quiz;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("성함을 입력해주세요 : ");
		int a = sc.nextInt(); 
		System.out.print("생년월일을 입력해주세요 : ");
		int b = sc.nextInt(); 
		System.out.print("키을 입력해주세요 : ");
		int c = sc.nextInt();
		System.out.print("체중을 입력해주세요 : ");
		int d = sc.nextInt();
		System.out.print("직업을 입력해주세요 : ");
		int e = sc.nextInt();
		
		// 값 출력
		System.out.println("이름 : "+ a);
		System.out.println("생년월일 : "+ b);
		System.out.println("키 : "+ c + "cm");
		System.out.println("체중 : "+ d + "kg");
		System.out.println("직업 : "+ e);

	}

}
