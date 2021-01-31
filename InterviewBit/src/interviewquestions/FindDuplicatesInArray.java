package interviewquestions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class FindDuplicatesInArray {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		String[] strArray = { "Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC" };
		for (int i = 0; i < strArray.length; i++) {
			for (int j = i + 1; j < strArray.length; j++) {
				if (strArray[i].equals((strArray)[j])) {
					hm.put(i, strArray[i]);
				}
			}
		}
//		System.out.println(hm);
		Collection<String> coll = hm.values();
		ArrayList<String> al = new ArrayList<>(coll);
		System.out.println(al);
	}

}
