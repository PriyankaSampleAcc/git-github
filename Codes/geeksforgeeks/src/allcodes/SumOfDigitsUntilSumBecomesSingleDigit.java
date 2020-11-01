package allcodes;

public class SumOfDigitsUntilSumBecomesSingleDigit {
	public static void main(String[] args) {
		int a = 1234;
		int digitSum = 0;
		digitSum = getSum(a);
		if (digitSum <= 9 && digitSum > 0)
			System.out.println(digitSum);
		else
			digitSum = getSum(digitSum);
		System.out.println(digitSum);
	}

	private static int getSum(int a) {
		int reminder = 0;
		int sum = 0;
		while (a > 0) {
			reminder = a % 10;
			sum = sum + reminder;
			a = a / 10;
		}
		return sum;
	}
}