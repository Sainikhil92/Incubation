package Core_Java_HomeTasks.Task_1;

public class HomeTask_1_2 {

    public double sumOfApple(double apple1, double apple2) {
        return apple1 + apple2;
    }

    public static void main(String[] args) {
//   Daniel has 3.5 apples and Amber has 2.5 apples. How many apples do Daniel and Amber have together?
        double daniel_apple = 3.5;
        double amber_apples = 2.5;
        System.out.print(new HomeTask_1_2().sumOfApple(daniel_apple, amber_apples));
    }

}
