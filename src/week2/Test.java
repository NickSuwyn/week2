package week2;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		char a1 = '-';
		char a2 = '-';
		char a3 = '-';
		char b1 = '-';
		char b2 = '-';
		char b3 = '-';
		char c1 = '-';
		char c2 = '-';
		char c3 = '-';
		
		boolean isWinner = false;
		
		Scanner scanner = new Scanner(System.in);
		String move = "";
		char turn = 'O';
		
		while (!isWinner) {
			System.out.println(" " + a1 + a2 + a3);
			System.out.println(" " + b1 + b2 + b3);
			System.out.println(" " + c1 + c2 + c3);
			
			System.out.print("Where would you like to place an " + turn);
			move = scanner.nextLine();
			
			if (move.equals("a1")) {
				a1 = turn;
			} else if (move.equals("a2")) {
				a2 = turn;
			} else if (move.equals("a3")) {
				a3 = turn;
			} else if (move.equals("b1")) {
				b1 = turn;
			} else if (move.equals("b2")) {
				b2 = turn;
			} else if (move.equals("b3")) {
				b3 = turn;
			} else if (move.equals("c1")) {
				c1 = turn;
			} else if (move.equals("c2")) {
				c2 = turn;
			} else if (move.equals("c3")) {
				c3 = turn;
			} else {
				System.out.println("That's not a real space. Please try again.");
				if (turn == 'O') {
					turn = 'X';
				} else {
					turn = 'O';
				}
			}
			
			isWinner = a1 == a2 && a2 == a3 && a1 != '-' ||
						b1 == b2 && b2 == b3 && b1 != '-' ||
						c1 == c2 && c2 == c3 && c1 != '-' ||
						a1 == b1 && b1 == c1 && a1 != '-' ||
						a2 == b2 && b2 == c2 && a2 != '-' ||
						a3 == b3 && b3 == c3 && a3 != '-' ||
						a1 == b2 && b2 == c3 && a1 != '-' ||
						a3 == b2 && b2 == c1 && a3 != '-';
			
			if (turn == 'O') {
				turn = 'X';
			} else {
				turn = 'O';
			}
		}
		
		if (turn == 'O') {
			turn = 'X';
		} else {
			turn = 'O';
		}
		
		System.out.println(" " + a1 + a2 + a3);
		System.out.println(" " + b1 + b2 + b3);
		System.out.println(" " + c1 + c2 + c3);
		
		System.out.println("We hava a winner! -- " + turn);
		
	}

}
