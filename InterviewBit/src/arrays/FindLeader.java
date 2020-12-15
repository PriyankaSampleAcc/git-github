package arrays;

public class FindLeader {
	public static void main(String[] args) {
		int[] inputArray = new int[] { 16, 17, 5, 3, 2 };

		for (int i = 0; i < inputArray.length; i++) {
			int j;
			for (j = i + 1; j < inputArray.length; j++) {
				if (inputArray[i] < inputArray[j]) {
					break;
				}
				if (j == inputArray.length) {
					System.out.println(inputArray[i]);
					System.out.println(j + " " + inputArray.length);
				}

			}
		}

	}
}
