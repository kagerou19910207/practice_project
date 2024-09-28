package practice.q4;

public class Dog extends Animal {
    private String furColor;

    public Dog(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("毛の色：" + this.furColor);
    }

    public void cry(String cry) {
        System.out.println("鳴き声：" + cry);
    }
}