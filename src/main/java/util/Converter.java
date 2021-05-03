package util;

import static java.lang.Math.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
 	/*
 	This class contains methods used to convert values.
 	It contains methods used to convert String to Pence and vice versa.
 	It contains methods used to convert int amount to String in defined format.
 	*/
public class Converter {

	/*
	Method use Java Regular Expresion to define and map values of Pounds, Shillings and Pence from input string.
	If values are successfully matched they are passed to method 'toPence'. Value given with that method is passed as result.

	If values are not successfully matched method throws Exception. String passed to this method always previously passed validation
	so this should never happen.
	 */
	public static int convertStringToPence (String stringAmount) {
		Pattern pattern = Pattern.compile("(-?\\d*)p\\s(\\d*)s\\s(\\d*)d", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(stringAmount);
		//try
		if(matcher.find()) {
			return toPennce(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)), Integer.parseInt(matcher.group(3)));
		}
		throw new IllegalArgumentException(String.format("Input format is not supported"));
	}

	// Method converts price to smallest unit Pence
	public static int toPennce (int x, int y, int z) {
		return ((abs(x*240)) + (y*12) + (z)) * x/abs(x);
	}

	/*
	Method converts value given in pence to format for operation result ("Xp Ys Zd"). Zero values are included.
	Returned String is formatted in a format for operation result
	 */
	public static String convertPenceToString(int pennies) {
		int pounds = pennies / 240;
		int shilling = (pennies /12) %20;
		int pence = pennies % 12;

		StringBuilder sb = new StringBuilder();
		sb.append(pounds);
		sb.append("p ");
		sb.append(abs(shilling));
		sb.append("s ");
		sb.append(abs(pence));
		sb.append("d");
		return sb.toString();
	}

	/*
	Method converts value given in pence to format for operation remainder ("Xp Ys Zd"). Zero values are omitted.
	 */
	public static String convertRemainderToString(int p_pennies) {
		int pennies = abs(p_pennies);
		int pounds = pennies / 240;
		int shilling = (pennies /12) %20;
		int pence = pennies % 12;
		StringBuilder sb = new StringBuilder();
		if (pounds != 0) {
			sb.append(pounds);
			sb.append("p ");
		}
		if (shilling != 0) {
			sb.append(shilling);
			sb.append("s ");
		}
		if (pence != 0) {
			sb.append(pence);
			sb.append("d");
		}
		return sb.toString();
	}

}
