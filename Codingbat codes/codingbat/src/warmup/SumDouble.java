package warmup;

import java.util.Scanner;

public class SumDouble {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two numbers");
		int firstNum = sc.nextInt();
		int secondNum = sc.nextInt();
		int result = sumDouble(firstNum, secondNum);
		System.out.println(result);
	}

	public static int sumDouble(int firstNum, int secondNum) {
		int result = firstNum + secondNum;
		if (firstNum == secondNum) {
			return 2 * result;
		} else
			return result;
	}
}
