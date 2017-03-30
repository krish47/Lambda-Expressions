package com.techinicalclicks.lambda;

public class LambdaToArithmeticOperations {

	public static void main(String[] args) {
		// Arithmetic addition=(int a,int b)->{return a+b;};
		Arithmetic addition = (a, b) -> a + b;
		System.out.println("Addition = " + addition.operation(7, 60));

		// Arithmetic multiplication=(int a,int b)->{return a*b;};
		Arithmetic multiplication = (a, b) -> a * b;
		System.out.println("Addition = " + multiplication.operation(7, 60));
	}

}
