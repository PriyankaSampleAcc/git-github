package string;

import java.util.Scanner;

public class ReverseGivenString {
	private static Scanner sc;

	public static void main(String[] args) {
		System.out.println("Enter any string to reverse");
		sc = new Scanner(System.in);
		String stringToBeReversed = sc.nextLine();
		StringBuffer sb = new StringBuffer(stringToBeReversed);
		sb.reverse();
		System.out.println("Reversed String is :" + sb);
	}
}
