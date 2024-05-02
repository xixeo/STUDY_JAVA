package az;

import java.util.Scanner;

public class PrimeNumber1 {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			while(true) {
				System.out.print("Number[0:exit] : ");
				int num = sc.nextInt();
				if (num == 0) break;

				if(isPrime(num) == true) System.out.println(num + " 은 소수입니다.");
				else System.out.println(num + " 은 소수가 아닙니다.");
			}
		}
		System.out.println("Done");

		System.out.println(isPrimeAll(7330));
	}

	public static boolean isPrime(int n) {
		if (n == 1) return false;
		if (n == 2 || n == 3) return true;

		for(int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) return false;
		}
		return true;
	}

	public static boolean isPrimeAll(int n) {

		int i = 1;
		//String s = "" + n;
		String s = String.valueOf(n);

		while(true) {

			if(!isPrime(Integer.parseInt(s.substring(0, i++))))
				return false;
			if (s.length() < i)
				break;
		}		
		return true;
	}
}