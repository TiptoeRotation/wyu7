package work6;

public class Bus implements Vehicle {
	public void start() {
		System.out.println("����ʿ");
	}
	public void stop() {
		System.out.println("ͣ��ʿ");
	}
	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.start();
		bus.stop();
	}

}
