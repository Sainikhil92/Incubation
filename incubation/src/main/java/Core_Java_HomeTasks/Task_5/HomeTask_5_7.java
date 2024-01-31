package Core_Java_HomeTasks.Task_5;

public class HomeTask_5_7 {
    public int sumLimit(int a, int b) {


        if (String.valueOf(Math.abs(a + b)).length() == String.valueOf(a).length()) {
            return a + b;
        } else {

            return a;
        }
    }
}
