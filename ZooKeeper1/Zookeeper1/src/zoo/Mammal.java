package zoo;

public class Mammal {
    private Integer energyLevel;

    public Mammal(){
        energyLevel = 100;
    }

    protected void displayEnergy(){
        System.out.println("Energy: " + this.energyLevel);
    }

    protected Integer getEnergy(){
        return this.energyLevel;
    }

    protected void setEnergy(Integer val){
        this.energyLevel = val;
    }

    protected void addEnergy(Integer val){
        this.energyLevel += val;
    }

    protected void subtractEnergy(Integer val){
        this.energyLevel -= val;
    }

    protected void outOfEnergy(){
        System.out.println("Not Enough Energy!");
    }
}

