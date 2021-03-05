package lab1;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int number,flag,i,j;
		number = scanner.nextInt();
		for(i =2;i<=number;i++) {
			flag = 0;
			for(j=2;j<(i/2+1);j++) {
				if(i%j==0) {flag=1;break;}
			}
			if(flag == 0) {
				System.out.print(i+" ");
			}
		}
}

}
