package com.ruby.java.test1;

public class Test02 {

	public static void test(String name, int ...v) {
		// TODO Auto-generated method stub
		System.out.print(name + " : ");
		for(int x: v)
			System.out.print(x + " ");
		System.out.println();

	}
	
	public static void main(String[] args) {
		test("오정임", 98, 85, 88);
		test("오정태", 108, 75, 68);
		test("김정임", 48, 95, 188);
		
	}

}
