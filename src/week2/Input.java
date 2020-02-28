package week2;

import java.util.Scanner;

public class Input {
	
	public static void main(String... args) {
		
		int i = 1;
		int numOfAsterisks = 0;
		int numOfSpaces = 0;
		
		while (i <= 10) {
			numOfAsterisks = 0;
			numOfSpaces = 10;
			
			while (numOfSpaces >= i) {
				System.out.print(" ");
				numOfSpaces--;
			}
			
			while (numOfAsterisks < i) {
				System.out.print("* ");
				numOfAsterisks++;
			}
			i++;
			System.out.println();
		}
		
		
		
//		Scanner scanner = new Scanner(System.in);
//		
//		String userName = "";
//		String password = "";
//		boolean isLoggedIn = false;
//		int loginAttempts = 0;
		
//		for (int i = 0; i < 10; i++) {
//			
//			for (int j = 10 - i; j > 0; j--) {
//				System.out.print(" ");
//			}
//			
//			for (int j = 0; j < i + 1; j++) {
//				System.out.print("* ");
//			}
//			
//			System.out.println();
//		}
		
	
		
		
		
//		while (i <= 100) {
//			System.out.println(i);
//			i++;
//		}
		
//		while (!isLoggedIn && loginAttempts < 3) {
//			System.out.print("Enter username: ");
//			userName = scanner.nextLine();
//			System.out.print("Enter password: ");
//			password = scanner.nextLine();
//			if (userName.equals("sam123") && password.equals("12345")) {
//				isLoggedIn = true;
//			} else {
//				loginAttempts++;
//				System.out.println("Invalid username or password");
//			}
//		}
//		
//		if (loginAttempts < 3) {
//			System.out.println("Login successful!");
//		} else {
//			System.out.println("Account temporarily locked. Remember your password.");
//		}
		
		
//		do {
//			System.out.print("Enter username: ");
//			userName = scanner.nextLine();
//			System.out.print("Enter password: ");
//			password = scanner.nextLine();
//		} while (!userName.equals("sam123") || !password.equals("12345"));
//		
//		System.out.println("Login successful!");
		
	}
	

}
