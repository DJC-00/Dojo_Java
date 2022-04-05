package zoo;

public class Mammal {
    private Integer energyLevel;

    public Mammal(){
        energyLevel = 100;
    }

    protected void displayEnergy(){
        System.out.println(this.energyLevel);
    }

    protected void addEnergy(Integer val){
        this.energyLevel += val;
    }

    protected void subtractEnergy(Integer val){
        this.energyLevel -= val;
    }
}

