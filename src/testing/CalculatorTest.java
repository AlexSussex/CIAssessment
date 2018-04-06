package testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import calculator.Calculator;

public class CalculatorTest {
	Calculator c = new Calculator();

	@Test
	public void divisionTest() {
		assertEquals(10, c.divide(100, 10));
		assertEquals(25, c.divide(625, 25));
		assertEquals(12, c.divide(144, 12));
	}

	@Test
	public void multiplicationTest() {
		assertEquals(144, c.multiply(12, 12));
		assertEquals(25, c.multiply(5, 5));
		assertEquals(0, c.multiply(144, 0));
	}

	@Test
	public void substractionTest() {
		assertEquals(10, c.substract(678, 668));
		assertEquals(122, c.substract(700, 578));
		assertEquals(0, c.substract(164, 164));
	}

	@Test
	public void additionTest() {
		assertEquals(125, c.add(70, 55));
		assertEquals(8850, c.add(1550, 7300));
		assertEquals(37, c.add(22, 15));
	}
}
