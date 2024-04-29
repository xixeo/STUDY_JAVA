package quiz;

import java.util.Scanner;

//소수 판단
//임의의 수 N을 입력 받아서 해당 수가 소수인지 확인하는 프로그램을 작성해 보세요.

public class PrimeNumber1 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Number[0:exit]: ");
            int num = sc.nextInt();
            if (num == 0) break; // 0 입력시 멈춤
            if (isPrime(num))
                System.out.println(num + " is a Prime.");
            	//num이 소수라면 isPrime(num) 함수가 참 반환
            else
                System.out.println(num + " is not a Prime.");
            	//아니라면
        }
        sc.close();
        System.out.println("Done!");
        //끝났을 경우, 0 입력시 출력
    }

    // num이 소수면 true, 그렇지 않으면 false를 리턴
    public static boolean isPrime(int num) {
    	//코드 작성
        // 1 이하의 숫자는 소수가 아님
        if (num <= 1)
            return false;
        // 2부터 시작하여 num의 제곱근까지 모든 수로 나누어 보면서 
        // 나누어지는 수가 있는지 확인 ↓↓↓ 
        //참고 코드 https://songsunkite.tistory.com/130
        for (int i = 2; i <= Math.sqrt(num); i++) { //Math.sqrt 제곱근 구할때 사용
            if (num % i == 0)
                return false; // 나누어 떨어지면 소수가 아님
        }
        return true; // 나누어 떨어지지 않으면 소수임
    }
}
