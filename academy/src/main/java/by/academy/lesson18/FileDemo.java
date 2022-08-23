package by.academy.lesson18;

// Создать папку myPackage c файлом myFirstFile внутри. Запустить программу два раза.
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
			System.out.println("Имя файла:" + f.getName());
			System.out.println("Путь: " + f.getPath());
			System.out.println("Абсолютный путь: " + f.getAbsolutePath());
			System.out.println("Родительский каталог: " + f.getParent());
			System.out.println(f.exists() ? "Файл/каталог существует." : "Файл/каталог не существует.");
			System.out.println(f.canWrite() ? "Файл/каталог доступен для редактирования."
					: "Файл/каталог не доступен для редактирования.");
			System.out.println(
					f.canRead() ? "Файл/каталог доступен для чтения." : "Файл/каталог не доступен для чтения.");
			System.out.println((f.isDirectory() ? "Каталог." : "Не каталог."));
			System.out.println(f.isFile() ? "Файл." : "Не файл.");
			System.out.println(f.isAbsolute() ? "Абсолютный путь." : "Не абсолютный путь.");
			System.out.println("Дата последнего редактирования: " + new Date(f.lastModified()));
			System.out.println("Размер: " + f.length() + " байт.");

			
			
			
		}
	}
}