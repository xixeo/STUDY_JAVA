package quiz;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
	// 두 수의 곱 & 몫과 나머지
	Scanner sc = new Scanner(System.in);
	System.out.print("첫번째 값 : ");
	int a = sc.nextInt(); 
	System.out.print("두번째 값 : ");
	int b = sc.nextInt(); 
	
	// 두 수를 입력 받아서 곱을 출력
	System.out.println("곱 : "+ a*b);
	System.out.println("몫 : "+ a/b);
	System.out.println("나머지 : "+ a%b);
	
	//if( number % 2 == 0) 나머지 값
	
	
		
	//앞의 수를 뒤의 수로 나누어서 몫과 나머지 출력

	}

}
