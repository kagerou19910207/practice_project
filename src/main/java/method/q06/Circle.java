package method.q06;

public class Circle {

	public double getCircleArea(double a) {
		return a * a * 3.14;
	}

	public static void main(String[] args) {
		Circle circle = new Circle();

		double a = 5.0;
		double b = circle.getCircleArea(a);

		System.out.println("半径：" + a);
		System.out.println("円の面積：" + b);
	}
}