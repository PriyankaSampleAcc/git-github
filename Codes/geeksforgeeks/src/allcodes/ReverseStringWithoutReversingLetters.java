
package allcodes;

import java.util.Scanner;

public class ReverseStringWithoutReversingLetters {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter any string separated by dot(.)");
		String testString = sc.nextLine();
		String[] array = testString.split(" ");
		String ans = "";
		for (int i = array.length - 1; i >= 0; i--) {
			ans = ans + array[i] + " ";
		}
		System.out.println(ans);
	}
}