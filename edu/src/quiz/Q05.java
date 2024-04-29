package quiz;

import java.util.Random;

public class Q05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rnd = new Random();

        // 3x4 크기의 2차원 배열 생성
        int[][] a = new int[3][4];
        int[][] b = new int[3][4];
        int[][] c = new int[3][4];

        // 배열에 랜덤 값 할당 및 덧셈 수행
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j] = getRandomNumber(rnd);
                b[i][j] = getRandomNumber(rnd);
                c[i][j] = a[i][j] + b[i][j]; // a와 b를 더한 결과를 c에 저장
            }
        }

        // 배열 값 출력
        System.out.println("배열 a:");
        printArray(a);
        System.out.println("배열 b:");
        printArray(b);
        System.out.println("배열 c:");
        printArray(c);
    	}

    	// 랜덤한 정수 생성 메서드
    	public static int getRandomNumber(Random rnd) {
        return rnd.nextInt(100);
    	}

    	// 배열 출력 메서드
    	public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }

	}

}
