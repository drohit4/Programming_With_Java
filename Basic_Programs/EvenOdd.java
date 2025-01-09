package Basic_Programs;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number : ");
		int number = sc.nextInt();

		if (number % 2 == 0) {
			System.out.println("Number is Even :" + number);
		} else {
			System.out.println("Number is Odd :" + number);
		}
	}

}
