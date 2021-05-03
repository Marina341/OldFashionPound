package util;

import static java.lang.String.*;

  // Class used to validate input parameters
public class Validator{

	/*
     Method boolean isValid is overloaded to verify validations of different input parameters accordingly
     Use Java Regular Expresion to verify given input parameters.
     */
	public static boolean isValid(String firstArgument, String secondArgument) {
		String format = "-?\\d*p\\s\\d*s\\s\\d*d";
		boolean firstIsValid = firstArgument.matches(format);
		boolean secondIsValid = secondArgument.matches(format);
		return (firstIsValid && secondIsValid);
	}
	 public static boolean isValid(String firstArgument, int secondArgument) {
		String format = "-?\\d*p\\s\\d*s\\s\\d*d";
		boolean firstIsValid = firstArgument.matches(format);
		boolean secondIsValid = valueOf(secondArgument).matches("-?\\d*");
		return (firstIsValid && secondIsValid);
	 }

}
