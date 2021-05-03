import org.junit.Assert;
import org.junit.Test;

import util.Converter;

import static util.Converter.*;

//Class contain tests to prove methods in class Converter work as expected
public class TestConverter {

	// Examples expected to be equals
	@Test
	public void StringToPenceExample1() {
		int result = convertStringToPence("5p 4s 1d");
		int expected = 1249;
		Assert.assertEquals(expected, result);
	}

	@Test
	public void StringToPenceExample2() {
		int result = convertStringToPence("5p 17s 8d");
		int expected = 1412;
		Assert.assertEquals(expected, result);
	}


	@Test
	public void PenceToStringExample1() {
		String result = convertPenceToString(1249);
		String expected = "5p 4s 1d";
		Assert.assertEquals(expected, result);
	}

	@Test
	public void PenceToStringExample2() {
		String result = convertPenceToString(1412);
		String expected = "5p 17s 8d";
		Assert.assertEquals(expected, result);
	}

	@Test
	public void toPennceExample1() {
		int result = toPennce(5, 4, 1);
		int expected = 1249;
		Assert.assertEquals(expected, result);
	}

	@Test
	public void toPennceExample2() {
		int result = toPennce(5, 17, 8);
		int expected = 1412;
		Assert.assertEquals(expected, result);
	}

	@Test
	public void RemainderToStringExample1() {
		String result = convertRemainderToString(240).trim();
		String expected = "1p";
		Assert.assertEquals(expected, result);
	}

	@Test
	public void RemainderToStringExample2() {
		String result = convertRemainderToString(20);
		String expected = "1s 8d";
		Assert.assertEquals(expected, result);
	}

	//Negative numbers, expected to be equals
	@Test
	public void StringToPenceExample3() {
		String result = convertPenceToString(1412);
		String expected = "5p 17s 8d";
		Assert.assertEquals(expected, result);
	}

	@Test
	public void PenceToStringExample3() {
		String result = convertPenceToString(-778);
		String expected = "-3p 4s 10d";
		Assert.assertEquals(expected, result);
	}

	@Test
	public void toPennceExample3() {
		int result = toPennce(-5, 17, 8);
		int expected = -1412;
		Assert.assertEquals(expected, result);
	}

	// Expected not to be equal
	@Test
	public void StringToPenceExample4() {
		int result = convertStringToPence("5p 17s 0d");
		int expected = 1412;
		Assert.assertNotEquals(expected, result);
	}

	@Test
	public void PenceToStringExample4() {
		String result = convertPenceToString(12);
		String expected = "5p 4s 1d";
		Assert.assertNotEquals(expected, result);
	}

	@Test
	public void toPennceExample4() {
		int result = toPennce(-55, 17, 8);
		int expected = -1412;
		Assert.assertNotEquals(expected, result);
	}

	@Test
	public void RemainderToStringExample3() {
		String result = convertRemainderToString(250);
		String expected = "1s 8d";
		Assert.assertNotEquals(expected, result);
	}

	// Expected not to be equal due to opposite mathematical sign (one positive, one negative)
	@Test
	public void StringToPenceExample5() {
		int result = convertStringToPence("-5p 17s 8d");
		int expected = 1412;
		Assert.assertNotEquals(expected, result);
	}

	@Test
	public void PenceToStringExample5() {
		String result = convertPenceToString(-1249);
		String expected = "5p 4s 1d";
		Assert.assertNotEquals(expected, result);
	}

	@Test
	public void toPennceExample5() {
		int result = toPennce(-5, 17, 8);
		int expected = 1412;
		Assert.assertNotEquals(expected, result);
	}

}
