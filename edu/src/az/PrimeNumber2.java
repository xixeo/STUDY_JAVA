package az;

import java.util.Scanner;

public class PrimeNumber2 {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			while(true) {
				System.out.print("Number[0:exit] : ");
				int num = sc.nextInt();
				if (num == 0) break;

				int s = (int)Math.pow(10.0, (double)(num-1));
				int e = (int)Math.pow(10.0, (double)(num));
				int count = 0;
				
				//코드 작성
				for(int n = s; n < e; n++) {
					if(PrimeNumber1.isPrime(n)) {
						System.out.println(n + " ");
						count++;
					}
				}
				//				

				System.out.println("Number of Prime : " + count);
			}
		}
		System.out.println("Done");
	}

}
