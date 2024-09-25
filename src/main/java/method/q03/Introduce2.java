package method.q03;

public class Introduce2 {
	public void selfIntroduce(String name, int age) {
		System.out.println("私の名前は" + name + "です。年齢は" + age + "歳です。");
	}

	public static void main(String[] args) {
		Introduce2 intro = new Introduce2();
		intro.selfIntroduce("山田", 25);
	}
}