package practice.q03;

public class Employee {
	private String name;

	private int age;

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void showInfo() {
		System.out.println("名前：" + name);
		System.out.println("年齢：" + age);
	}
}
