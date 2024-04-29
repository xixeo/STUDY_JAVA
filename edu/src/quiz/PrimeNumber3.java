package quiz;

import java.util.Scanner;

//소수 찾기(2)
//임의의 수를 입력 받아서 이진수로 변환해서 출력해 봅시다.

public class PrimeNumber3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 자릿수: ");
        int num = sc.nextInt();
        int start = (int) Math.pow(10, num - 1); 
        //10의 거듭제곱, num - 1 번만큼 거듭제곱한 값.
        int end = (int) Math.pow(10, num) - 1;
        //10의 거듭제곱, num 번만큼 거듭제곱한 값. 
        //1-, start > 1 
        
        System.out.println(num + "자릿수 소수 패턴:");
        //start부터 end까지(포함) 반복하는 for 루프
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                printPrimePattern(i);
            }
        }
    }
    // 주어진 숫자가 소수인지 판별하는 메서드
    // 소수 판별 코드 참고 https://st-lab.tistory.com/81
    //isPrime 함수는 정수 n을 매개변수로 받음
    public static boolean isPrime(int n) {
        //n이 1보다 작거나 같은지 확인
    	if (n <= 1) {
    		//만약 n이 1보다 작거나 같으면, 소수가 아니므로 false를 반환
            return false;
        }
    	//현재 숫자 i로 n을 나누어 나머지를 확인
    	//만약 나머지가 0이라면, 즉, n이 i로 나누어 떨어진다면 n은 소수가 아니므로 false를 반환
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    // 소수의 패턴을 출력하는 메서드
    public static void printPrimePattern(int n) {
    	String str = String.valueOf(n); //n을 스트링으로 변환
        System.out.print(n + " ➔ ");
        //문자열 str의 시작부터 현재 인덱스[] i까지의 부분 문자열 가져옴
        for (int i = 0; i < str.length(); i++) {
            int subNum = Integer.parseInt(str.substring(0, i + 1)); 
            //Integer.parseInt 부분 문자열을 정수로 변환
            //isPrime(subNum) 함수를 사용하여 subNum이 소수인지 확인.
            //만약 subNum이 소수이면, 해당 소수를 출력.
            if (isPrime(subNum)) {
                System.out.print(subNum);
                if (i != str.length() - 1) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println(" 모두 소수");
    }
}
