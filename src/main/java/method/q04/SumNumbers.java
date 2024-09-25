package method.q04;

public class SumNumbers {

	public int calculateSum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		SumNumbers sumNumbers = new SumNumbers();

		int a = 3;
		int b = 2;

		int c = sumNumbers.calculateSum(a, b);

		System.out.println("第一引数：" + a);
		System.out.println("第二引数：" + b);
		System.out.println("加算結果：" + c);

	}
}
