package by.academy.lesson17.exception;

public class ConstructorException {
	private int i;

    public ConstructorException(int i) {
        this.i = 20 / i;
    }

    public int getI() {
        return i;
    }
}
