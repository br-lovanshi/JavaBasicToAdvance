package com.mplify;

public class Exceptions {

	public static void main(String[] args) {
		
		int num = 100;
		int division = 0;
		try {
//			 division = num/0;
			String s = null;
			int length = s.length();
		}catch( ArithmeticException e) {
			System.out.println(e);
		}catch(NullPointerException np) {
			System.out.println(np);
		}
		
		System.out.println(division);
		
		ThrowExcepitons throwExcepitons = new ThrowExcepitons();
		try {
			throwExcepitons.isEligble(13);
		} catch (CustomExceptions e) {
			// TODO Auto-generated catch block
			
			System.out.println(e.getMessage());
		}
	}
}

class CustomExceptions extends Exception{
	public CustomExceptions() {
		// TODO Auto-generated constructor stub
	}
	public CustomExceptions(String msg) {
		super(msg);
	}
}
class ThrowExcepitons{
	
	public void isEligble(int age) throws CustomExceptions {
		if(age<18) {
			throw new CustomExceptions("YOu are not eligble for vote.");
		}
	}
}