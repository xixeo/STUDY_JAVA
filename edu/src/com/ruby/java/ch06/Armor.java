package com.ruby.java.ch06;

public class Armor {
	
	static class Student {
		private String sname;
		private int age;
	}
	
	private String name;
	private int height;
	
	public String getName() {
		return name;
	}
	
	public void setName(String value) {
		name = value;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Armor a= new Armor();
		Armor a[] = new Armor[10]; //배열 10개 생성
		//a.name = "kim"; //접근 못한다.
		//a.age = 10;
		//a.getName();
		//System.out.println(a.getName());
		//Student s = new Student();
		//s.sname = "hong";

	}

}
