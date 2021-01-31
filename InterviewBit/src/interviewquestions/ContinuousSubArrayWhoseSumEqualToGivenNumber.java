package interviewquestions;

public class ContinuousSubArrayWhoseSumEqualToGivenNumber {
	public static void main(String[] args) {
		int[] array = new int[] { 42, 15, 12, 8, 6, 32 };
		int n = 26;
		continuousSubarray(array, n);
	}

	private static void continuousSubarray(int[] array, int n) {
		for (int i = 0; i < array.length; i++) {
			int csum = array[i];
			for (int j = i + 1; j < array.length; j++) {
				csum = csum + array[j];
				if (csum == n) {
					System.out.println("Indices : " + i + " ---- " + j);
				}

			}
		}
	}
}
