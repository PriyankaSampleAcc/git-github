package codesonfiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadExistingFile {
	static String sampleString;

	public static void main(String[] args) throws Exception {
		File file = new File("D:\\latest pull of git codes\\files\\readfile.txt");
		BufferedReader bufferReader = new BufferedReader(new FileReader(file));
		while ((sampleString = bufferReader.readLine()) != null) {
			System.out.println(sampleString);
		}
	}
}
