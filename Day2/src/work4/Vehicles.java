/**
 * 1)����һ����ͨ����Vehicles�࣬������Ӧ����
		a.String���͵ĳ�Ա�����̱�(brand)����ɫ(color), 
		b.��ӳ�Ա������ʻrun���ڿ���̨��ʾ�����Ѿ�������
		c.��д���췽����ʼ�����г�Ա����
		d.��ӳ�Ա������ʾ������ϢshowInfo���ڿ���̨��ʾ�̱����ɫ��
	2)��дCarС������̳���Vehicles�� 
		a.����int�ͳ�Ա������λ(seats )
		b.��д���췽����ʼ�����г�Ա���ԣ���ʾ���ø��๹�췽��
		c.���ӳ�Ա����showCar,�ڿ���̨��ʾС��������Ϣ
	3)��дTruck������̳���Vehicles�� 
		a.����float�ͳ�Ա��������(load)
		b.��д���췽����ʼ�����г�Ա���ԣ���ʾ���ø��๹�췽��
		c.���ӳ�Ա����showTruck���ڿ���̨��ʾ��������Ϣ
	4)��д������Main,��main������ʵ�������ࡣ
 */
package work4;

public class Vehicles {
	public String brand;
	public String color;
	public void run() {
		System.out.println("���Ѿ�����");
	}
	public Vehicles(String brand, String color) {
		this.brand = brand;
		this.color = color;
	}
	public static void main(String[] args) {
		

	}
}

