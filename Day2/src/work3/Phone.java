/**
 * 1)定义一个手机Phone类（放在com.homework包下）,类中有如下私有属性，屏幕尺寸（screenSzie），配牌（brand），处理器(cpu)，内存（memory），并提供所有成员的getXXX()和setXXX()方法。
	2)编写测试类Main（放在com.test包下）,在main方法创建Phone类的实例，为所有成员变量赋值，并且控制台输出所有值。
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
		System.out.println("手机屏幕尺寸为："+screenSzie+" 配牌为："+brand+" 处理器为："+cpu+" 内存为："+memory);
	}
	public static void main(String[] args) {
		Phone phone = new Phone("apple", "12","4G", "128g");

	}

}
