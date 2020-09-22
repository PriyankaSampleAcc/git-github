package warmupcodingbat;
/*
 * problem statement :
 *   The parameter weekday is true if it is a weekday,
 *   and the parameter vacation is true if we are on vacation.
 *   We sleep in if it is not a weekday or we're on vacation. 
 *   Return true if we sleep in.
 */

public class SleepIn {
	public static boolean sleepIn(boolean weekday, boolean vacation) {
		if (!weekday || vacation) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// check with example
		boolean result = sleepIn(true, false);
		System.out.println(result);
	}
}
