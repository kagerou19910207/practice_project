package method.q05;

public class Triangle {

	public int getTriangleArea(int a, int b) {
		return (a * b) / 2;
	}

	public static void main(String[] args) {
		Triangle triangle = new Triangle();

		int a = 8;
		int b = 5;

		int c = triangle.getTriangleArea(a, b);

		System.out.println("底辺：" + a);
		System.out.println("高さ：" + b);
		System.out.println("三角形の面積：" + c);
	}
}
