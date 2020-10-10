package warmup;

import java.util.Scanner;

public class Difference21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number we are gonna compare it to 21");
		int n = sc.nextInt();
		int result = diff21(n);
		System.out.println(result);
	}

	public static int diff21(int n) {
		int result = 0;
		if (n >= 21) {
			result = n - 21;
			return result;
		} else {
			result = 21 - n;
			return result;
		}
	}
}
