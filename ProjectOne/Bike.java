package ProjectOne;

public class Bike extends Vehicle {

	private int numSpeeds; // Number of speeds for the bike.
	private String bikeType; // Commuter, mountain, sports. 

	// Overloaded constructors.
	public Bike(){
		numSpeeds = 5;
		bikeType = "Regular";
	}
	
	public Bike(int a, String b){
		numSpeeds = a;
		bikeType = b;
	}
	
	// Override the toString method.
	@Override
	public String toString() {
		return "Number of speeds: " + numSpeeds +
				"\nType of bike: "+ bikeType;
	}

	// Get and sets methods.
	public int getNumSpeeds() {
		return numSpeeds;
	}

	public void setNumSpeeds(int numSpeeds) {
		this.numSpeeds = numSpeeds;
	}

	public String getBikeType() {
		return bikeType;
	}

	public void setBikeType(String bikeType) {
		this.bikeType = bikeType;
	}


public static void main(String[] args){
	Bike a = new Bike();
	Bike b = new Bike(7,"Racing");
	System.out.print(a.toString()+ "\n"+ b.toString());
	
}
}

	
