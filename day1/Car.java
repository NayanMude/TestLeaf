package week1.day1;

public class Car {
	
	
	public void driveCar() {
		System.out.println("Drives the car.");
	}
	
	
	public void applyBrake() {
		System.out.println("Applies the brakes.");
	}
	
	
	public void soundHorn() {
		System.out.println("Blows the Horn.");
	}
	
	
	public void isPuncture() {
		System.out.println("Checks the Puncture in the car.");
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		
		car.driveCar();
		car.applyBrake();
		car.soundHorn();
		car.isPuncture();
	}
	

}
