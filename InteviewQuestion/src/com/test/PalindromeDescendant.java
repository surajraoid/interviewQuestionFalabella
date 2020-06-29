package com.test;


public class PalindromeDescendant {

	public static void main(String[] args) {
		boolean palindromeDescendant = palindromeDescendant(122213);
		System.out.println(palindromeDescendant);
	}

	public static boolean palindromeDescendant(int number) {
		if (number > 9) {
			int sum = 0;
			int temp = number;
			while (number > 0) {
				int rem = number % 10;
				sum = (sum * 10) + rem;
				number = number / 10;
			}
			if (temp == sum) {
				return true;
			} else {
				return palindromeDescendant(getSum(temp));
			}
		}
		return false;
	}

	private static int getSum(int number) {
		int sum = 0;
		while (number > 0) {
			int rem = number % 100;
			sum = (rem % 10) + (rem / 10) + (sum * 10);
			number = number / 100;
		}
		return sum;
	}
}
