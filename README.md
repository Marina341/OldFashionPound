 #About
  OldFashionPound library is used to calculate arithmetic operations for pre-1970 UK prices.
  Available arithmetic operations are sum, subtraction, multiplication and division.

  Under the old money system of UK, before 1970 was expressed in Pounds, Shillings and Pence.
  There were 12 pence in a shilling and 20 shillings, or 240 pence, in a pound.

  Arithmetic operations have two input parameters. Sum and subtraction require two String values.
  Multiplication and division have String value as first parameter and int value as second.


 #String format
  Methods return String in specific format "Xp Ys Zd". If no shillings in result it will still be in same format.
   eg. Result value 3 Pounds 0 Shillings 2 Pence
     "3p 0s 2d"
  Remainder is represented between parenthesis (if exists) in same format but zero values will be omitted.
   eg. Result value 12 Pounds 6 Shillings 0 Pence with remainder of 0 Pounds 10 Shillings 1 Pence will be represented in format:
       "12p 6s 0p (10 s 1d)"

  Input parameter string has defined format "Xp Ys Zd". Value can be omitted but unit is obligatory.
   eg. p 17s 8d format supported (considered same as 0p 17s 8d )
       17s 8d   format not supported


 #How to use
  Create OldFashionPound class and use it to call methods:

  public static void main(String[] args) {

  OldFashionPound oldFashionPund = new OldFashionPound();
  String result = oldFashionPund.sum("5p 17s 8d", "3p 4s 10d");
  System.out.println(result)

 }

#Installation
  This library requires Java 11

#Maven
	<dependency>
		<groupId>junit</groupId>
		<artifactId>junit</artifactId>
		<version>4.13.2</version>
		<scope>test</scope>
	</dependency>

#Response
  Every successful API call returns a String object with defined format.
