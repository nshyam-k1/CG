package lab1;

import java.util.Scanner;

public class Fibonacci {
	static int fib(int a) {
		int c = 2;
		int temp;
		int curr = 1;
		int prev = 1;
		if(a==1 || a==2) {return 1;}
		while(c!=a)
		{	
			temp = curr;
			curr = curr + prev;
			prev = temp;
			c=c+1;
		}
		return curr;
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(fib(n));
	}
}
