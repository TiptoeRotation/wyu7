/**
 * 1）定义一个交通工具Vehicle类，类中包含：
	属性：速度(speed)、体积(size)
	方法：加速speedUp(), 减速speedDown()，方法中控制台输出字符串“加速”/“减速”即可
   2）编写测试类Main, main方法中实例化Vehicle对象，为所有属性赋值并输出，最后调用加速，减速方法。
 */
package work1;

public class Vehicle {
	private double speed;
	private double size;
	public void speedUp() {
		System.out.println("加速");
	}
	public void speedDown() {
		System.out.println("减速");
	}
	public Vehicle(double speed,double size){ 
		this.speed = speed; 
		this.size = size; 
	} 
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Vehicle vehicle = new Vehicle(90, 100);
		System.out.println("交通工具的速度为：" + vehicle.speed + "m/s");
		System.out.println("交通工具的大小为：" + vehicle.size + "m");
		vehicle.speedUp();
		vehicle.speedDown();
	}

}
