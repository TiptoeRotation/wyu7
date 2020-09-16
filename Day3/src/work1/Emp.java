/**
 * ����Emp��
	����˽������: 
	String name��int age��String gender ��int salary�� Date hiredate;//��ְʱ��
 	���幹�췽�����Լ�����get,set����.
 	����toString��������ʽ��:
     	����:����,����:25,�Ա�:��,н��:5000,��ְʱ��:2020-01-11
 	����equals������Ҫ�����֣����䣬�Ա�н�ʶ���ͬ������Ϊ����һ�¡�
 	ʵ�����л��ӿڣ�������汾�š�
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
		return "����:"+name+",����:"+age+",�Ա�:"+gender+",н��:"+salary+",��ְʱ��:"+hiredate;
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
		Date date = new Date(2020,01,11);  // ��ȡ��ǰϵͳʱ��
		Emp emp1 = new Emp("����", 25, "��", 5000, date);
		System.out.println(emp1.toString());
	}

}