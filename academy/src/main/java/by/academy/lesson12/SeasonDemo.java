package by.academy.lesson12;

public class SeasonDemo {
	public static void main(String[] args) {

		Season season = Season.SUMMER;

		switch (season) {
		case SUMMER:
			System.out.println("Я люблю лето!");
			break;
		case AUTUMN:
			System.out.println("Я люблю осень!");
			break;
		case WINTER:
			System.out.println("Я люблю зиму!");
			break;
		case SPRING:
			System.out.println("Я люблю весну!");
			break;
			default:
			System.out.println("Ничего не люблю.");
		}
		Season[] allseasons = Season.values();
			for(Season s:allseasons ) {
			System.out.println(s.name());
			System.out.println("Средняя температура: "+s.getAverageTemperature());
			s.getDescription();
			System.out.println();
			}
	}
}
