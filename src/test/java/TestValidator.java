import org.junit.Assert;
import org.junit.Test;

import util.Validator;

import static util.Validator.*;

//Class contain tests to prove methods in class Validator work as expected
public class TestValidator {

	// String validator for not supported values
	@Test
	public void unitExpressionOmittedExample() {
		boolean result = isValid("5 17s 8d", "3p 5s 10d");
		Assert.assertFalse(result);
	}

	@Test
	public void unitOmittedExample() {
		boolean result = isValid("5p 8d", "3p 5s 10d");
		Assert.assertFalse(result);
	}
	@Test
	public void typeFellerExample() {
		boolean result = isValid("5o 17s 8d", "3p 5s 10d");
		Assert.assertFalse(result);
	}

	// String validator for supported values
	@Test
	public void standardExample() {
		boolean result = isValid("2p 17s 8d", "3p 5s 10d");
		Assert.assertTrue(result);
	}

	@Test
	public void unitValueOmittedExample() {
		boolean result = isValid("p 17s 8d", "3p 5s 10d");
		Assert.assertTrue(result);
	}

	@Test
	public void negativeFirstExample() {
		boolean result = isValid("-9p 17s 8d", "3p 5s 10d");
		Assert.assertTrue(result);
	}

	@Test
	public void negativeSecondExample() {
		boolean result = isValid("9p 17s 8d", "-3p 5s 10d");
		Assert.assertTrue(result);
	}

	// int validator
	@Test
	public void negativeExample() {
		boolean result = isValid("9p 17s 8d", -1);
		Assert.assertTrue(result);
	}

	@Test
	public void zeroExample() {
		boolean result = isValid("9p 17s 8d", 0);
		Assert.assertTrue(result);
	}

	@Test
	public void numberExample() {
		boolean result = isValid("9p 17s 8d", 1);
		Assert.assertTrue(result);
	}

}
