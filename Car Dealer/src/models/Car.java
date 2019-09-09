package models;

public class Car {

	private String brand;
	private String model;
	private String color;
	private String modelYear;

	public Car(String brand, String model, String color, String modelYear) {
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.modelYear = modelYear;
	}

	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}

	public String getModel() {
		return model;
	}

	public String getModelYear() {
		return modelYear;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
