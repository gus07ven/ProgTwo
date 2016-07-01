package ProjectOne;

public class Vehicle {

	private String medium; // Mediums are land, air, sea.
	private String model; // Vehicle brand.
	private String color; // Original color of the vehicle.
	private int year; // Manufacture year.
	private double price; // Sell price.

	// Set and get methods for variables.

	public String getMedium() {
		return medium;
	}

	public void setMedium(String medium) {
		this.medium = medium;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


public static void main(String[] args){
	Vehicle beast = new Vehicle();
	beast.setColor("Red");
	beast.setMedium("Air");
	beast.setModel("Lockhead Martin");
	beast.setPrice(1000000);
	beast.setYear(2015);
	System.out.print("Beast is a vehicle with the following characteristics: \n" 
			+ "Color: "+ beast.getColor() + "\nMedium: "+ beast.getMedium()+
			"\nModel: "+ beast.getModel() + "\nPrice: "+ beast.getPrice() +
			"\nYear: "+ beast.getYear());
}
}