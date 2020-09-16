package work4;

public class Truck extends Vehicles {
	private float load;
	public Truck(String brand, String color) {
		super(brand, color);
		// TODO 自动生成的构造函数存根
	}
	public void showTruck() {
		System.out.println("卡车的商标为："+brand+"，颜色为："+color+"，载重为："+load+"kg");
	}
	public static void main(String[] args) {
		Truck truck = new Truck("凤凰牌", "绿");
		truck.load = 1000;
		truck.showTruck();
	}

}
