package OOPs_HomeTask.Task_4;

public class Chocolates implements Confectionary {


    private double weight;
    private String chocolateName;

    public Chocolates setName(String name) {
        this.chocolateName = name;
        return this;
    }

    public String getName() {
        return chocolateName;
    }

    public Chocolates setWeight(double weight) {
        this.weight = weight;
        return this;
    }

    public Double getWeight() {
        return weight;
    }
}
