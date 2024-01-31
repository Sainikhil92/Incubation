package OOPs_HomeTask.Task_4;

public class Sweets implements Confectionary {

    private double weight;
    private String sweetName;

    public Sweets setName(String name) {
        this.sweetName = name;
        return this;
    }

    public Sweets setWeight(double weight) {
        this.weight = weight;
        return this;
    }

    public Double getWeight() {
        return weight;

    }

    public String getName() {
        return sweetName;
    }
}
