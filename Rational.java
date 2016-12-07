//Carl Charlet

import java.util.Scanner;

class Rational
{
	
	private int numerator;
	private int denominator;
	
	public boolean Rat(Rational RatNumber)
	{
		return ((numerator * 1.0) / (denominator * 1.0)) < ((RatNumber.numerator * 1.0) / (RatNumber.denominator * 1.0));
		
	}

	public String ConvertToString()
	{
		return ""  + numerator + "/" + denominator;
	}

    //constructors
    
	public Rational (int rat1, int rat2)
	{
		int number1;
		number1 = rat1;
		int number2;
		number2 = rat2;
		int remainder;
		remainder = number1 % number2;
		
	    do
		{
			number1 = number2;
			number2 = remainder;
			remainder = number1 % number2;
		}while (remainder != 0);
		
		numerator = rat1 / number2;
		denominator = rat2 / number2;
	}

          // Evaluation Method

}