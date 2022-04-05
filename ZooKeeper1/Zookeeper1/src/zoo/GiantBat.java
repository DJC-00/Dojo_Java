package zoo;

public class GiantBat extends Mammal {
    private String name;

    public GiantBat(){
        this.name = "Dracula";
        this.setEnergy(300);
    }

    public GiantBat(String inName){
        this.name = inName;
        this.setEnergy(300);
    }

    public void attack(){
        System.out.println(name + " tries attacking!");
        Integer eng = this.getEnergy();
        if ((eng - 100) < 0)
            this.outOfEnergy();
        else{
            System.out.println(name + " starts attacking random strangers!");
            this.subtractEnergy(100);
        }
        
    }

    public void eat(){
        System.out.println(name + " ate a person!");
        addEnergy(25);
    }

    public void fly(){
        
        Integer eng = this.getEnergy();
        System.out.println(name + " tries flying");
        if ((eng - 50) < 0)
            this.outOfEnergy();
        else{
            System.out.println(name + " flew away!");
            this.subtractEnergy(50);
        }
    }
}