package by.academy.lesson19.lambdaE;

public class ExpensiveCarsSearch implements Searchable {
	@Override
	public boolean test(Car car) {
		return car.getCost() > 20000;
	}
}
