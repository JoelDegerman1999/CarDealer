package models;

public class Car {

	private String brand;
	private String model;
	private String color;
	private String modelYear;
	private String chassiNumber;

	public Car(String brand, String model, String color, String modelYear, String chassiNumber) {
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.modelYear = modelYear;
		this.chassiNumber = chassiNumber;
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
	
	public String getChassiNumber() {
		return chassiNumber;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [brand = " + brand + ", model = " + model + ", color = " + color + ", modelYear = " + modelYear
				+ ", chassiNumber = " + chassiNumber + "]";
	}
	
	
}
