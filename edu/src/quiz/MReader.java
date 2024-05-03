package quiz;

import java.io.BufferedReader;
import java.io.FileReader;

public class MReader {
	public static void main(String[] args) {

		// 파일 읽기
		try (BufferedReader reader = new BufferedReader(new FileReader("m.txt"))) {
			
			String str;
			
			while ((str = reader.readLine()) != null) { //파일에서 한 줄씩 읽기
		
				String[] numbersStr = str.split(" "); //문자열 str을 기준으로 분할 후 잘려진 각 숫자들을 문자열로 numbersStr에 저장.
				
				for (String a : numbersStr) { //for문을 사용, numberStr 배열의 각 요소를 하나씩 가져옴.
					int num = Integer.parseInt(a);  //문자열 형태의 숫자 numStr을 정수형 변환, num 변수에 저장
//					System.out.print(num); 
					System.out.print(num + " "); // 정수를 출력, 공백 출력
				}
				
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace(); 
		}
	}

}
