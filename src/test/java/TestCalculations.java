import org.junit.Assert;
import org.junit.Test;

//Class contain tests to prove methods in OldFashionPound class work as expected
public class TestCalculations {

	//Examples from task
	@Test
	public void sumExample() {
		OldFashionPound call = new OldFashionPound();
		String result = call.sum("5p 17s 8d", "3p 4s 10d");
		String expected = ("9p 2s 6d");
		Assert.assertEquals(expected, result);
	}

	@Test
	public void subtractionExample() {
		OldFashionPound call = new OldFashionPound();
		String result = call.subtraction("5p 17s 8d", "3p 4s 10d");
		String expected = ("2p 12s 10d");
		Assert.assertEquals(expected, result);
	}

	@Test
	public void multiplicationExample() {
		OldFashionPound call = new OldFashionPound();
		String result = call.multiplication("5p 17s 8d", 2);
		String expected = ("11p 15s 4d");
		Assert.assertEquals(expected, result);
	}

	@Test
	public void divisionExample() {
		OldFashionPound call = new OldFashionPound();
		String result = call.division("5p 17s 8d", 3);
		String expected = ("1p 19s 2d (2d)");
		Assert.assertEquals(expected, result);
	}

	@Test
	public void divisionExample2() {
		OldFashionPound call = new OldFashionPound();
		String result = call.division("18p 16s 1d", 15);
		String expected = ("1p 5s 0d (1s 1d)");
		Assert.assertEquals(expected, result);
	}

	//Multiplication and division with zero
	@Test
	public void multiplicationwithZeroExample() {
		OldFashionPound call = new OldFashionPound();
		String result = call.multiplication("5p 17s 8d", 0);
		String expected = ("0p 0s 0d");
		Assert.assertEquals(expected, result);
	}
	@Test
	public void divisionWithZero() {
		OldFashionPound call = new OldFashionPound();
		String result = call.division("18p 16s 1d", 0);
		String expected = ("0p 0s 0d");
		Assert.assertEquals(expected, result);
	}

	//Negative input parameters
	@Test
	public void sumExampleNegative() {
		OldFashionPound call = new OldFashionPound();
		String result = call.sum("-5p 17s 8d", "3p 4s 10d");
		String expected = ("-2p 12s 10d");
		Assert.assertEquals(expected, result);
	}

	@Test
	public void subtractionExampleNegative() {
		OldFashionPound call = new OldFashionPound();
		String result = call.subtraction("-5p 17s 8d", "3p 4s 10d");
		String expected = ("-9p 2s 6d");
		Assert.assertEquals(expected, result);
	}

	//Expected not to be equal
	@Test
	public void sumExample2() {
		OldFashionPound call = new OldFashionPound();
		String result = call.sum("5p 17s 8d", "3p 4s 10d");
		String expected = ("9p 2s 16d");
		Assert.assertNotEquals(expected, result);
	}

	@Test
	public void subtractionExample2() {
		OldFashionPound call = new OldFashionPound();
		String result = call.subtraction("5p 17s 8d", "3p 4s 10d");
		String expected = ("2p 21s 10d");
		Assert.assertNotEquals(expected, result);
	}

	@Test
	public void multiplicationExample2() {
		OldFashionPound call = new OldFashionPound();
		String result = call.multiplication("5p 17s 8d", 5);
		String expected = ("11p 15s 4d");
		Assert.assertNotEquals(expected, result);
	}

	@Test
	public void divisionExample3() {
		OldFashionPound call = new OldFashionPound();
		String result = call.division("5p 17s 8d", 7);
		String expected = ("1p 19s 2d (2p)");
		Assert.assertNotEquals(expected, result);
	}
}
