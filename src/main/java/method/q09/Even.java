package method.q09;

public class Even {

	public boolean checkEven(int number) {
		return number % 2 == 0;
	}

	public static void main(String[] args) {
		Even evenChecker = new Even();

		int number = 10;

		if (evenChecker.checkEven(number)) {
			System.out.println(number + "は偶数です。");
		} else {
			System.out.println(number + "は奇数です。");
		}
	}
}
