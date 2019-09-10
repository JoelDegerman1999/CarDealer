package ui;

import java.util.Scanner;

public class Meny {
	private static boolean exit;
	private static int nDecision = 3;
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		printHeader();

		while (!exit) {
			printMenu();
			int decision = getInput();
			performAction(decision);
		}
	}

	private static void printHeader() {
		System.out.println("+----------+");
		System.out.println("|  Header  |");
		System.out.println("+----------+");
	}

	private static void printMenu() {
		System.out.println("\nMain menu");
		System.out.println("1. Option");
		System.out.println("2. Option");
		System.out.println("3. Option");
		System.out.println("0. Exit");
	}

	private static int getInput() {
		int decision = -1;
		do {
			System.out.print("Enter decision: ");
			try {
				decision = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
			}
			if (!(0 <= decision && decision <= nDecision)) {
				System.out.println("Illegal input, numbers from 0 to " + nDecision + " only!");
			}
		} while (!(0 <= decision && decision <= nDecision));
		return decision;
	}

	private static void performAction(int decision) {
		switch (decision) {
		case 0:
			System.out.println("\nTerminating process...");
			exit = true;
			break;
		case 1:
			System.out.println("\nCalling option 1...");
			break;
		case 2:
			System.out.println("\nCalling option 2...");
			break;
		case 3:
			System.out.println("\nCalling option 3...");
			break;
		default:
			System.out.println("\nUnknown error...");
		}
	}
}

