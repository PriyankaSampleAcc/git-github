package strings;

import java.util.HashMap;

public class CountNumberOfWordsInStringUsingHashmap {
	public static void main(String[] args) {
		String s = "Let's consider this as as a string string string";
		String[] a = s.split(" ");
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		for (int i = 0; i < a.length; i++) {
			if (hm.containsKey(a[i])) {
				int count = hm.get(a[i]);
				hm.put(a[i], count + 1);
			} else {
				hm.put(a[i], 1);
			}
		}
		System.out.println(hm);
	}
}
