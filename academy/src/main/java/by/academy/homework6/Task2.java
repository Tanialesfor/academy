package by.academy.homework6;
//Создать руками текстовый файл, закинуть следующий текст:
//"Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
//+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, "
//+ "when an unknown printer took a galley of type and scrambled it to make a type "
//+ "specimen book. It has survived not only five centuries, but also the leap into "
//+ "electronic typesetting, remaining essentially unchanged. It was popularised in "
//+ "the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, "
//+ "and more recently with desktop publishing software like Aldus PageMaker including "
//+ "versions of Lorem Ipsum."
//Создать новый файл result.txt. Программно считать файл с текстом, удалить все пробелы
//и записать полученный текст в result.txt.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task2 {
		
	public static void main(String[] args) throws IOException {
		File dir = new File("src/homework6/");
		if (!dir.exists()) {
			dir.mkdirs();
		}
		
		File firstFile = new File(dir, "firstFile.txt");
		if (!firstFile.exists()) {
			firstFile.createNewFile();
		}
		
		File resultFile = new File(dir, "result.txt");
		if (!resultFile.exists()) {
			resultFile.createNewFile();
		}
			
		try ( BufferedWriter bw = new BufferedWriter(new FileWriter(firstFile));
			BufferedWriter bwResult = new BufferedWriter(new FileWriter(resultFile));
			BufferedReader br = new BufferedReader(new FileReader(firstFile))) {
			
			String str="Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
					+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, "
					+ "when an unknown printer took a galley of type and scrambled it to make a type "
					+ "specimen book. It has survived not only five centuries, but also the leap into "
					+ "electronic typesetting, remaining essentially unchanged. It was popularised in "
					+ "the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, "
					+ "and more recently with desktop publishing software like Aldus PageMaker including"
					+ " versions of Lorem Ipsum.";
					
			bw.write(str);
    		br.readLine();
    		bwResult.write(str.replace(" ", ""));
			    	   			
		}		
    }
}
