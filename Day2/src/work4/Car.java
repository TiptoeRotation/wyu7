package work4;

public class Car extends Vehicles {
	private int seats;
	public Car(String brand, String color) {
		super(brand, color);
		// TODO �Զ����ɵĹ��캯�����
	}
	public void showCar() {
		System.out.println("С�������̱�Ϊ��"+brand+"����ɫΪ��"+color+"����λ��"+seats+"��");
	}
	public static void main(String[] args) {
		Car car = new Car("������", "��");
		car.seats = 55;
		car.showCar();
	}

}
