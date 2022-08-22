package by.academy.homework6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

//Прочесть информацию введеную из клавиатури и записать в созданный вами txt файл, 
//если введена "stop" строка тогда закончить запись в файл.

public class Task1 {
	public static void main(String[] args) throws IOException  {
		File dir = new File("src/homework6/");
		if (!dir.exists()) {
			dir.mkdirs();
		}
		
		File file = new File(dir, "task1.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
	
		String str;
		System.out.print("Введите произвольный текст:");
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
	
		try(FileWriter bw = new FileWriter(file)){
		
		do {
			str=br.readLine();
			if (str.compareTo("stop")==0)
				break;
			str=str+"\r\n";
			bw.write(str);
		} while (str.compareTo("stop")!=0);
			
		}
	}
}

		


