package by.academy.lesson19.lambdaE;

public class CheapCarSearchable implements Searchable {
	@Override
	public boolean test(Car car) {
		return car.getCost() < 1000;
	}
}
