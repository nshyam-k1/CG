package lab1;

import java.util.Scanner;

public class TrafficLights {
public static void main(String[] args) {
	int choice;
	@SuppressWarnings( "resource" )
	Scanner scanner = new Scanner(System.in);
	while(true){
	System.out.println("1.Red\t2.Yellow\t3.Green\t4.Exit\nEnter Your Choice: ");
	choice = scanner.nextInt();
	switch(choice) {
	case 1:
		System.out.println("Stop!");
		break;
	case 2:
		System.out.println("Ready!");
		break;
	case 3:
		System.out.println("Go!");
		break;
	case 4:
		System.exit(0);
		break;
	default:
		System.out.println("Invalid Choice");
		break;
	}
}}
}
