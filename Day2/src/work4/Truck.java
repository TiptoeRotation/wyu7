package work4;

public class Truck extends Vehicles {
	private float load;
	public Truck(String brand, String color) {
		super(brand, color);
		// TODO �Զ����ɵĹ��캯�����
	}
	public void showTruck() {
		System.out.println("�������̱�Ϊ��"+brand+"����ɫΪ��"+color+"������Ϊ��"+load+"kg");
	}
	public static void main(String[] args) {
		Truck truck = new Truck("�����", "��");
		truck.load = 1000;
		truck.showTruck();
	}

}
