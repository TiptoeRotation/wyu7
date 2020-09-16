/**
 * 创建Emp类
	定义私有属性: 
	String name，int age，String gender ，int salary， Date hiredate;//入职时间
 	定义构造方法，以及属性get,set方法.
 	定义toString方法，格式如:
     	姓名:张三,年龄:25,性别:男,薪资:5000,入职时间:2020-01-11
 	定义equals方法，要求名字，年龄，性别，薪资都相同，则认为内容一致。
 	实现序列化接口，并定义版本号。
 */
package work1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Emp {
	private String name;
	private int age;
	private String gender;
	private int salary;
	private Date hiredate;
	
	public Emp(String name, int age, String gender, int salary, Date hiredate) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.hiredate = hiredate;
	}
	
	public boolean equals(Object o) {
        Emp emp = (Emp)o;
        if (this.name.equals(emp.name) && this.age == emp.age && this.gender.equals(emp.gender) && this.salary == emp.salary && this.hiredate.equals(emp.hiredate)){
            return true;
        }
        return false;
    }
	
	public String toString() {
		return "姓名:"+name+",年龄:"+age+",性别:"+gender+",薪资:"+salary+",入职时间:"+hiredate;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public static void main(String[] args) {
		Date date = new Date(2020,01,11);  // 获取当前系统时间
		Emp emp1 = new Emp("张三", 25, "男", 5000, date);
		System.out.println(emp1.toString());
	}

}
