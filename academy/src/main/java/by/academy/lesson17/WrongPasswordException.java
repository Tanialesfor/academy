package by.academy.lesson17;

public class WrongPasswordException  extends Exception{
	private static final long serialVersionUID = 1L;

	public WrongPasswordException() {
		super();
	}

	public WrongPasswordException(String message) {
		super(message);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("WrongPasswordException [");
		builder.append(getMessage());
		builder.append("]");
		return builder.toString();
	}
}
