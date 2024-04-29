package quiz;

import java.util.Random;

public class MatrixCalc {
    
    private int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };
    
    private void generateMatrix() {
        Random random = new Random();

        // 랜덤 값으로 행렬 초기화
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = random.nextInt(10) + 1; // 1부터 10 사이의 랜덤 값
            }
        }
    }

    public void work(boolean flag) {
        if (flag) generateMatrix();

        // 가로 출력 및 가로 합 계산
        System.out.println("출력:");
        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0; // 각 행의 합을 저장할 변수
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]); // 행렬 값 출력
                if (j < matrix[0].length - 1) {
                    System.out.print(" + ");
                }
                rowSum += matrix[i][j]; // 가로 합 계산
            }
            System.out.println(" = " + rowSum); // 가로 합 출력
        }

        // 세로 출력 및 세로 합 계산
        System.out.println("출력:");
        for (int j = 0; j < matrix[0].length; j++) {
            int colSum = 0; // 각 열의 합을 저장할 변수
            System.out.print(" = ");
            for (int i = 0; i < matrix.length; i++) {
                System.out.print(matrix[i][j]);
                colSum += matrix[i][j]; // 세로 합 계산
                if (i < matrix.length - 1) {
                    System.out.print(" + ");
                }
            }
            System.out.println(" = " + colSum); // 세로 합 출력
        }
    }
}