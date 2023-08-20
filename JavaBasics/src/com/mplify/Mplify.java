package com.mplify;

public class Mplify {

	public static void main(String[] args) {

		System.out.println("Hello world.");
		
		int num = 10;
		String str = "20";
		
		System.out.println(Integer.parseInt(str));// int to str
		System.out.println(Integer.toString(num));// str to int
		
		int i = 1;
		do {
			System.out.println("DO while " + i);
			i++;
		}while(i<=10);
		
		for( i = 0;i<=10;i++) {
			System.out.println(" FOr Lood" + i);
		}
		i = 0;
		 while (10>=i) {
			System.out.println("Wihle Loop" + i++);
			
		}
		 
		 String number = null;
		 String str2 = number;
		 System.out.println(str2);
	}
}
