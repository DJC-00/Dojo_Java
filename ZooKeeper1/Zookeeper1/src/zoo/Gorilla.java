package zoo;

public class Gorilla extends Mammal {
    private String name;

    public Gorilla(){
        name = "Harambe";
    }

    public Gorilla(String inName){
        name = inName;
    }

    public void throwThing(){
        System.out.println(name + " threw something at the crowd!");
        this.subtractEnergy(5);
    }

    public void eat(){
        System.out.println(name + " ate some bananas!");
        addEnergy(10);
    }

    public void climb(){
        System.out.println(name + " climbed a tree!");
        this.subtractEnergy(10);
    }
}