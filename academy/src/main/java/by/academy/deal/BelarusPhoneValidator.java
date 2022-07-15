package by.academy.deal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator{
	
	@Override
	public boolean isValid(String string) {
		Pattern pattern = Pattern.compile("\\+375");
		Matcher matcher = pattern.matcher(string);	
		if(matcher.lookingAt()) {
			return true;
		}
		return false;
	}

		
}
