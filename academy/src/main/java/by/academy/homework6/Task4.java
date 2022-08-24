package by.academy.homework6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//Создайте каталог(папку). Создайте в папке 100 txt файлов (Например, 1.txt, 2.txt ... 100.txt). 
//Считываем текст из 2-ого задания, получаем его длинну (576 символов). Для каждого файла генерируем 
//рандомное число от 0 до 576, достаем из текста (из 2 задания) такое-же количество символов 
//(string.substring()) и сохраняем в наш файл. Создайте файл result.txt и запишите туда список всех файлов
//и их размеры.

public class Task4 {
	public static void main(String[] args) throws IOException {
		File dir = new File("src/homework6/newcatalog");
		if (!dir.exists()) {
			dir.mkdirs();
		}
		
		File resultFile = new File(dir, "result.txt");
		if (!resultFile.exists()) {
			resultFile.createNewFile();
		}		
		
		try (BufferedReader br = new BufferedReader(new FileReader("src/homework6/firstFile.txt"));
				BufferedWriter bw = new BufferedWriter(new FileWriter(resultFile))){
									
			String str = "";
			String text = "";

			while ((str=br.readLine()) != null) {
				text=text+str;
		    }
			
			for (int i=1; i<=100; i++) {
			    File file = new File(dir, i+".txt");
				if (!file.exists()) {
					file.createNewFile();
			    }
				FileWriter fileWr=new FileWriter(file);
				int countOfSymbol=(int)	(Math.random()*574);
				fileWr.write(text.substring(0, countOfSymbol));
				fileWr.close();
			}			
			
			System.out.println("Количество символов в файле: "+text.length());
			
			for (File f : dir.listFiles()) {
				bw.write("Имя файла: "+ f.getName()+" размер файла: "+f.length()+"\n");
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
				
	}
}
