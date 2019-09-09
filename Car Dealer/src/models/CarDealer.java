package models;

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
			for (int i = 0; i < carArray.length; i++) {
				newCarArray[i] = carArray[i];
			}
			carArray = newCarArray;
		}

		carArray[counter] = car;
		counter++;
	}

	public void removeCar(String chassiNumber) {
		Car[] temp = new Car[carArray.length];

		for (int i = 0; i < carArray.length; i++) {
			if (counter >= carArray.length) {
				counter--;
			}

			if(carArray[i] != null) {
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

	public void listCars() {
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] != null) {
				System.out.println(carArray[i]);
			}
		}
	}
}
