package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("What you want fool?");
		int n = in.nextInt();
		int[] numbers = new int[n];

		for (int i = 0; i < n; i++) {
			numbers[i] = i + 1;
		}
		for (int i = 0; i < n; i++) {
			if (n == i) {
				System.out.println("They aint no prime numbers");
			}

			else {
				(numbers[i]<n && numbers[i]%/numbers[i-1]!=0)
				System.out.println(numbers[i]);
			}
		}
	}
}