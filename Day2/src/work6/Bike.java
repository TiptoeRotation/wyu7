package work6;

public class Bike implements Vehicle {
	public void start() {
		System.out.println("�ﵥ��");
	}
	public void stop() {
		System.out.println("ͣ��");
	}
	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.start();
		bike.stop();
	}

}
