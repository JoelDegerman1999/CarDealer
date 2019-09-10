package models;

import static java.time.temporal.ChronoUnit.MONTHS;

import java.time.LocalDate;

public class CarDealer {

	private Car[] carArray;

	private int counter;

	public CarDealer() {
		carArray = new Car[5];
		counter = 0;
	}

	public void addCar(Car car) {
		if (carArray.length == counter) {
			Car[] newCarArray = new Car[carArray.length + 5];
			for (int i = 0; i < counter; i++) {
				newCarArray[i] = carArray[i];
			}
			carArray = newCarArray;
		}

		carArray[counter] = car;
		counter++;
		System.out.println(carArray.length);
	}

	public void removeCar(String chassiNumber) {
		Car[] temp = new Car[carArray.length];

		for (int i = 0; i < counter; i++) {
			if (carArray[i] != null) {
				if (carArray[i].getChassiNumber() != chassiNumber) {
					temp[i] = carArray[i];
				}
			}
		}
		carArray = temp;
	}

	public void repairCar(Car car) {
		System.out.println("Car with chassinumber: " + car.getChassiNumber() + " sent for repair!");
		removeCar(car.getChassiNumber());
	}

	public long calculateAge(Car car) {
		LocalDate modelDate = LocalDate.parse(car.getManufacturingDate());
		LocalDate currentDate = LocalDate.now();
		long monthsOld = MONTHS.between(modelDate, currentDate);
		return monthsOld;
	}

	public Car showOldestCar() {
		Car oldestCar = carArray[0];
		for (int i = 1; i < counter; i++) {
			if(calculateAge(oldestCar) < calculateAge(carArray[i])){
				oldestCar = carArray[i];
			}
		}
		return oldestCar;
	}

	public Car showNewestCar() {
		Car newestCar = carArray[0];
		for (int i = 1; i < counter; i++) {
			if (calculateAge(newestCar) > calculateAge(carArray[i])) {
				newestCar = carArray[i];
			}
		}
		return newestCar;
	}

	public void listCars() {
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] != null) {
				System.out.println(carArray[i]);
			}
		}
	}
}
