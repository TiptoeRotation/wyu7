/**
 * 1������һ����ͨ����Vehicle�࣬���а�����
	���ԣ��ٶ�(speed)�����(size)
	����������speedUp(), ����speedDown()�������п���̨����ַ��������١�/�����١�����
   2����д������Main, main������ʵ����Vehicle����Ϊ�������Ը�ֵ������������ü��٣����ٷ�����
 */
package work1;

public class Vehicle {
	private double speed;
	private double size;
	public void speedUp() {
		System.out.println("����");
	}
	public void speedDown() {
		System.out.println("����");
	}
	public Vehicle(double speed,double size){ 
		this.speed = speed; 
		this.size = size; 
	} 
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Vehicle vehicle = new Vehicle(90, 100);
		System.out.println("��ͨ���ߵ��ٶ�Ϊ��" + vehicle.speed + "m/s");
		System.out.println("��ͨ���ߵĴ�СΪ��" + vehicle.size + "m");
		vehicle.speedUp();
		vehicle.speedDown();
	}

}
