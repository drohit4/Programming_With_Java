package Basic_Programs;

import java.util.Scanner;

public class PrimeNumberInRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start number : ");
		int start = sc.nextInt();

		System.out.println("Enter the End number : ");
		int end = sc.nextInt();

		System.out.println("Prime number from "+start+" and end "+end);
		
		for (int i = start; i <= end; i++) {
			boolean is_prime = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					is_prime = false;
					break;
				}
			}
			if (is_prime) {
				System.out.print(i + " ");
			}
		}

	}

}
