package ui;

import javax.swing.JOptionPane;

import models.Car;
import models.CarDealer;
import models.CarFactory;

public class Menu {

	private static boolean exit;
	private static int nDecision = 5;
	private static CarFactory carFactory = new CarFactory();
	private static CarDealer carDealer = new CarDealer();

	public static void main(String[] args) {
		printHeader();
		while (!exit) {
			int decision = getInput();
			performAction(decision);
		}
	}

	private static void printHeader() {
		JOptionPane.showMessageDialog(null, "            +-----------------+" + "\n            |  Car Dealer  |"
				+ "\n            +-----------------+");
	}

	private static int getInput() {
		int decision = -1;
		do {
			decision = Integer.parseInt(JOptionPane.showInputDialog(
					"Main menu\n----------------\n 1. Add car\n 2. Remove car\n 3. List cars\n 4. Show oldest car\n 5. Show newest car\n 0. Exit"));
			try {
			} catch (NumberFormatException e) {
			}
			if (!(0 <= decision && decision <= nDecision)) {
				JOptionPane.showMessageDialog(null, "Illegal input, numbers from 0 to " + nDecision + " only!");
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
			Car newCar = carFactory.createCar();
			carDealer.addCar(newCar);
			break;
		case 2:
			String chassiNumber = JOptionPane.showInputDialog("Enter the chassi number of the car you would like to delete");
			carDealer.removeCar(chassiNumber);
			break;
		case 3:
			carDealer.listCars();
			break;
		default:
			System.out.println("\nUnknown error...");
		}
	}
}
