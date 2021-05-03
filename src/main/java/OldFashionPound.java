
import static util.Converter.*;
import static util.Validator.*;

/*
Class OldFashionPound is used to calculate arithmetic operations for pre-1970 UK prices.
Available arithmetic operations are sum, subtraction, multiplication and division.
Method use Validator class to validate method input parameters and Converter class to
convert values.
 */
public class OldFashionPound {

	/*
    Method requires two input String parameters and returns String.
	Input and returned values implement defined format "Xp Ys Zd".

	Method sums values of input parameters which are first converted to pence.
	Result in pence is converted to String.
	 */
	public String sum (String firstAmount, String secondAmount) {
		isValid(firstAmount, secondAmount);
		int sum = convertStringToPence(firstAmount) + convertStringToPence(secondAmount);
		return convertPenceToString(sum);
	}

	/*
	Method requires two input String parameters and returns String.
    Input and returned values implement defined format "Xp Ys Zd".

    Method subtracts values of input parameters which are first converted to pence.
    Result in pence is converted to String.
    */
	public String subtraction(String firstAmount, String secondAmount) {
		isValid(firstAmount, secondAmount);
		int subtraction = convertStringToPence(firstAmount) - convertStringToPence(secondAmount);
		return convertPenceToString(subtraction);
	}

	/*
    Method requires one String and one int input parameter and returns String.
    Input and return String values have defined format "Xp Ys Zd".

    String parameter is converted to pence, multiplies with int value and converted back to String.
    */
	public String multiplication (String firstAmount, int number) {
		isValid(firstAmount, number);
		int subtraction = convertStringToPence(firstAmount) * number;
		return convertPenceToString(subtraction);
	}
	/*
	Method requires one String and one int input parameter and returns String.
	Input String have defined format "Xp Ys Zd". Result String have defined format "Xp Ys Zd" and remainder represented in parenthesis
	in same format but with zero values omitted.

	String parameter is converted to pence, divided by int value and converted back to String.
	*/
	public String division(String firstAmount, int number) {
		isValid(firstAmount, number);
		if (number == 0) {
			return "0p 0s 0d";
		}
		else {
			int subtraction = convertStringToPence(firstAmount) / number;
			String result = convertPenceToString(subtraction);
			int remainder = convertStringToPence(firstAmount) % number;
			String remainderString = (remainder == 0) ? "" : " (" + convertRemainderToString(remainder) + ")";
			return result + remainderString ;
		}
	}

}
