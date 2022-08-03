package by.academy.homework4;

import java.util.regex.Pattern;

public interface Validator {

	default boolean isValid(String strData) {
		return getPattern().matcher(strData).matches();
	}
	Pattern getPattern();
}

