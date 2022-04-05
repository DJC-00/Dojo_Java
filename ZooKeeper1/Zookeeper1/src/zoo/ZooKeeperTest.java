package zoo;

public class ZooKeeperTest {
    public static void main(String[] args) {
        Gorilla g1 = new Gorilla();
        g1.throwThing();
        g1.displayEnergy();
        System.out.println(",.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.");
        g1.climb();
        g1.displayEnergy();
        System.out.println(",.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.");
        g1.eat();
        g1.displayEnergy();
        System.out.println(",.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.");

        GiantBat b1 = new GiantBat();
        b1.attack();
        b1.displayEnergy();
        System.out.println(",.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.");
        b1.eat();
        b1.displayEnergy();
        System.out.println(",.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.");
        b1.attack();
        b1.displayEnergy();
        System.out.println(",.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.");
        b1.attack();
        b1.displayEnergy();
        System.out.println(",.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.");
        b1.eat();
        b1.displayEnergy();
        System.out.println(",.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.");
        b1.fly();
        b1.displayEnergy();
        System.out.println(",.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.");
        b1.fly();
        b1.displayEnergy();
        System.out.println(",.,.,.,.,.,.,.,.,.,.,.,.,.,.,.,.");
    }
}
