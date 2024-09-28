package practice.q01;

public class EmployeeTest {
	public static void main(String[] args) {
		E1 e1 = new E1();

		e1.name = "山田";

		e1.age = 20;

		e1.showInfo();

		E2 e2 = new E2();
		
		System.out.println("------------");

		e2.name = "鈴木";

		e2.age = 30;

		e2.showInfo();
	}
}
