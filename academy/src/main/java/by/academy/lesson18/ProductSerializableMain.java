package by.academy.lesson18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ProductSerializableMain {
	public static void main(String[] args) throws Exception {
	File dirs = new File("src\\io");
	if (!dirs.exists()) {
		dirs.mkdirs();
	}
	File file = new File(dirs, "product.txt");
	if (!file.exists()) {
		file.createNewFile();
	}
	Product product1=new Product("Молоко", 3.5, 2);
	Product product2=new Product("Хлеб", 2.5, 1);
	
	try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
			ObjectOutputStream oos = new ObjectOutputStream(bos)) {
		oos.writeObject("test");
		oos.writeInt(1);
		oos.writeObject(product1);
		oos.writeObject(product2);


	} catch (IOException ex) {
		System.out.println(ex.getMessage());
	}

	try (BufferedInputStream br = new BufferedInputStream(new FileInputStream(file));
			ObjectInputStream isu = new ObjectInputStream(br)) {
		String str = (String) isu.readObject();
		Integer i = isu.readInt();
		Product product3 = (Product) isu.readObject();
		Product product4 = (Product) isu.readObject();
		System.out.println(str);
		System.out.println(i);
		System.out.println(product3);
		System.out.println(product4);
		
	} catch (IOException | ClassNotFoundException e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	}
}
