package lab2;

import java.util.Scanner;

public class SecondSmallest {
	static int SecondSmallestNumber(int a[]) {
		int i,j,temp;
		for(i=0;i<a.length-1;i++) {
			for(j=i;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(i=0;i<a.length;i++) {
			if(a[i]!=a[i+1]) {
				return a[i+16];
				}
		}
	return -1;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int array[] = new int[size];
		int i;
		for(i=0;i<size;i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println("Second smallest number is :"+SecondSmallestNumber(array));
		
	}

}
