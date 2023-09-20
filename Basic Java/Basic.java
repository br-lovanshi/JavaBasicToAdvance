package com.dataStructure;

public class Basic {
	
	
//	non static method
	public int sum(int one,int two) throws ArithmeticException {
		
		return one+two;
		
	}
	public static void main(String[] args) {
		
//		variable
		int num = 10;
		String name = "Sample";
		String str = null;
		str = "Sample String";

//		method instance
		Basic mainMethod = new Basic();
		int sumOfTwo = mainMethod.sum(20,3);
//		System.out.println(sumOfTwo);
		
//		loops
		
//		for loops
		for(int i = 0;i<10;i++) {
			System.out.println(i);
		}
		
//		for(int i = 0;true;i++) {
//			System.out.println(i);
//		}
		
//		while
		int count = 5;
		
		while(count>0) {
			System.out.println(count +" is greater then 0.");
			count++;
		}
		
//		do-while
		int j = 10;
		do {
		    System.out.println("Hello world!");
		    j++;
		} while (j < 10);

	
//		switch case
		
		String day = "Monday";
		
		switch(day){
		case "Sunday":
			System.out.println("Holiday!");
			break;
		case "Monday":System.out.println("Working day!");
		break;
		default:System.out.println("Random day!");
		}
		
	}
}
