package edu;

public class Test36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2024.04.18
		
		 //5*5사이즈의 2차원 배열 선언
		  int arr[][] = new int[5][5];
		  
	        // 배열 초기화 반복문
	        for (int i = 0; i < arr.length; i++)
	            for (int j = 0; j < arr.length; j++) {
	                arr[i][j] = (i * arr.length) + (j + 1);
	            }

	        // 배열 출력
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = 0; j < arr[i].length; j++) {
	                // 2자리수를 맞추기 위해 공백 추가
	                System.out.printf("%3d ", arr[i][j]);
	            }
	            System.out.println("\n"); // 다음 줄로 넘어감
	     }
	}

}
