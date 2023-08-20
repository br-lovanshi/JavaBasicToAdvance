package oops;

public class Student {

	private String name;
	private int age;
	
	Student(String name,int age){
		this.name = name;
		this.age = age;
	}
	public void greeting() {
		System.out.println("Hello " + this.name);
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
}
