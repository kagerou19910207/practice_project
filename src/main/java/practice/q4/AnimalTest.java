package practice.q4;

public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog("ポチ", 2, "白");
        Spallow spallow = new Spallow("チュン", 1, true); 
        
        System.out.println();
        
        dog.showInfo();
        dog.cry("ワン");
        
        System.out.println("-------------------------------");
        
        spallow.showInfo();
        spallow.cry("チュンチュン");
    }
}