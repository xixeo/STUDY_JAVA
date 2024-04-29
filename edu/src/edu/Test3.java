package edu;

//69p Test3 문제
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isMarried = true; 
		System.out.println("isMarried = \n " + isMarried);
		
		char gender = 'A';
		System.out.println("\t gender = " + gender);
		
		char c = '\u0057';
		System.out.println("c = " + c);
		
		String greeting = "Hello word";
		System.out.println("greetin = " + greeting);
		
		//double exchangeRate = 1136.50;
		
		//float exchange = 1136.50f; //float 뒤에 float f 선언 해주기
		
		// \n 다음줄 출력, \t
		
		byte age;
		short point;
		int price;
		long totalSale;
		
		age = 23;
		point = 32000;
		price = 350000;
		totalSale = 2147483664L; //long L 선언
		
		System.out.println(age);
		System.out.println(point);
		System.out.println(price);
		System.out.println(totalSale);

	}

}
