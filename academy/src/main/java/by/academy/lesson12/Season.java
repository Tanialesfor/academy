package by.academy.lesson12;
//3.	а) Создать перечисление, содержащее названия времен года.
//б) Создать переменную содержащую ваше любимое время года и распечатать всю информацию о нем. 
//в) Создать метод, который принимает на вход переменную созданного вами enum типа. Если значение 
//равно Лето, выводим на консоль “Я люблю лето” и так далее Используем оператор switch.
//г) Перечисление должно содержать переменную, содержащую среднюю температуру в каждом времени года.
//д) Добавить конструктор принимающий на вход среднюю температуру.
//е) Создать метод getDescription, возвращающий строку “Холодное время года”. Переопределить метод 
//getDescription - для константы Лето метод должен возвращать “Теплое время года”.
//ж) В цикле распечатать все времена года, среднюю температуру и описание времени года.

public enum Season {
	
 SUMMER (+20){
 @Override
 public void getDescription() {
	 System.out.println("Теплое время года: ");
 }
 },
 
 
 AUTUMN(+12){
	 @Override
	 public void getDescription() {
		 System.out.println("Холодное время года: ");
	 }
	 },
 WINTER(-6){
	 @Override
	 public void getDescription() {
		 System.out.println("Холодное время года: ");
	 }
	 },
 SPRING(+5){
	 @Override
	 public void getDescription() {
		 System.out.println("Холодное время года: ");
	 }
	 };
	private int temperature;
	
	Season(int temperature){
			this.temperature=temperature;
	}
	
	public abstract void getDescription(); 
		
}
