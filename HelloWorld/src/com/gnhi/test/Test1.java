package com.gnhi.test;

public class Test1 {

	public static void main(String[] args) {
		String name1 = "김홍인";
		String name2 = "김홍인";
		String name3 = new String("김홍인");
		String name4 = new String("김홍인");
		
		System.out.println(name1 == name2);
		System.out.println(name1 == name3);
		System.out.println(name4 == name3);
		System.out.println(name1.equals(name3));
		
		
	}

}
