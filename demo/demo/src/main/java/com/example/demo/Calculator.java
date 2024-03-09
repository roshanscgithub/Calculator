package com.example.demo;

import java.util.Scanner;

public class Calculator {
	public static int add(int number1, int number2) {
		return number1 + number2;
	}

	public static int sub(int number1, int number2) {
		return number1 - number2;
	}

	public static int mul(int number1, int number2) {
		return number1 * number2;
	}

	// Integer divide. Return a truncated int
	public static float divInt(int number1, int number2) {
		if (number2 == 0) {
			throw new IllegalArgumentException("Cannot divide by 0!");
		}
		return (float) number1 / number2;
	}

	public static void main(String args[]) {
		int num1 = 1;
		int num2 = 1;
		Scanner input = new Scanner(System.in);

		// ask users to enter operator

		// ask users to enter numbers
		System.out.println("Enter first number");
		num1 = input.nextInt();

		System.out.println("Enter second number");
		num2 = input.nextInt();

		System.out.println("Addition: " + Calculator.add(num1, num2));
		System.out.println("Subtraction: " + Calculator.sub(num1, num2));
		System.out.println("Multiplication: " + Calculator.mul(num1, num2));
		System.out.println("Division: " + Calculator.divInt(num1, num2));

	}
}
