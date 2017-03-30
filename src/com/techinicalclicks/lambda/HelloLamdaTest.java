package com.techinicalclicks.lambda;

public class HelloLamdaTest {

	public static void main(String[] args) {
		HelloLambda helloLambda = () -> System.out.println("Hello World!");
		helloLambda.sayHello();
	}

}
