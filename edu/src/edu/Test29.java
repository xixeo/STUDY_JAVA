package edu;

public class Test29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i<10; i++) {
			// i = 0 변수 값 집어넣는 연산자 / i == 0 비교 연산자(참 거짓)
			if((i % 2) == 0) continue;
			System.out.println(i);
		}
	}
}
