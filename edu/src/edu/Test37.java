package edu;

public class Test37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 2024.04.18 대각선 
		
		// 5*5사이즈의 2차원 배열 선언
		int arr[][] = new int[5][5];

		// 배열 초기화 반복문
		for (int i = 0; i < arr.length; i++)
		    for (int j = 0; j < arr.length; j++) {
		        arr[i][j] = (i * arr.length) + (j + 1);
		    }

		// 배열의 대각선 요소도 출력
		for (int i = 0; i < arr.length; i++) {
		    for (int j = 0; j < arr[i].length; j++) {
		        // 대각선 요소 출력
		        if (i >= j) {
		            System.out.printf("%3d ", arr[i][j]);
		        } else {
		            System.out.print("    "); // 대각선 아래에 없는 요소는 공백 출력
		        }
		    }
		    System.out.println(); // 다음 줄로 넘어감
		}
	}

}
