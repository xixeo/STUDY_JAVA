package edu;

public class Test34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a = new int[5];
		a = new int[10];
		int[] score = {90,80,40,50};
		
		System.out.println("배열길이 = "+ score.length);
		
		//4개 배열 설정했지만 5로 출력하려고 할 경우 오류가 발생함.
		for (int i =0; i<score.length; i++) {
			System.out.println(score[i]);
		}
		String[] names = {"김두환","홍길동","김하늘", "오정임"};

	}

}

