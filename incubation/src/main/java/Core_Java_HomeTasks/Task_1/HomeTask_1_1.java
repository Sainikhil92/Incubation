package Core_Java_HomeTasks.Task_1;

public class HomeTask_1_1 {
    public int sumOfApple(int apple1, int apple2) {
        return apple1 + apple2;
    }

    public static void main(String[] args) {
        //Daniel has 3 apples; Amber has 2 apples. How many apples do Daniel and Amber have together?
        int daniel_apple = 3;
        int amber_apples = 2;
        System.out.print(new HomeTask_1_1().sumOfApple(daniel_apple, amber_apples));
    }

}
