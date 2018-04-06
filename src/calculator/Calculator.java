package calculator;
import java.util.Scanner;

public class Calculator {

	public int divide(int number1, int number2) {
		if (number1 == 0 || number2 == 0) {
			throw new IllegalArgumentException("Cannot divide by 0");
//			System.out.println("Cannot divide by 0");
		}
			
		if (number1 <= number2 && number2 % number1 == 0)
			return number2 / number1;
		else if (number2 <= number1 && number1 % number2 == 0) {
			return number1 / number2;
		} else
			System.out.println("Cannot divide the numbers");
		return (Integer) null;

	}

	public int substract(int number1, int number2) {
		return number1 - number2;
	}

	public int add(int number1, int number2) {
		return number1 + number2;
	}

	public int multiply(int number1, int number2) {
		if (number1 == 0 || number2 == 0)
			return 0;
		else
			return number1 * number2;
	}
}
