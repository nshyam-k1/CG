package day4;

class Person{
	void disp() {
		System.out.println("Display in person class");
	}
	void disp2() {
		System.out.println("Display2 in person class");
	}
	}
class Employee extends Person{
	void disp() {
		System.out.println("Display in employee class");
	}
	void run() {
		System.out.println("Running in employee class");
	}
}
public class Upcasting2 {
	public static void main(String[] args) {
		Person person = new Employee();
		person.disp();
		person.disp2();
		//person.run(); Can't run cause we can't access not overridden methods.
	}

}
