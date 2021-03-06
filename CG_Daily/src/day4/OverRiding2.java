package day4;

class Bank{
	void rateofInterest() {
		System.out.println("1%");
	}
	static void disp() {
		System.out.println("Bank Class");
	}
}
class Sbi extends Bank{
	void rateofInterest() {
		System.out.println("5%");
	}
	static void disp() {
		System.out.println("Sbi Class");
	}
}
class Axis extends Bank{
	void rateofInterest() {
		System.out.println("10%");
	}
}
public class OverRiding2 {
	public static void main(String[] args) {
		Bank bank =  new Sbi();
		bank.rateofInterest();
		bank.disp();
	}
}
