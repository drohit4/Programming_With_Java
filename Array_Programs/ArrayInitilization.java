package Array_Programs;

import java.util.Scanner;

public class ArrayInitilization {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the Array : ");
		int size = sc.nextInt();
		
		int array[] = new int[size];
		
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the value at the index-"+i+": ");
			array[i] = sc.nextInt();
		}
		
		System.out.print("The Elements in Array : ");
		for(int ele :array) {
			System.out.print(ele+" ");
		}

	}

}
