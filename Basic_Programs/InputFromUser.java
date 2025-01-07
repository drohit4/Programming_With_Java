package Basic_Programs;

import java.util.Scanner;
public class InputFromUser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name : ");
		String str = sc.next();
		System.out.print(str);
		
		System.out.println("\nEnter your age");
		int age = sc.nextInt();
		
		System.out.println("Your age is : "+age);
	}
}
