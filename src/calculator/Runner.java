package calculator;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter the first number: ");
		int number1 = userInput.nextInt();
		System.out.println(number1);
		System.out.print("Please enter the second number: ");
		int number2 = userInput.nextInt();
		System.out.println(number2);
		System.out.println("Addition result: " + c.add(number1, number2));
		System.out.println("Division result: " + c.divide(number1, number2));
		System.out.println("Substraction result: " + c.substract(number1, number2));
		System.out.println("Multiplication result: " + c.multiply(number1, number2));
		userInput.close();

	}

}
