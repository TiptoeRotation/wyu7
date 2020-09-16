/**
 * 编写Java程序用于显示人的姓名和年龄。 
	1）定义一个Person类，该类中应该有两个私有属性，姓名(name)和年龄(age)，以及性别(gender)。
	2）定义不同参数列表的构造方法并初始化，控制台打印输出。
	4)编写测试类Main,在main方法中根据不同重载的构造方法，分别创建Person类的实例
 */
package work2;

public class Person {
	public Person(String name, int age) {
		System.out.println(name+"的年龄为："+age);
	} 
	public Person(String name, char gender) {
		System.out.println(name+"的性别为："+gender);
	} 
	public static void main(String[] args) {
		Person h = new Person("小花", 12);
		Person s = new Person("小花", '女');
	}

}
