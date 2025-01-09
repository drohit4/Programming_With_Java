package Basic_Programs;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int number = sc.nextInt();
		boolean is_prime = true;
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				is_prime = false;
			}
		}
		if (is_prime) {
			System.out.println("Number is prime :" + number);
		} else {
			System.out.println("Number is not prime : " + number);
		}
	}

}
