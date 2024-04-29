package edu;

import java.util.Scanner;

public class Test21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
//		int a = 12;
//		int b = 2;
//		char op = '+';
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 점수 : ");
		int a = sc.nextInt(); //정수값 받아 변수 A에 저장
		System.out.print("두번째 점수 : ");
		int b = sc.nextInt(); //정수값 받아 변수 B에 저장
		
		
		System.out.print("op : ");
		String ops = sc.next(); //문자열 입력 받아서 문자열 변수 저장
		char op = ops.charAt(0); //OPS에 저장된 첫번째 문자 OPS 저장
		
		
		
		switch(op) { // 저장된 값 실행
		case '+':
			System.out.println(a+b); break;
		case '-':
			System.out.println(a-b); break;
		case '*':
			System.out.println(a*b); break;
		case '/':
			System.out.println(a/b); break;
			
			
		}

	}

}
