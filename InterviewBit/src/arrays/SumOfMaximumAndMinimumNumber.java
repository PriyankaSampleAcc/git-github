package arrays;

public class SumOfMaximumAndMinimumNumber {
	static int[] inputArray = new int[] { -2, 1, -4, 5, 3 };

	public static void main(String[] args) {
		int max = inputArray[0];
		for (int i = 0; i < inputArray.length; i++) {
			if (max < inputArray[i]) {
				max = inputArray[i];
			}
		}
		System.out.println(max);
		int min = inputArray[0];
		for (int i = 0; i < inputArray.length; i++) {
			if (min > inputArray[i]) {
				min = inputArray[i];
			}
		}
		System.out.println(min);
		System.out.println(max + min);
	}
}
