package method.q02;

public class Introduce {
	public void selfIntroduce(String name) {
		System.out.println("私の名前は" + name + "です。");
	}

	public static void main(String[] args) {
		Introduce intro = new Introduce();
		intro.selfIntroduce("山田");
	}

}
