package main;

import models.Car;
import models.CarDealer;
import models.CarFactory;

public class Main {

	public static void main(String[] args) {
		CarDealer carDealer = new CarDealer();
		CarFactory carFactory = new CarFactory();

		Car car1 = new Car("BMW", "X6", "Black", "2015-10-23", "12311a");
		Car car2 = new Car("Toyota", "Camry", "Black", "2010-01-13", "121a");
		Car car3 = new Car("Audi", "R8", "Black", "2005-04-03", "1231");
		Car car4 = new Car("Volkswagen", "Amarok", "Black", "2018-12-24", "2311a");
		Car car5 = new Car("Honda", "Civic", "Black", "2018-11-23", "121a3");

		carDealer.addCar(car1);
		carDealer.addCar(car2);
		carDealer.addCar(car3);
		carDealer.addCar(car4);
		carDealer.addCar(car5);
		carDealer.addCar(car5);
		System.out.println();
		
		carDealer.listCars();

	}

}
