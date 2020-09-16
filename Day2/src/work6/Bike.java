package work6;

public class Bike implements Vehicle {
	public void start() {
		System.out.println("Æïµ¥³µ");
	}
	public void stop() {
		System.out.println("Í£³µ");
	}
	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.start();
		bike.stop();
	}

}
