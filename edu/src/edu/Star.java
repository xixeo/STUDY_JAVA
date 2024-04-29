package edu;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		int n2 = (2*n)-1;
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n2; j++) {
				if(j < i || j >= n2 - i) {
					System.out.print("");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		} 
		a.close();

	}

}
