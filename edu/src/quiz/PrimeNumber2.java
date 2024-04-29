package quiz;

import java.util.Scanner;

//소수 찾기

//정수의 자릿수를 입력 받아서 해당 자릿수에 속하는 소수를 찾아서 출력하는 프로그램을 작성해 보세요.

public class PrimeNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Number[0:exit]: ");
            int num = sc.nextInt();
            if (num == 0) break;
            int s = (int) Math.pow(10.0, (double) (num - 1)); //정수 변환
            int e = (int) Math.pow(10.0, (double) (num)) - 1; //정수 변환
            
            // 코드 작성
            int count = countPrimesInRange(s, e);
            System.out.println("Number of Prime: " + count);
        }
        System.out.println("Done!");
    }

    // 주어진 범위 내에서 소수 개수를 찾는 메서드
    //https://sujin-dev.tistory.com/335 참고 코드
    public static int countPrimesInRange(int start, int end) {
        int count = 0;
        //isPrime(i)를 호출하여 현재 숫자 i가 소수인지 확인
        //isPrime(i)가 true를 반환하면, 즉, 현재 숫자 i가 소수이면 count를 1 증가
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    // 소수 판별 함수
    // 참고 코드 https://stackoverflow.com/questions/20798391/what-is-wrong-with-my-isprime-method
    public static boolean isPrime(int n) {
    	//isPrime 메소드는 n이 1보다 작거나 같으면 false를 반환하여 1 이하의 숫자는 소수가 아니라고 판단
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
