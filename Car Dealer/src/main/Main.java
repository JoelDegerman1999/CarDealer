package main;

import models.Car;
import models.CarDealer;
import models.CarFactory;

public class Main {

	public static void main(String[] args) {
		CarDealer carDealer = new CarDealer();
		CarFactory carFactory = new CarFactory();

		Car car1 = new Car("BMW", "X6", "Black", "2017", "12311a");
		Car car2 = new Car("Toyota", "Camry", "Black", "2010", "121a");
		Car car3 = new Car("Audi", "R8", "Black", "2019", "1231");
		Car car4 = new Car("Volkswagen", "Amarok", "Black", "2015", "2311a");
		Car car5 = new Car("Honda", "Civic", "Black", "2011", "121a3");
		Car car6 = carFactory.createCar();

		carDealer.addCar(car1);
		carDealer.addCar(car2);
		carDealer.addCar(car3);
		carDealer.addCar(car4);
		carDealer.addCar(car5);
		carDealer.addCar(car6);

		carDealer.listCars();
		carDealer.repairCar(car2);
		System.out.println();
		carDealer.listCars();

	}

}
