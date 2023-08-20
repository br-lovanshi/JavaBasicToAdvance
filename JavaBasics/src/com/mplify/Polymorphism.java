package com.mplify;


 class Calculation{
	
	 public int sum(int one , int two) {
		 return one + two;
	 }
	 
	 public int sum(int one, int two, int three) {
		 return one+two+three;
	 }
	 
	 public void sum(float one, int two) {
		 System.out.println(one+two);
	 }
}
 
 interface Animals{
	 void run();
	 default void hello() {
		 System.out.println("hello wolrd");
		 
	 }
	 static int num = 10;
 }
 
 class Dog implements Animals{
	 @Override
	public void run() {
		 System.out.println("Dog is running.");
	 }
 }
public class Polymorphism {

	public static void main(String[] args) {
		
		Calculation calculation = new Calculation();
		int ans = calculation.sum(10, 20);
		System.out.println(ans);
		calculation.sum(3.3f, 5);
		
		Animals dog = new Dog();
		System.out.println(Animals.num);
		dog.hello();
	
	}
}
