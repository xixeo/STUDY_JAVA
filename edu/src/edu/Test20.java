package edu;

import java.util.Scanner;

public class Test20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//컨트롤 쉬프트 대문자 O < import(임포트)
		Scanner sc = new Scanner(System.in);
		
		//int score = 90;
		
		System.out.print("성적을 입력해주세요 : ");
		int score = sc.nextInt();
		char grade;
		
		if(score >= 90) {
			grade = 'A';
		}
		else if(score >= 80) {
			grade = 'B';
		}
		else if(score >= 70) {
			grade = 'C';
		}
		else if(score >= 60) {
				grade = 'D';
		}
		
		else {
			grade = 'F';
		}
		
		System.out.println("당신의 성적은 "+ grade + " 입니다.");
		sc.close();

	}

}
