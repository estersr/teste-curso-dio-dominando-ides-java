package com.dio.calculadora;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double a, b;
		
		System.out.println("Type the fist value: ");
		a = scan.nextInt();
		System.out.println("Type the second value: ");
		b = scan.nextInt();
		
		double addition = addition(a,b) ;
		double subtraction = subtraction(a,b);
		double division = division(a,b);
		double multiplication = multiplication(a,b);
		
	
		System.out.println("addition " + addition);
		System.out.println("subtraction " + subtraction);
		System.out.println("division " + division);
		System.out.println("multiplication " + multiplication);
		
	}

	public static double addition(double a, double b) {
		return a + b;
	}

	public static double subtraction(double a, double b) {
		return a - b;
	}

	public static double division(double a, double b) {
		return a / b;
	}

	public static double multiplication(double a, double b) {
		return a * b;
	}

}
