package OOPs_HomeTask.Task_3;

public interface Appliances {
    String getname();

    int getUnits();

}
class Fan implements Appliances {
    String name;
    static int units = 1;

    public Fan(String name) {
        this.name = name;

    }

    public String getname() {
        return name;
    }

    public int getUnits() {

        return units;
    }
}

class Tv implements Appliances {
    String name;
    static int units = 4;

    public Tv(String name) {
        this.name = name;

    }

    public String getname() {
        return name;
    }

    public int getUnits() {
        return units;
    }
}

class Light implements Appliances {
    String name;
    static int units = 2;

    public Light(String name) {
        this.name = name;


    }

    public String getname() {
        return name;
    }

    public int getUnits() {
        return units;
    }
}

class Laptop implements Appliances {
    String name;
    static int units = 3;

    public Laptop(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public int getUnits() {
        return units;
    }
}
