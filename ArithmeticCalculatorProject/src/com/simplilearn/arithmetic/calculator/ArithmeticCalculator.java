package com.simplilearn.arithmetic.calculator;

import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		

		Scanner num1 = new Scanner(System.in);
		Scanner num2 = new Scanner(System.in);
		
		System.out.println("Enter the numbers for calculation");
		
			
		int number1 = num1.nextInt();
		int number2 = num2.nextInt();
		
		System.out.println("First number is: " + number1);
		System.out.println("First number is: " + number2);

		ArithmeticCalculator arithCalc = new ArithmeticCalculator();
		
		int sum = arithCalc.addition(number1, number2);
		int difference = arithCalc.subtraction(number1, number2);
		int product = arithCalc.multiplication(number1, number2);
		double quotient = arithCalc.division(number1,  number2);
		
		System.out.println("The Results Are: ");
		
		System.out.println(number1 + " + " + number2 + " = " + sum);
		System.out.println(number1 + " - " + number2 + " = " + difference);
		System.out.println(number1 + " * " + number2 + " = " + product);
		System.out.println(number1 + " / " + number2 + " = " + quotient);
		
		
	}
	//Addition
	public int addition(int num1 , int num2) {
		return num1 + num2;
	}
	//Subtraction
	public int subtraction(int num1 , int num2) {
		return num1 - num2;
	}
	//Multiplication
	public int multiplication(int num1, int num2) {
		return num1 * num2;
	}
	//Division
	public double division(int num1, int num2) {
		return num1 / num2;
	}

}
