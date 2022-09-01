package by.academy.finalwork.service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreate {
	public static void main(String[] args) throws IOException  {
		
		File dir = new File("src/finalwork/");
		if (!dir.exists()) {
			dir.mkdirs();
		}
		
		File file = new File (dir, "file.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		try ( BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
						String str="Airbus A320, passenger, 37.6, 180, 66.0, 6100.0, 2600.0, 78.0\n"
						+ "Airbus A220,passenger, 32.4,150, 57.0, 5100.0, 1800.0, 65.0\n"
						+ "Airbus A380,passenger, 39.2, 200, 69.0, 6300.0, 2740.0, 88.0\n"
						+ "Boeing 747-400,passenger, 70.7, 425, 295.74, 13430.0, 8460.0, 397.0\n"
						+ "Boeing 767,passenger, 52.2, 224, 298.56, 13500.0, 4800.0, 223.0\n"
						+ "Boeing 787,passenger, 56.7, 250, 300.50, 13600.0, 5700.0, 227.9\n"
						+ "ТУ 204C,cargo, 46.14, 210, 30.0, 6820.0, 7500.0, 93.0\n"
						+ "AH-12,cargo, 32.45, 96, 24.0, 6580.0, 6100.0, 56.0\n"
						+ "AH-77,cargo, 44.56, 100, 29.0, 6750.0, 7380.0, 87.0\n"
						+ "Cessna – 172,smallEngine, 8.28, 3, 0.38, 1280.0, 25.0, 1.16\n"
						+ "Cirrus – SR-22,smallEngine, 7.92, 4, 0.57, 1943.0, 50.0, 1.63\n"
						+ "Beech Bonanza,smallEngine, 8.38, 6, 0.78, 1300.0, 61.0, 1.86\n"
						+ "";
				bw.write(str);			    	   			
		
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}