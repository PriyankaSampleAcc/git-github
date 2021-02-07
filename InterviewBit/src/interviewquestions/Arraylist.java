package interviewquestions;

import java.util.ArrayList;

public class Arraylist {
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<>();
		l.add("Spriing");
		l.add("Object");
		l.add("Man");
		l.add("Mannn");
		l.add("Object");
		System.out.println(l);
		l.remove("Object");
		System.out.println(l);
	}
}
