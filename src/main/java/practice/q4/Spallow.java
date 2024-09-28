package practice.q4;

public class Spallow extends Animal {
    private boolean canFly;

    public Spallow(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    public boolean getCanFly() {
        return canFly;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println(this.canFly ? "飛べます" : "飛べません");
    }

    public void cry(String cry) {
        System.out.println("鳴き声: " + cry);
    }
}