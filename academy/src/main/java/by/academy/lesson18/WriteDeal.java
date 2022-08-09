package by.academy.lesson18;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDeal {

	public static void main(String[] args) {
		try (FileWriter writer = new FileWriter("deal\\beal.txt");
				BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
			String text = "Привет мир!";
			bufferedWriter.write(text);
			bufferedWriter.newLine();
			bufferedWriter.write(text);
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
