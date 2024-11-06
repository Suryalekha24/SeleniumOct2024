package week2.day3;

public class Auto extends Vehicle {
	
	public void applyMeter(){
		System.out.println("pay amt-->auto");
	}
	public static void main(String[] args) {
		Auto a= new Auto();
		a.applyMeter();
		a.applyBrake();
	}
}
