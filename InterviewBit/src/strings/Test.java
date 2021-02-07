package strings;

import java.util.HashSet;

public class Test {

	String name;
	int age;

	Test(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {

		Test c1 = new Test("John", 20);
		Test c2 = new Test("John", 20);

		HashSet<Test> customerSet = new HashSet<>();
		customerSet.add(c1);
		customerSet.add(c2);
		System.out.println(customerSet.size());
	}

}
