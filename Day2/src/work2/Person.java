/**
 * ��дJava����������ʾ�˵����������䡣 
	1������һ��Person�࣬������Ӧ��������˽�����ԣ�����(name)������(age)���Լ��Ա�(gender)��
	2�����岻ͬ�����б�Ĺ��췽������ʼ��������̨��ӡ�����
	4)��д������Main,��main�����и��ݲ�ͬ���صĹ��췽�����ֱ𴴽�Person���ʵ��
 */
package work2;

public class Person {
	public Person(String name, int age) {
		System.out.println(name+"������Ϊ��"+age);
	} 
	public Person(String name, char gender) {
		System.out.println(name+"���Ա�Ϊ��"+gender);
	} 
	public static void main(String[] args) {
		Person h = new Person("С��", 12);
		Person s = new Person("С��", 'Ů');
	}

}
