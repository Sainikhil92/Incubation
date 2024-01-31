package Core_Java_HomeTasks.Task_2;

public class Calculator {

    double input1, input2;

    public Calculator(double input1, double input2) {
        this.input1 = input1;
        this.input2 = input2;
    }

    public double add() {
        return input1+input2;

    }
    public double sub() {
        return input1-input2;

    }
    public double mul() {
        return input1*input2;

    }
    public double div() {
        return input1/input2;

    }
    public double rem() {
        return input1%input2;
    }
}
