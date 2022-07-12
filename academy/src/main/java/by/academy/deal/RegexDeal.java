package by.academy.deal;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexDeal {

	boolean result;
	
	public RegexDeal (String date) {

		Pattern pattern = Pattern.compile("\\d{2}(\\-|\\/)\\d{2}(\\-|\\/)\\d{4}");		
		
		Matcher matcher = pattern.matcher(date);
		
		if (matcher.find()) {
			this.result=true;
		} else {
			this.result=false;
		}
	
	}
}
