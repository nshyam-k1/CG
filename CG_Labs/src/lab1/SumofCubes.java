package lab1;

import java.util.Scanner;

public class SumofCubes {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
	String number = scanner.next();
	int result = 0;
	for(int i =0;i<number.length();i++) {
		result = (int) (result + Math.pow(Character.getNumericValue(number.charAt(i)),3));
	}
	System.out.println(result);
}
}
