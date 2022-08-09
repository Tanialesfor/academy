package by.academy.lesson18;

// Создать папку myPackage c файлом myFirstFile внутри. Запустить пронрамму два раза.
// Пробежаться по всем файлам в папке academy и вывести все имена файлов на экран (не папок)
import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileDemo {
	public static void main(String[] args) throws IOException {

		File dirs = new File("myPackage");
		if (!dirs.exists()) {
			dirs.mkdirs();
		}
		File file = new File(dirs, "myFirstFile.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		System.out.println(file.isAbsolute());
		
		File dirs1 = new File("./");
		for (File f : dirs1.listFiles()) {
			System.out.println("Имя файлов:" + f.getName());
		}
	}
}