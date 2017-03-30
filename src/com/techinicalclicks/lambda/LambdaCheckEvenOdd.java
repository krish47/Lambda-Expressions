package com.techinicalclicks.lambda;

public class LambdaCheckEvenOdd {

	public static void main(String[] args) {
		EvenOdd evenOdd = number -> {
			if (number % 2 == 0) {
				System.out.println(number + " is Even");
			} else {
				System.out.println(number + " is Odd");
			}
		};
		evenOdd.check(7);
		evenOdd.check(84);
	}

}
