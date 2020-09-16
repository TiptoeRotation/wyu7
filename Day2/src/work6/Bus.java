package work6;

public class Bus implements Vehicle {
	public void start() {
		System.out.println("¿ª°ÍÊ¿");
	}
	public void stop() {
		System.out.println("Í£°ÍÊ¿");
	}
	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.start();
		bus.stop();
	}

}
