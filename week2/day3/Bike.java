package week2.day3;

public class Bike extends Auto {
	
	public void noOfWheels() {
		System.out.println("2-->Bike");
	}
	public void applyMeter(){
		System.out.println("amount paid-overridden");
	}
	public static void main(String[] args) {
		Bike b = new Bike();
		b.noOfWheels();
		b.applyMeter();
	}

}
