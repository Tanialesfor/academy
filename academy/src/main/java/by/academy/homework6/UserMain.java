package by.academy.homework6;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

//В классе Main создайте ArrayList<User>, добавьте 10 пользователей в коллекцию. Создайте каталог(папку)
//users и для каждого пользователя создайте файл в этом каталоге. Назовите файл Имя_Фамилия.txt. 
//Сериализуйте информацию о пользователе и положите в файл пользователя. Не забываем закрывать потоки. 
//В блоке catch выводим сообщение ошибки на экран (System.err.println(e.getMessage());)

public class UserMain {
	public static void main(String[] args) throws IOException {
		
		ArrayList <User> arrayList= new ArrayList <>(10);
		arrayList.add(0, new User("Злата","Данкова",26.0));
		arrayList.add(1, new User("София","Солнечная",15.5));
		arrayList.add(2, new User("Никита","Петров",42.4));
		arrayList.add(3, new User("Вероника","Радковская",33.0));
		arrayList.add(4, new User("Наталья","Дрожин",18.0));
		arrayList.add(5, new User("Глеб","Романов",35.0));
		arrayList.add(6, new User("Александр","Битковский",19.0));
		arrayList.add(7, new User("Денис","Радужный",25.0));
		arrayList.add(8, new User("Анастасия","Яркая",23.8));
		arrayList.add(9, new User("Марта","Южная",37.0));
		
		File dir = new File("src/homework6/users");
		if (!dir.exists()) {
			dir.mkdirs();
		}
		
		for (User user : arrayList) {			
			File file = new File(dir, user.getName()+"_"+user.getSurname()+".txt");
			if (!file.exists()) {
				file.createNewFile();
				try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
						ObjectOutputStream oos = new ObjectOutputStream(bos)) {
					oos.writeObject("Информация о пользователе:");
					oos.writeObject(user.toString());

				} catch (IOException e) {
					System.err.println(e.getMessage());
				}	
				
			}
		}
		
	}
}
