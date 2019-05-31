
public class Logic {
	
	public static int compare(int firstNumber, int secondNumber) {
		int result = 0;
		if (firstNumber > 21 && secondNumber > 21) {
			result = 0;
		}
		else if (secondNumber > 21 && firstNumber <=21) {
			result = firstNumber;
		}
		else if (firstNumber > 21 && secondNumber <= 21) {
			result = secondNumber;
		}
		else if (secondNumber > firstNumber && firstNumber <= 21 && secondNumber <= 21) {
			result = secondNumber;
		}
		else if (firstNumber > secondNumber && firstNumber <= 21 && secondNumber <= 21) {
			result = firstNumber;
		}
		else if (firstNumber == secondNumber) {
			result = firstNumber;
		}
		return result;
	}
}
