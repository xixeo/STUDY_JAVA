package quiz;

import java.util.Arrays;
import java.util.Random;

/*
 * 정수 배열을 정렬후 출력
 * 실수 배열을 정렬후 출력
 * 스트링 배열을 정렬후 출력하는 코드 완성 
 */

public class Int {
	static <T> void showData(T[] data) {
		for (T obj : data) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}

	//정수형
	static void showData(int[] data) {
		for (int num : data) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	//실수형
	static void showData(double[] data) {
		for (double num : data) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int [] data = new int[20];
		double []doubleData = new double[20];
		String [] stringData = {"apple","grape","blueberry","banana"};

        Random rnd = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = rnd.nextInt(100); // 0부터 99까지의 난수 생성하여 정수 배열에 삽입
            doubleData[i] = rnd.nextDouble() * 100; // 0부터 100까지의 난수 생성하여 실수 배열에 삽입
        }
			Arrays.sort(data);
		showData(data);
		Arrays.sort(doubleData);
		showData(doubleData);
		Arrays.sort(stringData);
		showData(stringData);
		//출력 
	}
}
