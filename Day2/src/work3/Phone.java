/**
 * 1)����һ���ֻ�Phone�ࣨ����com.homework���£�,����������˽�����ԣ���Ļ�ߴ磨screenSzie�������ƣ�brand����������(cpu)���ڴ棨memory�������ṩ���г�Ա��getXXX()��setXXX()������
	2)��д������Main������com.test���£�,��main��������Phone���ʵ����Ϊ���г�Ա������ֵ�����ҿ���̨�������ֵ��
 */
package work3;

public class Phone {
	private String screenSzie;
	private String brand;
	private String cpu;
	private String memory;
	
	public String getScreenSzie() {
		return screenSzie;
	}

	public void setScreenSzie(String screenSzie) {
		this.screenSzie = screenSzie;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}
	public Phone(String screenSzie, String brand, String cpu, String memory) {
		System.out.println("�ֻ���Ļ�ߴ�Ϊ��"+screenSzie+" ����Ϊ��"+brand+" ������Ϊ��"+cpu+" �ڴ�Ϊ��"+memory);
	}
	public static void main(String[] args) {
		Phone phone = new Phone("apple", "12","4G", "128g");

	}

}
