package by.academy.lesson17.exception;

import java.io.IOException;

public abstract class SuperClass {
	public SuperClass() throws IOException {
	}

	public void start() throws IOException {
	}

	public abstract void stop() throws IOException;
}
