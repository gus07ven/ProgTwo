package ProjectOne;

public class MotorBike extends Bike {

	private int horsePower; // Number of horse power.

	// Override the toString method.
	@Override
	public String toString() {
		return "Number of horsePower: " + horsePower;
	}

	// Getter and setters.
	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public static void main(String[] args) {
		MotorBike killer = new MotorBike();
		killer.setBikeType("Racing");
		killer.setColor("Yellow");
		killer.setMedium("Land");
		killer.setModel("Kawasaki");
		killer.setNumSpeeds(10);
		killer.setPrice(25000);
		killer.setYear(2014);
		killer.setHorsePower(500);

		System.out.print("The killer motorbike properties are:\n"
				+ "Bike type: "+ killer.getBikeType()
				+ "\nColor: "+ killer.getColor()
				+ "\nMedium: "+ killer.getMedium()
				+ "\nModel: "+ killer.getModel()
				+ "\nHorsePower: "+ killer.getHorsePower());
	}
}

