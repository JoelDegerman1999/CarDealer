package models;

import java.util.Scanner;

public class CarFactory {

	private String model, modelYear, color, brand, chassiNumber;
	Scanner sc = new Scanner(System.in);

	public Car createCar() {
		System.out.print("Enter brand: ");
		brand = sc.nextLine();
		System.out.print("Enter model: ");
		model = sc.nextLine();
		System.out.print("Enter color: ");
		color = sc.nextLine();
		System.out.print("Ener model year: ");
		modelYear = sc.nextLine();
		System.out.print("Enter chassiNumber: ");
		chassiNumber = sc.nextLine();

		return new Car(brand, model, color, modelYear, chassiNumber);
	}
}
