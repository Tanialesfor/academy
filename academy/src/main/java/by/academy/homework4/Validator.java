package by.academy.homework4;

import java.util.regex.Pattern;

public interface Validator {

	default boolean isValid(String strDate) {
		return getPattern().matcher(strDate).matches();
	}
	Pattern getPattern();
}

