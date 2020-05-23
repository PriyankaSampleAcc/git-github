package string;

import java.util.Scanner;

public class PrintStringAfterCharOccuredGivenNoOfTimes {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter any String");
		String testString = sc.nextLine();
		System.out.println("Enter character in string after which "
				+ "you wanna print the string");
		char ch = sc.next().charAt(0);
		System.out.println("Enter after how many no. of occurances of char"
				+ " u wanna print the string");
		int noOfOccurences = sc.nextInt();
		String result = "";
		int n = 3;
		int count = 0;
		for (int i = 0; i < testString.length(); i++) {
			if (testString.charAt(i) == ch) {
				count++;
				if (count == noOfOccurences) {
					result = testString.substring(i, testString.length());
					break;
				}
			}
		}
		System.out.println(result);
	}
}
