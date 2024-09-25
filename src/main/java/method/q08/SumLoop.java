package method.q08;

public class SumLoop {

	public static void main(String[] args) {
		int minValue = 1;
		int maxValue = 100;

		int sum = sumLoop(minValue, maxValue);

		System.out.println("最小値：" + minValue);
		System.out.println("最大値：" + maxValue);
		System.out.println("加算結果：" + sum);
	}

	public static int sumLoop(int minValue, int maxValue) {
		int sum = 0;
		for (int i = minValue; i <= maxValue; i++) {
			sum += i;
		}
		return sum;
	}
}