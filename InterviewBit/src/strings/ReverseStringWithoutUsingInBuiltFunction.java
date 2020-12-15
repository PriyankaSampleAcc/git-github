package strings;

public class ReverseStringWithoutUsingInBuiltFunction {

	static String tempString = "JavaIsEasy";

	public static void main(String[] args) {
		for (int i = tempString.length() - 1; i >= 0; i--) {
			System.out.print(tempString.charAt(i));
		}
	}
}
