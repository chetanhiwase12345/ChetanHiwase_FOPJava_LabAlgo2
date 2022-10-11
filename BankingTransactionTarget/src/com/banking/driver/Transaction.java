package com.banking.driver;
import java.util.Scanner;
public class Transaction {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of transaction array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("enter the values of array");
		for (int i = 0; i < size; i++)
			arr[i] = sc.nextInt();
		System.out.println("enter the total no of targets that needs to be achieved");
		int targetNo = sc.nextInt();
		while (targetNo-- != 0) {
			boolean f = false;
			long target;
			System.out.println("enter the value of target");
			target = sc.nextInt();
			long sum = 0;
			for (int i = 0; i < size; i++) {
				sum += arr[i];
				if (sum >= target) {
					System.out.println("Target achieved after "+(i + 1) + " transactions ");
							f = true;
					break;
				}
			}
			if (f == false) {
				System.out.println("Given target is not achieved ");
			}
		}
	}
}
