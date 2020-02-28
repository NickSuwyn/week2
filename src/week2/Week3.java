package week2;

import java.util.Scanner;

public class Week3 {
	
	public static void main(String... args) {
		
		double[] grades = {79.4, 99.2, 98.4};
		double[] electricBills = {125.56, 307.89, 420.12, 70.89};
		
		System.out.println(calculateAverage(electricBills));
		System.out.println(calculateAverage(grades));
		
		System.out.println(power(3, 0));
		
//		String greeting = doSomething();
		
		sayHello(doSomething(), "sam");
		
		greetMultipleTimes("Hey", "You", 13);
		
	}
	
	public static void greetMultipleTimes(String greeting, String name, int numberOfTimes) {
		for (int i = 0; i < numberOfTimes; i++) {
			System.out.print(i);
			sayHello(greeting, name);
		}
	}
	
	public static String doSomething() {
		return "hello";
	}
	
	public static int power(int base, int exponent) {
		int product = 1;
		for (int i = 0; i < exponent; i++) {
			product = product * base;
		}
		return product;
	}
	
	public static double calculateAverage(double[] array) {
		double sum = 0;
		
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		double average = sum / array.length;
		return average;
	}
	
	public static void sayHello(String greeting, String name) {
		System.out.println(greeting + " " + name);
	}
	
	public static int sumNumbers(int x, int y) {
		return x + y;
	}

}
