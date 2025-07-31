package chapter04.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

	public static void main(String[] args) {

		BufferedReader br = null;

		try {

			FileReader fr = new FileReader("./src/main/java/chapter04/io/BufferedReaderExample.java");

			br = new BufferedReader(fr);

			String line = null;

			while ((line = br.readLine()) != null) {
				System.out.println(line);

			}

		} catch (FileNotFoundException e) {
			System.out.println("file not found: " + e);

		} catch (IOException e) {
			System.out.println("error: " + e);
		} finally {
			try {
				if (br != null) {
					br.close();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
