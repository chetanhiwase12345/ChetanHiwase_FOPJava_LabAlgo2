package com.greatlearning.currencydenomination;
import java.util.Scanner;
public class DriverDenomination {
	public static void countCurrency()
	{
		int noOfCurrencyDenomination, totalAmount;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of currency denominations");
		noOfCurrencyDenomination = sc.nextInt();
		int[] denominationValues = new int[noOfCurrencyDenomination];
		System.out.println("enter the currency denominations value");
		for (int i = 0; i < noOfCurrencyDenomination; i++) {
			denominationValues[i] = sc.nextInt();
		}
		int[] countOfDenomination = new int[noOfCurrencyDenomination]; 
		Sorting b = new Sorting();
		b.bubble_Sort(denominationValues);
		System.out.println("enter the amount you want to pay");
		totalAmount = sc.nextInt();
		for (int i = 0; i < noOfCurrencyDenomination; i++) {
			if (totalAmount >= denominationValues[i]) {
				countOfDenomination[i] = totalAmount / denominationValues[i];
				totalAmount = totalAmount % denominationValues[i];
			}
		}
		System.out.println("Your payment approach in order to give min no of notes will be");
		for (int i = 0; i < noOfCurrencyDenomination; i++) {
			if (countOfDenomination[i] != 0) {
				System.out.println(denominationValues[i] + " : "
						+ countOfDenomination[i]);
			}
		}
	}
	public static void main(String argc[]){
		countCurrency();
	}
}
