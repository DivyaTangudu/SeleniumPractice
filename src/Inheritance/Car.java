package Inheritance;

public class Car extends Vehicle{

	@Override
	public void start() {
		System.out.println("Upgraded Start");
	}
	public void stop() {
		System.out.println("Upgared Stop");
	}
	public void refuel() {
		
		System.out.println("refuel");
	}
}
