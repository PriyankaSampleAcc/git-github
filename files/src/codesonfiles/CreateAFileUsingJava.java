package codesonfiles;

import java.io.File;
import java.io.IOException;

public class CreateAFileUsingJava {
	public static void main(String[] args) throws IOException {
		File file = new File("samplefile.txt");
		boolean bolean = file.createNewFile();
		if (bolean) {
			System.out.println("File created");

		} else {
			System.out.println("File already exists");
			System.out.println(file.getAbsolutePath());
		}
	}
}
