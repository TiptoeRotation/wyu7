package work4;

public class Car extends Vehicles {
	private int seats;
	public Car(String brand, String color) {
		super(brand, color);
		// TODO 自动生成的构造函数存根
	}
	public void showCar() {
		System.out.println("小汽车的商标为："+brand+"，颜色为："+color+"，座位有"+seats+"个");
	}
	public static void main(String[] args) {
		Car car = new Car("卡罗拉", "红");
		car.seats = 55;
		car.showCar();
	}

}
